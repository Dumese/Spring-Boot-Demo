-- `data`.`role` definition

CREATE TABLE `role`
(
    `id`        bigint unsigned NOT NULL COMMENT '角色id',
    `role_name` varchar(64)      DEFAULT NULL COMMENT '角色名称',
    `desc`      varchar(100)     DEFAULT NULL COMMENT '备注',
    `status`    tinyint unsigned DEFAULT '1' COMMENT '状态（1~启用、2~禁用）',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT ='角色表';