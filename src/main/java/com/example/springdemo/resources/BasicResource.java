package com.example.springdemo.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import javax.security.auth.login.AccountNotFoundException;

@RestController
@RequestMapping("/")
public class BasicResource {
    public static final String BASIC = "/basic";
    public static final String ID_ID = "/{id}";
    public static final String SEARCH = "/search";

    @GetMapping("/")
    public Mono<String> read() {
        return Mono.just("It works DDD");
    }

    @GetMapping(BASIC)
    public Mono<String> readTal() {
        return Mono.just("IDdd=vaaa");
    }

    @GetMapping(SEARCH)
    public Mono<String> search() {
        return Mono.error(new AccountNotFoundException("tal y cual"));
    }
}