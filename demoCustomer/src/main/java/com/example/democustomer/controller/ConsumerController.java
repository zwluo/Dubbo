package com.example.democustomer.controller;

import com.example.untitledInterface.MenuService;
//import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @DubboReference(check = false)
    private MenuService menuService;

    @GetMapping("/getMenu")
    public String getMenu() {
        //return "ddd";
        return menuService.getMenu();
    }

}
