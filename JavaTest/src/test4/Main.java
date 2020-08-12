package test4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Main {
	
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		int year = c.get(c.YEAR);
		int month = c.get(c.MONTH) + 1;
		int day = c.get(c.DATE);
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
	}

}
