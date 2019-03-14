# mvc-plus
初始化spring boot工程 多环境配置--swaggerUI--MybatisPlus
SQL:
CREATE TABLE `sys_admin` (
  `id` varchar(64) NOT NULL COMMENT 'PK',
  `username` varchar(50) NOT NULL COMMENT '用户名',
  `password` varchar(64) NOT NULL COMMENT '密码',
  `status` int(1) NOT NULL COMMENT '用户状态',
  `head_img` text COMMENT '头像',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert  into `sys_admin`(`id`,`username`,`password`,`status`,`head_img`,`create_time`) values 
('1','root','root',1,'1','2019-03-14 19:00:00');
