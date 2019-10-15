package com.sample.challenge.decorator;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mycontroller")
public interface IMyController {
    @GetMapping(produces = MediaType.TEXT_PLAIN_VALUE, value = "/test")
    ResponseEntity<String> fencyEndpoint();
}
