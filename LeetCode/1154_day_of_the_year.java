import java.time.*

class Solution {
    public int dayOfYear(String date) {
        LocalDate parsedDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        return parsedDate.getDayOfYear();
    }
}
