package com.ry6n1k.news;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsController {
    private final NewsService service;

    public NewsController(NewsService service) {
        this.service = service;
    }

    @GetMapping
    public List<News> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<News> findById(@PathVariable("id") Integer id) {
        return service.findById(id);
    }

    // specify type of data
    @PostMapping(consumes = { "application/json" })
    public News save(@RequestBody News news) {
        return service.save(news);
    }

    @PutMapping
    public News update(@RequestBody News news) {
        return service.save(news);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        service.delete(id);
    }
}