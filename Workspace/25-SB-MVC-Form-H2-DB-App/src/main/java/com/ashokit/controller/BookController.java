package com.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ashokit.entity.BookEntity;
import com.ashokit.repository.BookRepository;

@Controller
public class BookController {

	@Autowired
	private BookRepository bookRepo;

	/**
	 * This method is used to load form
	 * 
	 * @param model
	 * @return String
	 */
	@GetMapping(value = { "/", "/addBook" })
	public String loadForm(Model model) {
		BookEntity bookObj = new BookEntity();
		model.addAttribute("book", bookObj);
		return "addBook";
	}

	/**
	 * This method is used to save book data
	 * 
	 * @param book
	 * @param model
	 * @return String
	 */
	@PostMapping(value = "/saveBook")
	public String saveBook(BookEntity book, Model model) {
		BookEntity savedEntity = bookRepo.save(book);
		if (savedEntity != null && savedEntity.getBookId() != null) {
			model.addAttribute("succMsg", "Book Stored Successfully");
		} else {
			model.addAttribute("failMsg", "Failed to store book");
		}
		return "addBook";
	}

	/**
	 * This method is used to display all books details
	 * 
	 * @param model
	 * @return String
	 */
	@GetMapping(value = "/viewBooks")
	public String viewBooks(Model model) {
		List<BookEntity> bookList = bookRepo.findAll();
		model.addAttribute("books", bookList);
		return "viewBooks";
	}
}
