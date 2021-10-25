import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SamplePgm {

	
	public static void main(String[] args) {
		
		Map<Integer, String> daysMap = new LinkedHashMap<>();
		
		List<Integer> intList = Arrays.asList(12, 45, 3, 6, 7);
		
		List<Integer> evenList = intList.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println("Even List : "+ evenList);
		
		daysMap.put(1, "Sunday");
		daysMap.put(2, "Monday");
		daysMap.put(3, "Tuesday");
		daysMap.put(4, "Wednesday");
		daysMap.put(5, "Thursday");
		daysMap.put(6, "Friday");
		daysMap.put(7, "Saturday");
		
		int deleiveryDaysCount = 5;
		DayOfWeek currentDay = LocalDate.now().getDayOfWeek(); 
		
		DayOfWeek ExpectedDay = LocalDate.now().plusDays(deleiveryDaysCount).getDayOfWeek();
		if(ExpectedDay.equals(DayOfWeek.SUNDAY)) {
			System.out.println("ExpectedDay : " +  ExpectedDay.plus(1));
		} else if(ExpectedDay.equals(DayOfWeek.SATURDAY)) {
			System.out.println("ExpectedDay : " +  ExpectedDay.plus(2));
		}
		
//		for(Map.Entry<Integer, String> entry : daysMap.entrySet()) {
//			if(entry.getValue()) {
//				
//			}
//			
//		}
		
		
	}
	
	
	
	
	
}
