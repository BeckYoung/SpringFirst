package org.example.service.impl;

import org.example.service.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Override
    public void print() {
        System.out.println("BookServiceImpl print...");
    }
}
