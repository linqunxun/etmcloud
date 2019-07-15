package com.etmcn.etmcloud;

import com.etmcn.etmcloud.service.InventoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Slf4j
@RequestMapping("/orders")
@RestController
public class OrderController {

   @Autowired
   private InventoryService inventoryService;

    @GetMapping("/add")
    public String orderAdd(String buyer){
        String orderNo = UUID.randomUUID().toString();
        inventoryService.outbound(orderNo);
        return String.format("%s的订单处理成功！订单号为：%s。", buyer, orderNo);
    }

}
