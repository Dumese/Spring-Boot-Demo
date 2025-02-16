package com.example.demo.entity;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * <p>
 * 用户信息表
 * </p>
 *
 * @author Dumese
 * @since 2025-02-15
 */
@Getter
@Setter
@ToString
public class User implements Serializable {

    @Serial
    private static final long serialVersionUID = -8689495438088005758L;

    /**
     * 用户id
     */
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 邮件
     */
    private String email;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 密码
     */
    private String password;

    /**
     * 状态（1~启用、2~禁用）
     */
    private Byte status;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 创建人
     */
    private String createName;

    /**
     * 备注
     */
    private String remark;
}
