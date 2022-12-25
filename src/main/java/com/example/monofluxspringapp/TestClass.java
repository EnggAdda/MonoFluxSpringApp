package com.example.monofluxspringapp;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class TestClass {

    public static void main(String[] args) {
        Mono<?> monoString = Mono.just("EnggAdda").then(Mono.error(new RuntimeException()))
                .log();
        monoString.subscribe(System.out::println);

        Flux<String> fluxString = Flux.just("EnggAdda","Youtube","Java","Spring","Spring Reactive").log();
        fluxString.subscribe(System.out::println);
    }
}


