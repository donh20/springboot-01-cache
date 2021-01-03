package com.ncamc.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
* 1、导入数据库文件创建department和employee表
* 2、创建javaBean封装数据
* 3、整合MyBatis数据库
*   3.1、配置数据源信息
*   3.2、使用注解版MyBatis；
*       1）MapperScan指定需要扫描的mapper接口所在的包
* 4、使用缓存
*   4.1、开启基于注解的缓存@EnableCache
*   4.2、标注缓存注解即可
*       @Cacheable,@CacheEvict,@CachePut
*
* */
@MapperScan("com/ncamc/springboot/cache/bean/mapper")
@SpringBootApplication
public class Springboot01CacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot01CacheApplication.class, args);
    }

}
