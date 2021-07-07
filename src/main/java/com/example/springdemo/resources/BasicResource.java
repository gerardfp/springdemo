package com.example.springdemo.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/")
public class BasicResource {
    @GetMapping("/")
    public Mono<String> home() {
        return Mono.just("It works DDD");
    }

    @GetMapping("/list")
    public Mono<String> list() {
        return Mono.just("[,,,,,,,,,,,]");
    }

//    @GetMapping("/search")
//    public Mono<String> search() {
//        return Mono.error(new AccountNotFoundException("tal y cual"));
//    }
}