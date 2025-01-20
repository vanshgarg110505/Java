class Solution {
    public double angleClock(int hour, int minutes) {
        hour = hour % 12;
        double hourAngle = (30 * hour) + (0.5 * minutes);
        double minutesAngle = 6 * minutes;
        double angle = Math.abs(hourAngle - minutesAngle);
        return Math.min(angle, 360-angle);
    }
}
