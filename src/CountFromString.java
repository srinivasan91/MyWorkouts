import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CountFromString {

	public static void main(String[] args) {
		
		String test = "sample test string";
		char[] testChars = test.toCharArray();
		
		long count = test.chars().filter(ch -> ch == 'e').count();
		long count2 = test.codePoints().filter(ch -> ch == 'e').count();
		long count3 = test.codePoints().filter(ch -> ch != ' ').count();
		long count4 = test.chars().count();
		
		System.out.println("count : " + count);
		System.out.println("count2: " + count2);
		System.out.println("count3: " + count3);
		System.out.println("count4: " + count4);
		
		//Java 11
//		Map<String, Long> charCount = test.codePoints().mapToObj(Character::toString)
//		        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//		System.out.println(charCount);
		
		Map<String, Long> charCount = IntStream.range(0, test.length())
		        .mapToObj(i -> test.substring(i, i + 1))
		        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));	
		System.out.println(charCount);
		
		System.out.println("****** Pritn each chars *****");
		test.chars()
        .mapToObj(i -> (char)i)
        .forEach(System.out::print);
		
		
		Stream<Character> sch = "abc".chars().mapToObj(i -> (char)i);
		System.out.println("count5: " + sch.count());

	}
}
