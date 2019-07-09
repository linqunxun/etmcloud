package com.etmcn.etmcloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class OrderController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/orders/add")
    public Object add(String buyer){
        return String.format("订单服务%s：\r\n添加%s的订单成功，订单号为：%s",port, buyer, UUID.randomUUID().toString());
    }

}
