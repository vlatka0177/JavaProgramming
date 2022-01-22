package AvengersPractice.day06.Question5;

public class Sport {

    String name;
    int numOfPlayers;
    boolean teamBased;

    public void makeSport (String name, int players, boolean teams){ // makeSport is A void method
        this.name = name;
        this.numOfPlayers = players;
        this.teamBased = teams;
    }

    public String toString(){
        String msg = "The sport is " + name + "and has " +
                numOfPlayers + "players total" ;
        if(teamBased){
            msg += "divided into teams";
        } else {
            msg += "but there is no teams";
        }
        return msg;
    }
}
