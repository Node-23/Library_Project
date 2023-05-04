package com.lumberjack.Interfaces;

import com.lumberjack.Models.Book;

import java.util.ArrayList;

public interface IBookCRUD {
     public Book Add();
     public List<Book> listAll();
     public Book findById(int id);
     public Book update(Book book);
     public void delete(Book book);
}
