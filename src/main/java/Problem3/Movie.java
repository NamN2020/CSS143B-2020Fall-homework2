package Problem3;

import java.util.UUID;

public abstract class Movie implements StoreMediaOperations {
    String rating;
    String title;
    UUID id;

    public Movie(String rating, String title) {
        this.id = UUID.randomUUID();
        // homework
        this.rating = rating;
        this.title = title;
    }

    public Movie(Movie anotherMovie) {
        // homework
        this.rating = anotherMovie.rating;
        this.title = anotherMovie.title;
        this.id = anotherMovie.id;
    }

    public Movie() {}

    @Override
    public boolean equals(Object obj) {
        // homework
        if(obj == null){
            return false;
        } else if (getClass() != obj.getClass()){
            return false;
        }

        Movie otherMovie = (Movie) obj;

        return (this.id == otherMovie.id);

    }
}
