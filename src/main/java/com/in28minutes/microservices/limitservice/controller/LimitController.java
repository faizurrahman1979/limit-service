package com.in28minutes.microservices.limitservice.controller;

import com.in28minutes.microservices.limitservice.config.LimitConfiguration;
import com.in28minutes.microservices.limitservice.config.PropertyConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

public class LimitController {
    @Autowired
    private PropertyConfiguration propertyConfiguration;
    @RequestMapping("/limit")
    public LimitConfiguration retrieveLimitFromConfiguration()
    {
        //return new LimitConfiguration(100,8000);
        return new LimitConfiguration(propertyConfiguration.getMinimum(),propertyConfiguration.getMaximum());
    }
}
