package iuh.fit.ktruc.designpattern.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * 
 * @author Admin
 *
 */
@Entity
@Data
@Table(name = "books")
@SuppressWarnings("serial")
@NoArgsConstructor
@AllArgsConstructor
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "book_name")
	private String bookName;
	@Column(name = "publish_date")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dddd")
	private Date publishDate;
	@Column(name = "author_id")
	private int authorId;
	@Column(name = "number_of_pages")
	private int numberOfPages;
	private Integer quality;
	private Integer price;
	@Column(name = "book_image")
	public String bookImage;
	//
	public Book(int id, String bookName, Date publishDate, int authorId, int numberOfPages, Integer quality,
			Integer price, String bookImage) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.publishDate = publishDate;
		this.authorId = authorId;
		this.numberOfPages = numberOfPages;
		this.quality = quality;
		this.price = price;
		this.bookImage = bookImage;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	//
	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", publishDate=" + publishDate + ", authorId=" + authorId
				+ ", numberOfPages=" + numberOfPages + ", quality=" + quality + ", price=" + price + ", bookImage="
				+ bookImage + "]";
	}
	//
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	public Integer getQuality() {
		return quality;
	}
	public void setQuality(Integer quality) {
		this.quality = quality;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getBookImage() {
		return bookImage;
	}
	public void setBookImage(String bookImage) {
		this.bookImage = bookImage;
	}
	

}

//CREATE TABLE `books` (
//		  `id` int unsigned NOT NULL AUTO_INCREMENT,
//		  `book_name` varchar(191) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
//		  `publish_date` date DEFAULT NULL,
//		  `author_id` int unsigned DEFAULT NULL,
//		  `number_of_pages` int DEFAULT NULL,
//		  `quality` int DEFAULT '0',
//		  `price` bigint DEFAULT NULL,
//		  `book_image` varchar(191) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
//		  PRIMARY KEY (`id`)
//		) ENGINE=InnoDB ;
