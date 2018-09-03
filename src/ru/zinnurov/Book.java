package ru.zinnurov;

/**
 * Класс представляющий книгу,
 * книга характеризуется названием и жанром.
 *
 * @author Danil Popov
 * BadPit@211.ru
 * on 03.09.18
 */
public class Book {
    private Genre genre;
    private String name;

    public Book(String name, Genre genre) {
        this.genre = genre;
        this.name = name;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
