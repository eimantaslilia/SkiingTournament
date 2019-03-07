import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserInterface {
    private Input input;
    private List<Athlete> players = new ArrayList<Athlete>();
    private RandomNumber random;

    public UserInterface(){
        this.input = new Input();
        this.random = new RandomNumber();
    }

    public void start(){
        System.out.println("Welcome to the Mount Everest skiing competition" + "\n");
        System.out.println("Write the names of the skiers. To begin, enter an empty string");
        while(true){
            System.out.print("  Skier name: ");
            String command = input.command();
            if (command.equals("")){
                break;
            }
            players.add(new Athlete(command));
        }
        System.out.println("\n" + "Let's begin!" + "\n");
        int r=1;
        while (true){
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            String command = input.command();
            if (command.equals("jump")){
                whenJump(r);
                r++;
            } else if(command.equals("quit")){
                whenQuit();
                break;
            }
        }
    }
    public void printJumpingOrder(){
        Collections.sort(players);
        int i=1;
        for(Athlete player : players){
            System.out.println("  " + i +". " + player);
            i++;
        }
    }
    public void printRoundResults(){
        for(Athlete player : players) {
            System.out.println("  " + player.getName());
            int i = random.jumpLength();
            System.out.println("    length: " + i);
            player.addPoints(i);
            player.addJump(Integer.toString(i) + " m");
            System.out.print("    judge votes: ");
            int judge = random.judgeVotes();
            player.addPoints(judge);
        }
    }
    public void whenJump(int round){
        int r = round;
        System.out.println("\n" + "Round " + r + "\n");
        System.out.println("Jumping order: ");
        printJumpingOrder();
        System.out.println("\n" + "Results of round " +r);
        printRoundResults();
        System.out.println();
    }
    public void whenQuit(){
        int i = 1;
        Collections.reverse(players);
        System.out.println("\n" + "Thanks!" + "\n");
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        for (Athlete player : players) {
            System.out.print(i + "           " + player + "\n");
            System.out.println("            jump lengths: " + player.printPlayerJumps());
            i++;
        }
    }
}
