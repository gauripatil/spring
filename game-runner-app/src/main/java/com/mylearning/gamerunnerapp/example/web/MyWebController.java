package com.mylearning.gamerunnerapp.example.web;

import com.mylearning.gamerunnerapp.example.business.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyWebController {
    @Autowired
    private BusinessService businessService;
    public long returnValueFromBusineesService () {
        return businessService.calculateSum();
    }
}


