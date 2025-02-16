package com.example.demo.utils;

import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.security.core.Authentication;

import java.util.Date;
import java.util.UUID;

@Log4j2
@Component
public class JwtUtils {
    @Value("${security.jwt.expire}")
    private Long expire;

    @Value("${security.jwt.secret}")
    private String secret;

    @Value("${spring.application.name}")
    private String subject;

    // 生成令牌
    public String generateToken(Authentication authentication) {
        String username = authentication.getName();
        Date currentDate = new Date();
        Date expireDate = new Date(currentDate.getTime() + expire);
        return Jwts.builder()
                .header()
                .keyId(UUID.randomUUID().toString())
                .and()
                .claim("username", username)
                .expiration(expireDate)
                .issuedAt(currentDate)
                .subject(subject)
                .signWith(Keys.hmacShaKeyFor(secret.getBytes()), Jwts.SIG.HS256)
                .compact();
    }

    // 从令牌获取用户名
    public String getUsername(String token) {
        Jws<Claims> claims = Jwts.parser()
                .verifyWith(Keys.hmacShaKeyFor(secret.getBytes()))
                .build()
                .parseSignedClaims(token);
        return claims.getPayload().get("username").toString();
    }

    // 验证令牌
    public boolean validateToken(String token) {
        try {
            Jwts.parser()
                    .verifyWith(Keys.hmacShaKeyFor(secret.getBytes()))
                    .build()
                    .parse(token);
            return true;
        } catch (MalformedJwtException e) {
            log.error("Invalid JWT token: {}", e.getMessage());
        } catch (ExpiredJwtException e) {
            log.error("JWT token is expired: {}", e.getMessage());
        } catch (UnsupportedJwtException e) {
            log.error("JWT token is unsupported: {}", e.getMessage());
        } catch (IllegalArgumentException e) {
            log.error("JWT claims string is empty: {}", e.getMessage());
        }
        return false;
    }
}
