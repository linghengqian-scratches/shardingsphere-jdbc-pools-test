package com.lingh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.lingh.mapper")
@SpringBootApplication
public class ShardingsphereJdbcPoolsTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingsphereJdbcPoolsTestApplication.class, args);
    }

}
