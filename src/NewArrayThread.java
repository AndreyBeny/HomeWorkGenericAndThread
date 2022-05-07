import java.util.ArrayList;

public class NewArrayThread extends Thread{

    ArrayList<Integer> arr;
    int n;
    int m;

    public NewArrayThread(ArrayList<Integer> arr, int n, int m) {
        this.arr = arr;
        this.n = n;
        this.m = m;
    }

    @Override
    public void run() {
        ArrayList<Integer> newArr = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++){
            if (arr.get(i) >= n && arr.get(i) <= m){
                newArr.add(arr.get(i));
            }
        }
        System.out.println(newArr + " - новая коллекция в диапазоне от " + n + " до " + m + " включительно");

    }
}
