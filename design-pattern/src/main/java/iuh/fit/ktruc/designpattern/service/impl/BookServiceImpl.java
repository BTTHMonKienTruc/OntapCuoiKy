package iuh.fit.ktruc.designpattern.service.impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import iuh.fit.ktruc.designpattern.entity.Book;
import iuh.fit.ktruc.designpattern.repository.BookRepository;
import iuh.fit.ktruc.designpattern.service.BookService;

/**
 * 
 * @author Admin
 *
 */
@Transactional
@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;

	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}

	@Override
	public Book findbyId(int maTim) {
		// TODO Auto-generated method stub
		Optional<Book> optional = bookRepository.findById(maTim);
		Book book = null;
		if (optional.isPresent()) {
			book = optional.get();
		} else {
			throw new RuntimeException("Khong tim thay ma -- " + maTim);
		}

		return book;
	}

	@Override
	public void save(Book book) {
		// TODO Auto-generated method stub
		bookRepository.save(book);
	}

	@Override
	public void del(int maXoa) {
		// TODO Auto-generated method stub
		bookRepository.deleteById(maXoa);
	}

}
