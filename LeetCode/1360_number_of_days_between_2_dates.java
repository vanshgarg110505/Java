import java.time.*;
import java.time.format.*;
import java.time.temporal.*;

class Solution {
    public int daysBetweenDates(String date1, String date2) {
        LocalDate d1 = LocalDate.parse(date1);
        LocalDate d2 = LocalDate.parse(date2);

        return (int)Math.abs(ChronoUnit.DAYS.between(d1,d2));
    }
}
