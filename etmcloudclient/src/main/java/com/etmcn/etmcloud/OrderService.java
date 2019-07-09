package com.etmcn.etmcloud;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="order-service",fallback = OrderServiceHystrix.class)
public interface OrderService {

    @RequestMapping(method = RequestMethod.GET, value = "/orders/add")
    String add(@RequestParam String buyer);

}
