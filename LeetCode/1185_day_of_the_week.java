import java.time.*;

class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        LocalDate parsedDay = LocalDate.of(year, month, day);
        String answer =  parsedDay.getDayOfWeek().toString().toLowerCase();
        return answer.substring(0,1).toUpperCase() + answer.substring(1);
    }
}
