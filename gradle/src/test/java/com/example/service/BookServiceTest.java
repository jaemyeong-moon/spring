package com.example.service;

import com.example.gradle.domain.Book;
import com.example.gradle.service.BookService;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = WebEnvironment.NONE)
public class BookServiceTest {
    @Autowired
    BookService bookService;
    @Test
    public void testFindById(Long id){
        Book book = bookService.findById(id).orElseThrow(() -> new RuntimeException("Not Found"));
    }
}
