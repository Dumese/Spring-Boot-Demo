package com.example.demo.entity;

import java.io.Serial;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * <p>
 * 角色表
 * </p>
 *
 * @author Dumese
 * @since 2025-02-16
 */
@Getter
@Setter
@ToString
public class Role implements Serializable {

    @Serial
    private static final long serialVersionUID = -385678716810905729L;

    /**
     * 角色id
     */
    private Long id;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 备注
     */
    private String remark;

    /**
     * 状态（1~启用、2~禁用）
     */
    private Byte status;
}
