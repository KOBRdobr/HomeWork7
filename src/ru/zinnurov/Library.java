package ru.zinnurov;

// TODO: добавить javadocs для всех публичных методов и классов
public class Library {
    private BookShelve[] shelves = new BookShelve[] {
            new BookShelve(
                   new Book("Совершенный код", Genre.IT),
                   new Book("Справочник разработчика", Genre.IT),
                   new Book("Алгоритмы", Genre.IT)
            ),
            new BookShelve(
                    new Book("Дюна", Genre.FANTAZY),
                    new Book("Властелин колец", Genre.FANTAZY)
            ),
    };

    // TODO: использовать метод ordinal()
    public void choiceBookByGenre(int choice) {
        switch (choice) {
            case 1:
                giveMeABook(Genre.IT);
                break;
            case 2:
                giveMeABook(Genre.FANTAZY);
                break;
            case 3:
                giveMeABook(Genre.GASTRONOMY);
                break;
            case 4:
                giveMeABook(Genre.HISTORY);
                break;
        }
    }

    // TODO: реализовать поиск по полкам, учесть, что на одной полке могут лежать книги разных жанров
    private void giveMeABook(Genre genre){

    }

}
