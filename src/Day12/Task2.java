package Day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbersArray = new ArrayList<>();

        for (int i = 0; i < 30 ; i++) {
            numbersArray.add(i);
        }
        for(int i = 300; i < 350; i++) {
            numbersArray.add(i);
        }
        System.out.println(numbersArray);
    }
}
