package com.wlqq.he.controller.commom;

import org.springframework.stereotype.Component;

@Component
public class etest implements etestimp {


    public String tt1(String a, String b) {
        return a+b;
    }

    public String tt2(String a, String b) {
        return a+b+b;
    }
}
