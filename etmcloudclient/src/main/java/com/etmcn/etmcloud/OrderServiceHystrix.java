package com.etmcn.etmcloud;


import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class OrderServiceHystrix implements OrderService {
    @Override
    public String add(String buyer) {
        log.info("熔断");
        return "error";
    }
}
