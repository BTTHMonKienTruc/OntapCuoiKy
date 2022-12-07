package iuh.fit.ktruc.designpattern.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import iuh.fit.ktruc.designpattern.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
