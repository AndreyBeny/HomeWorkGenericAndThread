import java.util.ArrayList;

public class UpArrayThread extends Thread{
    ArrayList<Integer> arr;

    public UpArrayThread(ArrayList<Integer> arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        for (int i = 0; i < arr.size() - 1; i++){
            for (int j = 0; j < arr.size() - 1 - i; j++){
                if (arr.get(j) > arr.get(j + 1)){
                    Integer b = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, b);
                }
            }
        }
        System.out.println(arr + " - коллекция по возрастанию");
    }
}
