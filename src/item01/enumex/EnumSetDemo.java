package item01.enumex;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

enum WeekDay {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumSetDemo {

	public static void main(String[] args) {
		Set<WeekDay> daysOff = EnumSet.of(WeekDay.SUNDAY, WeekDay.SATURDAY);
		Iterator<WeekDay> iter = daysOff.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		
		for(WeekDay wd: EnumSet.range(WeekDay.MONDAY, WeekDay.FRIDAY)){
			System.out.println(wd);
		}
	}
}
