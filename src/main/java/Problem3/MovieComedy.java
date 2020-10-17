/*
    Nam Nguyen
    October 19, 2020
    CS 143B
    Homework_2
 */

package Problem3;

import java.util.UUID;

public class MovieComedy extends Movie {
    private int lateFeePerDayInDollar = 3;

    public MovieComedy(String rating, String title) {
        // homework
        // tip: use the 'super' keyword
        super(rating, title);
    }

    public MovieComedy(MovieComedy anotherMovie) {
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
        if(numOfDaysPastDue > 0){
            return (numOfDaysPastDue * lateFeePerDayInDollar);
        } else {
            return 0;
        }
    }
}
