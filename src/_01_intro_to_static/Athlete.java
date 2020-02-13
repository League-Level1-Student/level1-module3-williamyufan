package _01_intro_to_static;

public class Athlete {
    static int nextBibNumber=1;
    static String raceLocation = "New York City";
    static String raceStartTime = "9.00am";

    String name;
    int speed;
    int bibNumber;

    Athlete (String name, int speed){
        this.name = name;
        this.speed = speed;
        
        bibNumber=nextBibNumber;
        nextBibNumber=nextBibNumber+1;
    }

    public static void main(String[] args) {
    	
    	Athlete Joe=new Athlete("Joe", 11);
    	Athlete Bick=new Athlete("Bick", 37);
    	System.out.println(Joe.name+ " " +Joe.bibNumber +" "+ Joe.raceLocation + " "+Joe.raceStartTime);
    	System.out.println(Bick.name+ " "+Bick.bibNumber+" " +Bick.raceLocation+ " "+Bick.raceStartTime);
        //create two athletes
        //print their names, bibNumbers, and the location of their race. 
    }
}