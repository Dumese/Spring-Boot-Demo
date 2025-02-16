package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serial;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * <p>
 * 用户角色关系表
 * </p>
 *
 * @author Dumese
 * @since 2025-02-16
 */
@Getter
@Setter
@ToString
@TableName("user_role")
public class UserRole implements Serializable {

    @Serial
    private static final long serialVersionUID = 6610375311979506382L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 角色id
     */
    private Long roleId;

    /**
     * 状态（1~启用、2~禁用）
     */
    private Byte status;
}
