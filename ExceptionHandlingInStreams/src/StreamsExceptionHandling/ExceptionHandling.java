package StreamsExceptionHandling;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import javax.management.RuntimeErrorException;


public class ExceptionHandling {

	public static void main(String[] args) {
		
//		List<String> list = Arrays.asList("44", "234", "67");
		
		/*
		 * To generate the Number format Exception
		 */		
		List<String> list = Arrays.asList("44", "234", "xyz");
		
		
		/* 
		 * If we uncomment this line - it will throw NumberFormatException
		 */
//		list.forEach(s -> System.out.println(Integer.parseInt(s)));

		
		/* Handling exception in non-standard way */
		System.out.println("********* Handling exception in non-standard way *********");
		list.forEach(s -> {
			try {
				System.out.println(Integer.parseInt(s));
			} catch(Exception e) {
				System.out.println("Exception caught : " + e.getMessage());
			}
		});
		
		System.out.println("\n****** Using User Defined Method Reference ******");
		list.forEach(ExceptionHandling::printList);
		
		System.out.println("\n****** Handling Exception Using Consumer ******");
		list.forEach(handleExceptionIfAny(s -> System.out.println(Integer.parseInt(s))));
		
		System.out.println("\n****** Handling Generic Exceptions Using Consumer ******");
		list.forEach(handleGenericException(s -> System.out.println(Integer.parseInt(s)), NumberFormatException.class));
		
		
		List<Integer> list1 = Arrays.asList(1, 0);
//		list1.forEach(s -> System.out.println(10/s));  // it will throw Arithmetic exception- divide by zero
		
		list1.forEach(handleGenericException(s -> System.out.println(10/s), ArithmeticException.class));
		
		
		System.out.println("\n****** Checked Exceptions Using Consumer ******");
		List<Integer> list3 = Arrays.asList(10,20);
		list3.forEach(handleCheckedExceptionConsumer(i -> {
			Thread.sleep(1);
			System.out.println(i);
		}));
		
		
//		List<Integer> intList = list.stream().map(s -> Integer.parseInt(s)).collect(Collectors.toList());
		
		//Method Reference
//		List<Integer> intList = list.stream().map(Integer::parseInt).collect(Collectors.toList());
//		System.out.println(intList);
		
		
		
		
	}
	
	private static void printList(String s) {
		try {
			System.out.println(Integer.parseInt(s));
		} catch(Exception e) {
			System.out.println("Exception caught : " + e.getMessage());
		}
	}
	
	private static Consumer<String> handleExceptionIfAny(Consumer<String> payLoad){
		return obj -> {
			try {
				payLoad.accept(obj);
			} catch(Exception e) {
				System.out.println("Exception caught using consumer : " + e.getMessage());
			}
		};
	}
	
	private static <Target, ExObj extends Exception> Consumer<Target> handleGenericException(
			Consumer<Target> targetConsumer, Class<ExObj> exObjClass) {
		return obj -> {
			try {
				targetConsumer.accept(obj);
			} catch (Exception ex) {
				ExObj exObj = exObjClass.cast(ex);
				System.out.println("Generic Exception caught using consumer : " + exObj.getMessage());
//				System.out.println("Generic Exception caught using consumer : " + ex.getMessage());
			}
		};
	}
	
	static <Target> Consumer<Target> handleCheckedExceptionConsumer(CheckedExceptionHandlerConsumer<Target, Exception> handlerException){
		return obj -> {
			try {
				handlerException.accept(obj);
			} catch (Exception ex) {
				throw new RuntimeException(ex);
			}
		};
		
	}
}
