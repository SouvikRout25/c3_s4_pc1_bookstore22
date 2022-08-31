package com.bookstore;

public class Book {
    private long isbn;
    private String title;
    private String description;
    private double price;

    private Author author;
    public long getIsbn() {
        return isbn;
    }
    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }
    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public void display(){
        System.out.println("Book Details");
        System.out.println("isbn = " + isbn);
        System.out.println("title = " + title);
        System.out.println("description = " + description);
        System.out.println("price = $" + price);
        System.out.println();
        System.out.println("Author Details");
        System.out.println(author);
    }
}
