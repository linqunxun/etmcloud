package com.etmcn.etmcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class InventoryController {

    @Value("${server.port}")
    private String port;

    @PutMapping("/inventories/outbound")
    public Object outbound(String orderNo){
        log.info(String.format("\r\n库存服务%s：\r\n订单号：%s的库存扣减成功",port, orderNo));
        return "success";
    }

}
