package com.AJ.Springbootbookseller.Service;

import com.AJ.Springbootbookseller.Model.Book;
import com.AJ.Springbootbookseller.Repository.IBookRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class BookServiceImpl implements IBookService{
    private final IBookRepository bookRepository;

    public BookServiceImpl(IBookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book saveBook(Book book){
//        book.setTitle(book.getTitle());
//        book.setAuthor(book.getAuthor());
//        book.setPrice(book.getPrice());
//        book.setDescription(book.getDescription());
        book.setCreateTime(LocalDateTime.now());

        return bookRepository.save(book);

    }
    @Override
    public void deleteById(long id){
        bookRepository.deleteById(id);
    }
    @Override
    public List<Book> findAllBooks(){
        return bookRepository.findAll();
    }

}
