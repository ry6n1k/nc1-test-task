package com.ry6n1k.news;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class NewsServiceImpl implements NewsService {
    private final NewsRepository repository;

    public NewsServiceImpl(NewsRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<News> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<News> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public News save(News news) {
        return repository.save(news);
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}