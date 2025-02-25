package com.bookStore.bookStore.service;

import com.bookStore.bookStore.entity.Book;
import com.bookStore.bookStore.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bRepo;

    public void save(Book b) {
        bRepo.save(b);
    }

    // ✅ Add this method to fetch all books
    public List<Book> getAllBooks() {
        return bRepo.findAll();  // Fetches all books from the database
    }

    public void deleteBookById(Long id) {
        bRepo.deleteById(id);
    }

}
