/**
 * Created by jhanward on 7/19/2017.
 */
public class Book {
    int BookId;
    String BookTitle;
    String Author;
    int isbn;

    public Book(int bookId, String bookTitle, String author, int isbn) {
        BookId = bookId;
        BookTitle = bookTitle;
        Author = author;
        this.isbn = isbn;
    }

    public int getBookId() {
        return BookId;
    }

    public void setBookId(int bookId) {
        BookId = bookId;
    }

    public String getBookTitle() {
        return BookTitle;
    }

    public void setBookTitle(String bookTitle) {
        BookTitle = bookTitle;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "BookId=" + BookId +
                ", BookTitle='" + BookTitle + '\'' +
                ", Author='" + Author + '\'' +
                ", isbn=" + isbn +
                '}';
    }
}
