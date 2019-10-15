package com.sample.challenge.decorator;

import org.springframework.http.ResponseEntity;


public class MyController implements IMyController {


    public ResponseEntity<String> fencyEndpoint() {
        return ResponseEntity.ok("Hello world!");
    }
}
