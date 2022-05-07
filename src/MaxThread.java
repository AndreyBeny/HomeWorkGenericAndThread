import java.util.ArrayList;

public class MaxThread extends Thread {
    ArrayList<Integer> arr;
    Integer numberMax = 0;
    public MaxThread(ArrayList<Integer> arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        numberMax = arr.get(0);
        for (int i = 0; i < arr.size(); i++) {
            if (numberMax < arr.get(i)) {
                numberMax = arr.get(i);
            }
        }
    }
}
