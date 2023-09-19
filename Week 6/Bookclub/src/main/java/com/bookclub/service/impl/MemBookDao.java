package com.bookclub.service.impl;

import com.bookclub.model.Book;
import com.bookclub.service.dao.BookDao;

import java.util.ArrayList;
import java.util.List;

public class MemBookDao implements BookDao {

    private List<Book> books;

    public MemBookDao() {
        this.books = new ArrayList<Book>();
        this.books.add(new Book("0061120081", "To Kill a Mockingbird",
                "A classic American novel by Harper Lee, set in the racially charged Deep South of the 1930s.",
                336, new ArrayList<>(List.of("Harper Lee"))));

        this.books.add(new Book("0451524934", "The Great Gatsby",
                "F. Scott Fitzgerald's masterpiece exploring the American Dream during the Roaring Twenties.",
                180, new ArrayList<>(List.of("F. Scott Fitzgerald"))));

        this.books.add(new Book("067978327X", "The Catcher in the Rye",
                "J.D. Salinger's iconic novel following the journey of Holden Caulfield through New York City.",
                277, new ArrayList<>(List.of("J.D. Salinger"))));

        this.books.add(new Book("0062699460", "To the Lighthouse",
                "Virginia Woolf's literary exploration of the inner thoughts and emotions of characters during a summer in America.",
                209, new ArrayList<>(List.of("Virginia Woolf"))));

        this.books.add(new Book("0451526333", "The Adventures of Huckleberry Finn",
                "Mark Twain's classic American novel chronicling the adventures of Huck and Jim along the Mississippi River.",
                366, new ArrayList<>(List.of("Mark Twain"))));
    }

    @Override
    public List<Book> list() {
        return this.books;
    }

    @Override
    public Book find(String key) {
        for (Book book : this.books) {
            if (book.getIsbn().equals(key)) {
                return book;
            }
        }
        return new Book();
    }
}