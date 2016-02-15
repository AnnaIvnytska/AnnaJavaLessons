package Chapter3.Book;

import Chapter3.Abiturient.Abiturient;

import java.util.ArrayList;

/**
 * Created by ivnytska on 1/28/2016.
 */
public class MainBook {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();

        books.add(new Book(1, "Title1", "Author1", "PublishHouse1", 2000, 100, 500, "BindingType"));
        books.add(new Book(2, "Title2", "Author2", "PublishHouse2", 2000, 300, 600, "BindingType"));
        books.add(new Book(3, "Title3", "Author3", "PublishHouse3", 2002, 50, 400, "BindingType"));
        books.add(new Book(4, "Title4", "Author2", "PublishHouse5", 2005, 10200, 50202, "BindingType"));
        books.add(new Book(5, "Title5", "Author5", "PublishHouse5", 2000, 222, 100, "BindingType"));

//        showBooksByAuthor(books, "Author2");
//        showBooksByPublishHouse(books, "PublishHouse5");
        showBooksAfterYear(books, 2002);
    }

    public static void showBooksByAuthor(ArrayList<Book> books, String author) {
        for (Book counter : books) {
            if(counter.author == author){
                System.out.println(counter);
            }
        }
    }

    public static void showBooksByPublishHouse(ArrayList<Book> books, String publishHouse) {
        for (Book counter : books) {
            if(counter.publishingHouse == publishHouse){
                System.out.println(counter);
            }
        }
    }

    public static void showBooksAfterYear(ArrayList<Book> books, int year) {
        for (Book counter : books) {
            if(counter.year >= year){
                System.out.println(counter);
            }
        }
    }
}