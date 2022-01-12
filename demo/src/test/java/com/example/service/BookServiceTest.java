package com.example.service;

import com.example.domain.Book;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.NONE)
public class BookServiceTest {
    @Autowired
    BookService bookService;
    @Test
    public void testFindById(Long id){
        Book book = bookService.findById(id).orElseThrow(() -> new RuntimeException("Not Found"));
    }
}
