package cn.itcast.service;

import cn.itcast.service.mapper.UserMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("cn.itcast.service.mapper")
@EnableDiscoveryClient
public class ItcastServiceProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItcastServiceProviderApplication.class, args);
	}

}
