package com.example.movieclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/consumer")
public class MovieAPIConsumer {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/movie/{id}")
    public Object getMoviesFromAPI(@PathVariable Long id) {
        String url = "http://localhost:8080/api/movie/" + id + "/";
        return restTemplate.getForObject(url, Object.class);
    }
}
