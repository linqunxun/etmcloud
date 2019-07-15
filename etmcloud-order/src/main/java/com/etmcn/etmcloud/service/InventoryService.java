package com.etmcn.etmcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="inventory-service",fallback = InventoryServiceHystrix.class)
public interface InventoryService {

    @RequestMapping(method = RequestMethod.PUT, value = "/inventories/outbound")
    String outbound(@RequestParam String orderNo);

}
