/*
    Nam Nguyen
    October 19, 2020
    CS 143B
    Homework_2
 */

package Problem3;

public class BookFiction extends Book {

    private int lateFeePerDayInDollar = 2;

    private String genres;

    public BookFiction(String title, String author, String genres) {
        // homework
        // tip: use the 'super' keyword
        super(title, author);
        this.genres = genres;
    }

    // copy constructor
    public BookFiction(BookFiction anotherBook) {
        // homework
        // tip: use the 'super' keyword
        super(anotherBook);
        this.title = anotherBook.title;
        this.author = anotherBook.author;
        this.id = anotherBook.id;
        this.genres = anotherBook.genres;
    }

    @Override
    public int getLateFeeInDollar() {
        return lateFeePerDayInDollar;
    }

    @Override
    public int calcLateFees(int numOfDaysPastDue) {
        // homework
        if(numOfDaysPastDue > 0){
            return (numOfDaysPastDue * lateFeePerDayInDollar);
        } else {
            return 0;
        }
    }
}
