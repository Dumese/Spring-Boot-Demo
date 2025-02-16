-- `data`.user_role definition

CREATE TABLE `user_role`
(
    `id`      bigint unsigned NOT NULL AUTO_INCREMENT,
    `user_id` bigint unsigned DEFAULT NULL COMMENT '用户id',
    `role_id` bigint unsigned DEFAULT NULL COMMENT '角色id',
    `status`  tinyint unsigned DEFAULT NULL COMMENT '状态（1~启用、2~禁用）',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='用户角色关系表';