package com.sharism.resource_server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@MapperScan("com.sharism.resource_server.mapper")//将项目中对应的mapper类的路径加进来就可以了
@SpringBootApplication
public class ResourceServerApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ResourceServerApplication.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(ResourceServerApplication.class, args);
	}
}
