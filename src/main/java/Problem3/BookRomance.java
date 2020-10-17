/*
    Nam Nguyen
    October 19, 2020
    CS 143B
    Homework_2
 */

package Problem3;

public class BookRomance extends Book {

    private int lateFeePerDayInDollar = 4;

    public BookRomance(String title, String author) {
        // homework
        // tip: use the 'super' keyword
       super(title, author);
    }

    public BookRomance(BookRomance anotherBook) {
        // homework
        // tip: use the 'super' keyword
        super(anotherBook);
        this.title = anotherBook.title;
        this.author = anotherBook.author;
        this.id = anotherBook.id;
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
