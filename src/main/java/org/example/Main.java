package org.example;

import org.example.dao.BookDao;
import org.example.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        BookDao bookDao = (BookDao) context.getBean("bookDao");
        BookDao bookDao = context.getBean("bookDao", BookDao.class);
        bookDao.save();

        BookService bookService = context.getBean(BookService.class);
        bookService.print();
    }
}