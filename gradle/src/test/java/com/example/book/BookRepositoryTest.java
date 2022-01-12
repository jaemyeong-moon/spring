package com.example.book;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.List;

import com.example.gradle.domain.Book;
import com.example.gradle.domain.BookRepository;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class BookRepositoryTest {
    @Autowired
    BookRepository repository;

    @Test
    public void testSave(){
        Book book = new Book();
        book.setName("bookt-string-boot");
        book.setIsbn10("0123456789");
        book.setIsbn13("0123456789123");

        assertThat(book.isNew()).isTrue();
        
        repository.save(book);
        assertThat(book.isNew()).isFalse();
    }
    
    @Test
    public void testFindByNameLike(){
        Book book = new Book();
        book.setName("bookt-string-boot");
        book.setIsbn10("0123456789");
        book.setIsbn13("0123456789123");

        repository.save(book);

        List<Book> books = repository.findByNameLike("boot");

        assertThat(books).isNull();
        
    }
}
