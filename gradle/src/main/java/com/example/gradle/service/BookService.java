package com.example.gradle.service;

import java.util.Optional;

import javax.transaction.Transactional;

import com.example.gradle.domain.Book;

import org.springframework.stereotype.Service;

@Service
@Transactional
public interface BookService {
    public Optional<Book> findById(Long id);
}
