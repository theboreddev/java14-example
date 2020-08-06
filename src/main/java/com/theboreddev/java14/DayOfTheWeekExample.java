package com.theboreddev.java14;

public class DayOfTheWeekExample {

    public static void main(String[] args) {

        final DayOfTheWeek dayOfTheWeek = DayOfTheWeek.THURSDAY;

        int position = 0;

        switch (dayOfTheWeek) {
            case MONDAY:
                position = 1;
                break;
            case TUESDAY:
                position = 2;
                break;
            case WEDNESDAY:
                position = 3;
                break;
            case THURSDAY:
                position = 4;
                break;
            case FRIDAY:
                position = 5;
                break;
            case SATURDAY:
                position = 6;
                break;
            case SUNDAY:
                position = 7;
                break;
        }

        System.out.println("Day " + dayOfTheWeek + " is in position " + position + " of the week");
    }
}
