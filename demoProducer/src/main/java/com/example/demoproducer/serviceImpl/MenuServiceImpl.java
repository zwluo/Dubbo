package com.example.demoproducer.serviceImpl;

import com.example.untitledInterface.MenuService;
import org.apache.dubbo.config.annotation.DubboService;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;

@DubboService
public class MenuServiceImpl implements MenuService {

    @Override
    public String getMenu() {
        String menu = "Hello World! " + LocalDate.now();
        System.out.println(menu);
        return menu;
    }
}
