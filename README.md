### 使用 mybatis-spring-boot-starter ，很方便的搭建项目（完全使用注解）
1. 使用 IDEA 编辑期的 Spring initializr 创建项目，选择 web、mysql、MyBatis 三个模块
2. 新建 entity 和 mapper
3. 配置 application.properties
4. 测试

### mysql数据库需要做的操作
1. mysql中新建数据库(schema):mybatis
2. 执行创建table user和插入数据的操作：
```
Create TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(50) DEFAULT NULL,
  `userAge` int(11) DEFAULT NULL,
  `userAddress` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
```
```
Insert INTO `user` VALUES ('1', 'summer', '100', 'shanghai,pudong');
```

* springboot会自动加载spring.datasource.*相关配置，数据源就会自动注入到sqlSessionFactory中，sqlSessionFactory会自动注入到Mapper中，你一切都不用管了，直接拿起来使用就行了。

* 参考：http://blog.csdn.net/gebitan505/article/details/54929287