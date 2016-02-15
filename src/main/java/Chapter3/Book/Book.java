package Chapter3.Book;

/**
 * Created by ivnytska on 1/28/2016.
 */
public class Book {
    int id;
    String title;
    String author;
    String publishingHouse;
    int year;
    int pageNumber;
    int price;
    String binding;

    public Book(int id, String title, String author, String publishingHouse, int year, int pageNumber, int price, String binding) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.year = year;
        this.pageNumber = pageNumber;
        this.price = price;
        this.binding = binding;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "ID: " + this.id + ", TITLE: " + this.title + ", AUTHOR: " + this.author + ", PRICE: " + this.price;
    }
}
