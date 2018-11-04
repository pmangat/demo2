package com.docker.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {

    @GetMapping("/")
    public ResponseEntity<?> simpleGet() {
        return new ResponseEntity<>("Bye Bye, there", HttpStatus.OK);
    }
}
