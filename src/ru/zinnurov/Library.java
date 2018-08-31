package ru.zinnurov;

public class Library {
    private int genre, choice;
    private IT book;


    public void choiceGenre(int genre) {
        this.genre = genre;

    }
    public void choiceBook(int choice) {
        if(choice == 1) {
            giveMeABook(IT.CODE_COMLITE);
        }
        else if(choice == 2) {
            giveMeABook(IT.DEVELOPER_GUIDE);
        }
        else if(choice == 3) {
            giveMeABook(IT.ALGORITHMS);
        }
        else {
            giveMeABook(IT.DATABASE);
        }
    }

    public void giveMeABook(IT book){
        if (this.genre > 0) {
                System.out.println("Возьмите вашу книгу: " + book.bookName);

        } else {
            System.out.println("Такого жанра нет!");
        }
    }

}
