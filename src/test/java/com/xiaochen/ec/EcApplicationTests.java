package com.xiaochen.ec;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@EnableDiscoveryClient
@ComponentScan(basePackages={"com.nome.ec.*"})
public class EcApplicationTests {

	@Test
	public void contextLoads() {
		System.out.printf("===============>> test");
	}

}
