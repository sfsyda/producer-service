package org.shaziya.producerservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.Random;


@Slf4j
@RestController()
public class ProductController {

    Random random = new Random(100);

    @GetMapping("/api/v1/magic-number")
    public Mono<ResponseEntity<String>> getMagicNumber() {
        return Mono.just(ResponseEntity.ok(String.valueOf(random.nextInt(10000))));
    }


}
