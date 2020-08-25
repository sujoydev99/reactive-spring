package com.marinax.marinax.controller;

import java.time.Duration;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/")
public class Lala {
    @RequestMapping(value = "/")
    public ResponseEntity<String> func() {
        System.out.println("Lala.func()");
        return ResponseEntity.status(HttpStatus.OK).body("body");
        // return ResponseEntity.status(HttpStatus.OK)
        // .body(Flux.just("sujoy", " dev", "
        // headstrait").delayElements(Duration.ofSeconds(2)));
    }
}