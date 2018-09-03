package ru.zinnurov;

/**
 * Класс представляющий книжную полку,
 * содержит в себе массив книг,
 * жанры на одной полке могут не совпадать.
 *
 * @author Danil Popov
 * BadPit@211.ru
 * on 03.09.18
 */
public class BookShelve {
    private Book[] books;

    public BookShelve(Book... books) {
        this.books = books;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }
}
