package com.sample.challenge.chain;

import com.sample.challenge.decorator.IMyController;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mycontroller")
public class MyController{

    @GetMapping(produces = MediaType.TEXT_PLAIN_VALUE, value = "/test")
    public ResponseEntity<String> fencyEndpoint() {
        return ResponseEntity.ok("Hello world - chain of responsability!");
    }
}
