import java.util.Random;

public class Dice {



    public Integer toss(){
        Random rand = new Random();

    // Obtain a number between [0-5].
        int num = rand.nextInt(6);

    // Add 1 to the result to get a number from the required range
    // (i.e., [1 - 6]).
        num += 1;

        return  num;


    }

}
