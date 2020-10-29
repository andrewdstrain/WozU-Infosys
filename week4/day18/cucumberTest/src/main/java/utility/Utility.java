package utility;

import java.util.List;

public class Utility {
    public static String isItFriday(String day) {
        return day.equals("Friday") ? "TGIF" : "Nope";
    }

    public static Integer calculateAverage(List<Integer> scores) {
        Integer total = 0;
        int count = 0;

        for (Integer score : scores) {
            total += score;
            count += 1;
        }

        return ((Long) Math.round(total.doubleValue() / (double) count)).intValue();
    }
}
