package com.ry6n1k.news;

import java.util.List;
import java.util.Optional;

public interface NewsService {
    List<News> findAll();

    Optional<News> findById(Integer id);

    News save(News news);

    void delete(Integer id);
}