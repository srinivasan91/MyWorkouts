import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SampleTest {
	
	public static void main(String[] args) {
		
		List<String> list1 =  Arrays.asList("test1", "test2");
		List<String> list2 =  Arrays.asList("test3", "test4");
		List<List<String>> listOfStrings =  Arrays.asList(list1, list2);
//		List<List<String>> listOfStrings1 =  Arrays.asList(["1", "2"], ["3"]);
		
		List<String> stream = listOfStrings.stream().flatMap(item -> item.stream()).collect(Collectors.toList());
		stream.forEach(System.out::println);
		
		System.out.println(stream);
	}

}
