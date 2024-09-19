package com.example.demo.Controller;

import com.example.demo.Model.Dashboard;
import com.example.demo.Model.Home;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.UUID;

@RestController
@RequestMapping("/storage")
public class Rest {
    @GetMapping("/-dash")
    public static Dashboard DashGet(){
        String[] title= new String[]{"Draft","Chart","Statistics","Grades"};
        Date[] date = new Date[]{
                new Date(),
                new Date(),
                new Date(),
                new Date()
        };
        var dashInstance = new Dashboard(UUID.randomUUID(),title,date);
        return dashInstance;
    }
}
