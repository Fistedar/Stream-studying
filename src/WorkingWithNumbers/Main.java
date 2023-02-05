package WorkingWithNumbers;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] raw = {1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};
        Arrays.sort(raw);
        List<Integer> num = Arrays.asList(raw);
        for (int x : num) {
            if (x > 0 && x % 2 == 0) {
                System.out.println(x);
            }
        }
    }
}