package day39_Recap.statesTask;

public class StatesObjects {

    public static void main(String[] args) {

        Virginia virginia = new Virginia("Virginia", "VA",
                "Senate Democratic House Republican", "Glenn Youngkin",
                "Mark Warner and Tim Kaine", 8000000, 5.75);

        Maryland maryland = new Maryland("Maryland", "MD", "Democratic",
                "Larry Hogan", "Ben Cardin and Chris Van Hollen", 6046000, 5.75);

        Florida florida = new Florida("Florida","FL","Republican","Ron DeSantis",
                "Marco Rubio and Rick Scott",21480000,0 );

        California california = new California("California", "CA", "Democratic",
                "Gavin Newsom","Alex Padilla and Dianne Feinstein", 39510000,12.3 );

        System.out.println(virginia);
        System.out.println(maryland);
        System.out.println(florida);
        System.out.println(california);

        /*
    3. Create a class named StateObjects.
	   Create the objects of each subclass.
       Test all the functions of each object.
       Analyze the relationships between the classes.
       */
    }





}
