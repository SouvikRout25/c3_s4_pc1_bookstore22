package com.bookstore;

public class BookImpl {
    public static void main(String[] args) {
        Book book = new Book();
        Author author = new Author();
        author.setAuthorName("Chetan Bhagat");
        author.setAuthorPenName("Cello");
        book.setIsbn(458965475655L);
        book.setTitle("Five Point Someone");
        book.setDescription("Largest selling novel");
        book.setPrice(250.64);
        book.setAuthor(author);

        book.display();
    }
}
