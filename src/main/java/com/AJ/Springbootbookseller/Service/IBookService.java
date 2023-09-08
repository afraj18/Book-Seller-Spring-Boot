package com.AJ.Springbootbookseller.Service;

import com.AJ.Springbootbookseller.Model.Book;

import java.util.List;

public interface IBookService {
    Book saveBook(Book book);

    void deleteById(long id);

    List<Book> findAllBooks();
}
