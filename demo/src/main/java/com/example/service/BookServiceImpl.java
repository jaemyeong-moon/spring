package com.example.service;

import java.util.Optional;

import javax.transaction.Transactional;

import com.example.domain.Book;
import com.example.domain.BookRepository;

import org.springframework.stereotype.Service;

@Service
@Transactional
public class BookServiceImpl implements BookService {
    BookRepository bookRepository;
    public BookServiceImpl(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }
    @Override
    public Optional<Book> findById(Long id) {
        // TODO Auto-generated method stub
        return bookRepository.findById(id);
    }
}
