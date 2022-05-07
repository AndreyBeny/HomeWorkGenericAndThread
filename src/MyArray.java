import java.util.ArrayList;
import java.util.Random;

public class MyArray {
    public static ArrayList<Integer> randomCollection(){
        Random random = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            arr.add(random.nextInt(30));
        }
        return arr;
    }
}
