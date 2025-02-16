-- `data`.`user` definition

CREATE TABLE `user`
(
    `id`          bigint unsigned NOT NULL COMMENT '用户id',
    `username`    varchar(64)                                                   DEFAULT NULL COMMENT '用户名',
    `email`       varchar(64)                                                   DEFAULT NULL COMMENT '邮件',
    `phone`       varchar(16)                                                   DEFAULT NULL COMMENT '手机号',
    `password`    varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT '123456' COMMENT '密码',
    `status`      tinyint                                                       DEFAULT '1' COMMENT '状态（1~启用、2~禁用）',
    `create_time` timestamp       NULL                                          DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `create_name` varchar(255)                                                  DEFAULT NULL COMMENT '创建人',
    `desc`        varchar(255)                                                  DEFAULT NULL COMMENT '备注',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci COMMENT ='用户信息表';