package Problem3;

public class MovieAction extends Movie {

    private int lateFeePerDayInDollar = 5;

    public MovieAction(String rating, String title) {
        // homework
        // tip: use the 'super' keyword
        super.rating = rating;
        super.title = title;
    }

    public MovieAction(MovieAction anotherMovie) {
        // homework
        // tip: use the 'super' keyword
        super.rating = anotherMovie.rating;
        super.title = anotherMovie.title;
    }

    @Override
    public int getLateFeeInDollar() {
        return lateFeePerDayInDollar;
    }

    @Override
    public int calcLateFees(int numOfDaysPastDue) {
        // homework
        if(numOfDaysPastDue < 5){
            return(numOfDaysPastDue * lateFeePerDayInDollar);
        } else {
            return(2*numOfDaysPastDue * lateFeePerDayInDollar);
        }
    }
}
