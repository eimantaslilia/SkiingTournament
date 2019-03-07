import java.util.ArrayList;
import java.util.List;

public class Athlete implements Comparable<Athlete>{
    private String name;
    private int points = 0;
    List<String> jumps;
    public Athlete(String name){
        this.name = name;
        this.jumps = new ArrayList<String>();
    }
    public String toString() {
        return this.name + " (" + this.points + " points)";
    }
    public void addPoints(int points){
        this.points+=points;
    }
    public void addJump(String jump){
        jumps.add(jump);
    }
    public int compareTo(Athlete athlete){
        return this.points - athlete.points;
    }
    public String getName(){
        return this.name;
    }
    public String printPlayerJumps(){
        String theList = jumps.toString();
        String complete = theList.substring(1, theList.length() - 1).replace(", ", ", ");
        return complete;
    }


}
