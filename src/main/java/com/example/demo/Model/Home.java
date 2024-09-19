package com.example.demo.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.Date;


public class Home {
    @Getter
    @JsonProperty
    private String Blog;
    @Getter
    @JsonProperty
    private Date creation;
    public Home(String Blog, Date creation) {
        this.Blog=Blog;
        this.creation=creation;
    }
}
