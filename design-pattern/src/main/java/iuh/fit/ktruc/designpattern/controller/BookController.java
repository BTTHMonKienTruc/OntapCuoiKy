package iuh.fit.ktruc.designpattern.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import iuh.fit.ktruc.designpattern.entity.Book;
import iuh.fit.ktruc.designpattern.service.BookService;

/**
 * 
 * @author Admin
 *
 */
@RestController
@RequestMapping("book")
public class BookController {

	@Autowired 
	private BookService bookService;
	
	//
	@GetMapping("home")
	public String myHome () {
		return "Home -- home -- home ";
	}
	
	//
	@GetMapping("")
	public List<Book> getBooks() {
		return bookService.findAll();
	}
	
	//
	@GetMapping("/{id}")
	public Book getBook(@PathVariable int id) {
		Book book = null;
		try {
			book = bookService.findbyId(id);
		} catch (Exception e) {
			System.out.println(e);
		}
		return book;
	}
	
	//
	@PostMapping("")
	public Book save(@RequestBody Book book) {
		bookService.save(book);
		return bookService.findbyId(book.getId());
	}
	
	//
	@PutMapping("")
	public Book update(@RequestBody Book book) { 
		bookService.save(book);
		return bookService.findbyId(book.getId());
	}
	
	//
	@DeleteMapping("/{id}")
	public String del(@PathVariable int id) {
		try {
			Book book = bookService.findbyId(id);
			
			bookService.del(id);
			
			return "Xoa thanh cong --- "+ id;
		} catch (Exception e) {
			return e.toString();
		}
	}
	
}
