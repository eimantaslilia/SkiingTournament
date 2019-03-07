import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumber {
    Random random;

    public RandomNumber(){
        random = new java.util.Random();
    }
    public int judgeVotes(){
        System.out.print("[");
        List<Integer> judgeMidVotes = new ArrayList<Integer>();
        for (int i=0;i<4;i++){
            int vote = ThreadLocalRandom.current().nextInt(10,20+1);
            System.out.print(vote + ", ");
            if (i==4){
                System.out.println(vote +"]");
            }
            judgeMidVotes.add(vote);
        }
        int lastVote = ThreadLocalRandom.current().nextInt(10,20+1);
        System.out.println(lastVote + "]");
        judgeMidVotes.add(lastVote);
        Collections.sort(judgeMidVotes);
        int number = judgeMidVotes.get(1) + judgeMidVotes.get(2) + judgeMidVotes.get(3);
        return number;
    }
    public int jumpLength(){
        int r = ThreadLocalRandom.current().nextInt(60, 120 +1);
        return r;
    }
}
