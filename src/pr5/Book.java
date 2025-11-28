package pr5;

public class Book implements Printable {
    private final String title;
    private final String author;
    private final int year;
    private final String isbn;

    public Book(String title, String author, int year, String isbn) {
        this.title = title; this.author = author; this.year = year; this.isbn = isbn;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getYear() { return year; }
    public String getIsbn() { return isbn; }

    @Override
    public void print() {
        System.out.printf("Book: \"%s\" by %s (%d) ISBN: %s%n", title, author, year, isbn);
    }

    @Override
    public String toString() {
        return String.format("Book{title='%s', author='%s', year=%d, isbn='%s'}",
                title, author, year, isbn);
    }
}
