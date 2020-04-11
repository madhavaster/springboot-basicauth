package com.madhav.oauthdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO Add In Class Summary
 * <p>
 * TODO Add In Class Description
 *
 * @author 11201174 <br />
 * Copyright 2020 Earthport Plc. All rights reserved.
 */
@RestController
public class Hello
{
    @GetMapping("/hello")
    public String hello(){
        return "<h1>Hello Madhav</h1>";
    }
}
