package com.example.service;

import java.util.Optional;

import javax.transaction.Transactional;

import com.example.domain.Book;

import org.springframework.stereotype.Service;

@Service
@Transactional
public interface BookService {
    public Optional<Book> findById(Long id);
}
