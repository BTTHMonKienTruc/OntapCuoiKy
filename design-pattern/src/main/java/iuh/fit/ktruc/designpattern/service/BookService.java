package iuh.fit.ktruc.designpattern.service;

import java.util.List;

import iuh.fit.ktruc.designpattern.entity.Book;

public interface BookService {
	public List<Book> findAll();
	public Book findbyId(int maTim);
	public void save(Book book);
	public void del(int maXoa);
}
