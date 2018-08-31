package ru.zinnurov;

public enum IT {
    CODE_COMLITE("Совершенный код", 1), DEVELOPER_GUIDE("Справочник разработчика", 2), ALGORITHMS("Алгоритмы", 3), DATABASE("База данных", 4);

    public String bookName;
    public int bookGenre;

    IT(String bookName, int bookGenre) {
        this.bookName = bookName;
        this.bookGenre = bookGenre;
    }
}

