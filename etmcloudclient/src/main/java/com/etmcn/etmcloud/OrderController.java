package com.etmcn.etmcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/orders")
@RestController
public class OrderController {

   @Autowired
   private OrderService orderService;

    @GetMapping("/add")
    public String orderAdd(String buyer){

        return orderService.add(buyer);
    }

}
