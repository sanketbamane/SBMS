package com.ashokit.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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

	@GetMapping(value = "/editBook")
	public String editBook(@RequestParam("bid") Integer bookId, Model model) {
		Optional<BookEntity> findById = bookRepo.findById(bookId);
		if (findById.isPresent()) {
			BookEntity bookObj = findById.get();
			model.addAttribute("book", bookObj);
		}
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
	public String saveBook(@ModelAttribute("book") BookEntity book, Model model) {

		boolean isNewRecord = false;

		if (book.getBookId() == null) {
			isNewRecord = true;
		}

		BookEntity savedEntity = bookRepo.save(book);

		if (isNewRecord && savedEntity.getBookId() != null) {
			model.addAttribute("succMsg", "Book Stored Successfully");

		} else if (!isNewRecord) {
			model.addAttribute("succMsg", "Book Updated Successfully");

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

	@GetMapping(value = "/deleteBook")
	public String deleteBook(@RequestParam("bid") Integer bookId, RedirectAttributes rd) {

		boolean isDeleted = false;

		try {
			bookRepo.deleteById(bookId);
			isDeleted = true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (isDeleted) {
			rd.addFlashAttribute("succMsg", "Book Deleted Successfully");
		}

		return "redirect:viewBooks";
	}

}
