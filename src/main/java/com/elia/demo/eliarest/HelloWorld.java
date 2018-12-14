/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elia.demo.eliarest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author n.lamouchi
 */
@RestController
public class HelloWorld {
    
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello World !!";
    }
    
}
