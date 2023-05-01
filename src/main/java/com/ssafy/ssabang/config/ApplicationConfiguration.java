package com.ssafy.ssabang.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.ssafy.ssabang.*.model.mapper")
public class ApplicationConfiguration {

}
