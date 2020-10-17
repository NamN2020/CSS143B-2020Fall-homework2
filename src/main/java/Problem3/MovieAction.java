/*
    Nam Nguyen
    October 19, 2020
    CS 143B
    Homework_2
 */

package Problem3;

public class MovieAction extends Movie {

    private int lateFeePerDayInDollar = 5;

    public MovieAction(String rating, String title) {
        // homework
        // tip: use the 'super' keyword
        super(rating, title);
    }

    public MovieAction(MovieAction anotherMovie) {
        // homework
        // tip: use the 'super' keyword
        super(anotherMovie);
        this.title = anotherMovie.title;
        this.rating = anotherMovie.rating;
        this.id = anotherMovie.id;
    }

    @Override
    public int getLateFeeInDollar() {
        return lateFeePerDayInDollar;
    }

    @Override
    public int calcLateFees(int numOfDaysPastDue) {
        // homework
        if(numOfDaysPastDue > 0 && numOfDaysPastDue < 5){
            return (numOfDaysPastDue * lateFeePerDayInDollar);
        } else if(numOfDaysPastDue >= 5){
            return (2 * numOfDaysPastDue * lateFeePerDayInDollar);
        } else{
            return 0;
        }
    }
}
