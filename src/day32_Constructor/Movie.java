package day32_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class Movie {

    /*
    3. Movie Task:

	   Create a class named Movie

	   Attributes: country (String), title (String), Genre (String), releaseDate (String), director (String),
	   casts (ArrayList<String>)

		Add a constructor to set the country, title, genre, release date, and director of the Movie

	    Actions
	    addCast(String): adds the given string argument to the arrayList casts
	    addCasts(String[]): adds the given string array argument to the arrayList casts
	    toString(): returns the name of country, title, release date, and total number of casts

        Create a class called MovieObjects.
        Create an object of the movie:
                    title: Journey to SDET: Cydeo Batch 25
                    country: USA
                    Genre: Adventure, Comedy, Thriller
                    release date: 10/25/2021
                    director: Kuzzat Altay
                    Casts: Asiya, Adam, Muhtar and 5 more students from your group

        Print the full info of the movie.

     */

    public String title, country, genre, releaseDate, director;
    ArrayList<String> castList = new ArrayList<>();

    public Movie(String title, String country, String genre, String releaseDate, String director) {
        this.title = title;
        this.country = country;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.director = director;
    }

    public String toString() {
        return
                " Title:" + title + '\n' +
                " Country:" + country + '\n' +
                " Genre:" + genre + '\n' +
                " Release date:" + releaseDate + '\n' +
                " Director:" + director + '\n' +
                " Cast:" + castList;
    }
    public void addCast(String[] casts) {
        castList.addAll(Arrays.asList(casts));

        }
}
