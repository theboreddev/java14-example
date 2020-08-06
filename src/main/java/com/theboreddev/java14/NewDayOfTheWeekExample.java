package com.theboreddev.java14;

public class NewDayOfTheWeekExample {

    public static void main(String[] args) {

        final DayOfTheWeek dayOfTheWeek = DayOfTheWeek.THURSDAY;

        int position = switch (dayOfTheWeek) {
            case MONDAY -> 1;
            case TUESDAY -> 2;
            case WEDNESDAY -> 3;
            case THURSDAY -> 4;
            case FRIDAY -> 5;
            case SATURDAY -> 6;
            case SUNDAY -> 7;
        };

        System.out.println("Day " + dayOfTheWeek + " is in position " + position + " of the week");
    }
}
