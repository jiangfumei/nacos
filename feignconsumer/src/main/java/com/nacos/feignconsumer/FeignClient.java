package com.nacos.feignconsumer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.cloud.openfeign.FeignClient(value = "nacos-provider")
public interface FeignClient {

    @GetMapping("/hello")
    String hello(@RequestParam(value = "name", defaultValue = "forezp", required = false) String name);
}
