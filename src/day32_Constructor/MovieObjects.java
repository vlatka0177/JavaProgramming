package day32_Constructor;

public class MovieObjects {

    public static void main(String[] args) {

         Movie movie = new Movie("Journey to SDET:Cydeo Batch25", "USA",
                 "Adventure, Comedy, Thriller","October 25, 2021",
                 "Kuzzat Altay");

         String [] casts = {"Asya", "Adam", "Muhtar", "Chakar", "Kaloyan", "Dilia", "Ievgenii", "Aygun"};
         movie.addCast(casts);
        System.out.println(movie);
    }


}
