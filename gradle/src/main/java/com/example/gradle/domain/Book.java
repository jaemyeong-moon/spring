package com.example.gradle.domain;

import org.springframework.data.jpa.domain.AbstractPersistable;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Data
@NoArgsConstructor
public class Book extends AbstractPersistable<Long>{
    private String name;
    private String isbn13;
    private String isbn10;
}
