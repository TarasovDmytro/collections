import com.alevel.hw14.NumberUtils;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        NumberUtils sum = new NumberUtils();

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);

        sum.getSum(numbers);
    }
}
