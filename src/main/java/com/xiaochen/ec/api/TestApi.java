package com.xiaochen.ec.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient("service-provider-demo")
public interface TestApi {

    @GetMapping("/test/demo")
    String demo(String tips);
}