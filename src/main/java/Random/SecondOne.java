package Random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondOne {


    public int countOfAvailableSeats(int n, String s) {

        String str[] = s.split(" ");

        List<String> occupied = Arrays.asList(str);

        int available = 0;

        for (int i = 1; i <= n; i++) {

            if (!occupied.contains(i + "A") && !occupied.contains(i + "B") && !occupied.contains(i + "C")) {
                available++;
            }
            if (!occupied.contains(i + "D") && !occupied.contains(i + "G") && !(occupied.contains(i + "E") || occupied.contains(i + "F"))) {
                available++;
            }
            if (!occupied.contains(i + "H") && !occupied.contains(i + "J") && !occupied.contains(i + "K")) {
                available++;
            }
        }

        return available;

    }
}
