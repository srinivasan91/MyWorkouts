

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class IMV {

	public static void main(String[] args) {
//		
//	List<Integer> list = new ArrayList<>();
//		
//	Scanner sc = new Scanner (System.in);
//	System.out.println("Enter the Number of elements : ");
//	
//	int no = sc.nextInt();
//	
//	System.out.println("Enter the elements one by one : ");
//	
//	for(int i=1; i<=no ; i++) {
//		list.add(sc.nextInt());
//	}
//	
	
	
	List<Integer> list = Arrays.asList(1,5,null,1,2,2,null,3);
	
	List<List<Integer>> subList = new ArrayList<>();
	List<Integer> intList = new ArrayList<>();
	int i =0;
	for(Integer e : list) {
		i++;
		if(e != null) {
			intList.add(e);
		} else {
			subList.add(intList);
			intList = new ArrayList<>();
		}
		if(list.size() == i) {
			subList.add(intList);
		}
	}
	
	subList.forEach(System.out::print);
	
	System.out.println("\nMaxSum ::::::::::::::::::::::::::::: " + maxSum(subList));
	System.out.println("MinAvg ::::::::::::::::::::::::::::: " + minAvg(subList));
	
		
	}
	
	static List<Integer> maxSum(List<List<Integer>> subList){
	
		List<Integer> finalList = new ArrayList<>();
		Map<Integer, List<Integer>> map =  new HashMap<>();
		List<Integer> maxList = new ArrayList<>();
		
		for(List<Integer> list : subList) {
			Integer total = 0;
			for(Integer e : list) {
				total = e + total;
			}
			map.put(total, list);
			maxList.add(total);
		}
		
//		map.forEach((k, v) -> System.out.println("key = " + k +"\n" + "value = " + v ));
		Integer finalVal = Collections.max(maxList);
		
		
		return map.get(finalVal);
	}
	
	static List<Integer> minAvg(List<List<Integer>> subList){
		List<Integer> finalList = new ArrayList<>();
		Map<Float, List<Integer>> map =  new HashMap<>();
		List<Float> maxList = new ArrayList<>();
		
		for(List<Integer> list : subList) {
			float total = 0;
			for(Integer e : list) {
				total = e + total;
			}
			map.put((total/(list.size())), list);
			maxList.add(total/list.size());
		}
//		map.forEach((k, v) -> System.out.println("key = " + k +"\n" + "value = " + v ));
		float finalMin = Collections.min(maxList);
		
		
		return map.get(finalMin);
	}
	
	
	
	
}
