package com.example.demo.Model;

import com.example.demo.Lists.Lister;
import lombok.Getter;

import java.util.Date;
import java.util.UUID;

public class Dashboard extends Lister {
    @Getter
    private UUID key;
    @Getter
    private String[] str;
    @Getter
    private Date[] date;

    public Dashboard(UUID key,String[]str, Date[] date) {
        super(str,date);
        this.key=key;
        this.str=str;
        this.date=date;

    }
}
