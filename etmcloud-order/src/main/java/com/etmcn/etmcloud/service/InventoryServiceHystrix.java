package com.etmcn.etmcloud.service;


import com.etmcn.etmcloud.service.InventoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class InventoryServiceHystrix implements InventoryService {
    @Override
    public String outbound(String orderNo) {
        log.info("熔断");
        return "error";
    }
}
