/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.iconpln.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author USER
 */
@RestController
public class HelloController {
    
    private static final Logger log = LoggerFactory.getLogger(HelloController.class);
    
    @GetMapping("/")
    public String hello(){
        log.info("calling HelloController");
        return "Hello World";
    }
}
