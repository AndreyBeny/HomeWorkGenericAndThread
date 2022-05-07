import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {
        ArrayList<Integer> arr = MyArray.randomCollection();
        System.out.println(arr + " - заданная коллекция");
        UpArrayThread up = new UpArrayThread(arr);
        DownArrayThread down = new DownArrayThread(arr);
        NewArrayThread neew = new NewArrayThread(arr, 2, 10);
        up.start();
        try {
            up.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        down.start();
        try {
            down.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        neew.start();
        try {
            neew.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

//Задача номер 1
    public static<T> Map<T, Integer> method(T[] arr){
        Map<T, Integer> myMap = new HashMap<>();
        for (T i : arr){
            Integer count = 0;
            for (T j : arr){
                if (j == i){
                    count++;
                }
            }
            if (!myMap.containsKey(i)) {
                myMap.put(i, count);
            }
        }
        return myMap;
    }
}
