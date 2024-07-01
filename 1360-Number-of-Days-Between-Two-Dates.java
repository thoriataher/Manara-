class Solution {
    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(getDaysSince1971(date1) - getDaysSince1971(date2));
    }

    int[] monthDays = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    public int getDaysSince1971(String date) {
        String[] data = date.split("-");
        int year = Integer.parseInt(data[0]);
        int month = Integer.parseInt(data[1]);
        int day = Integer.parseInt(data[2]);
        int dayCount = 0;

        for (int i = 1971; i < year; i++) {
            dayCount += isLeapYear(i) ? 366 : 365;
        }

        for (int i = 1; i < month; i++) {
            if (isLeapYear(year) && i == 2) {
                dayCount += 29;
            } else {
                dayCount += monthDays[i];
            }
        }
        dayCount += day;
        return dayCount;
    }

    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}