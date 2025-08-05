package myproject;
import java.util.*;
public class date_time {
public static void main(String args[]) {
  Calendar c=Calendar.getInstance();
  Date d=c.getTime();
  System.out.println(d);
  c.set(2025, c.JULY,22);
  int year=c.getWeekYear();
  System.out.println(year);
  int h=c.getFirstDayOfWeek();
  System.out.println(h);
}
}
