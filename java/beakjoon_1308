import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int year = Integer.parseInt(st.nextToken());
        int month = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());
        
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int d_year = Integer.parseInt(st2.nextToken());
        int d_month = Integer.parseInt(st2.nextToken());
        int d_day = Integer.parseInt(st2.nextToken());
    
        if ((d_year - year > 1000) || (d_year - year == 1000 && d_month > month)
				|| (d_year - year == 1000 && d_month == month && d_day >= day)) {
            System.out.println("gg");
        }
        else {
            int Cal_day1 = totalDay(year, month, day);
            int Cal_day2 = totalDay(d_year, d_month, d_day);
            System.out.println("D-" + (Cal_day2 - Cal_day1));
        }
    }
    
    public static int[] calDay(int year) {
        int[] day = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			day[1] = 29;
        return day;
    }
    
    public static int totalDay(int year, int month, int day) {
        int [] date;
        int days = 0;
        for (int i = 1; i < year; i++) {
            date = calDay(i);
            for (int j = 0; j < 12; j++) {
				days += date[j];
			}
        }
        
        date = calDay(year);
        for (int i = 0; i < month-1; i++) {
            days += date[i];
        }
        days += day;
        return days;
    }
}
