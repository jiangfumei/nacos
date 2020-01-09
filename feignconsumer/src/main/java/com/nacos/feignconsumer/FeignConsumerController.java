package com.nacos.feignconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignConsumerController {

    @Autowired
    FeignClient feignClient;

    @GetMapping(value = "/hi-fegin")
    public String hiFeign(){
        return feignClient.hello("feign");
    }

}
