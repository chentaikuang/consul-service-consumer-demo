package com.xiaochen.ec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.xiaochen.ec.*"})
@EnableFeignClients
@EnableDiscoveryClient
public class EcApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcApplication.class, args);
	}
}
