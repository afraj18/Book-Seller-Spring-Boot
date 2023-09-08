package com.AJ.Springbootbookseller.Repository;

import com.AJ.Springbootbookseller.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book,Long> {
}
