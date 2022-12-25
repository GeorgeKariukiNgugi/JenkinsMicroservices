package com.sample_jenkins_project.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping(path = "second_service")
public class controller {
    @GetMapping
    public ResponseEntity<Object> second(){
        HashMap data = new HashMap();
        data.put("first","first");
        data.put("second","second");
        data.put("third","third");
        return new ResponseEntity<Object>(data,  HttpStatus.OK);
    }
}
