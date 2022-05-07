import java.util.ArrayList;

public class MinThread extends Thread{
    ArrayList<Integer> arr;
    Integer numberMin = 0;
    public MinThread(ArrayList<Integer> arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        numberMin = arr.get(0);
        for (int i = 0; i < arr.size(); i++) {
            if (numberMin > arr.get(i)) {
                numberMin = arr.get(i);
            }
        }
    }
}
