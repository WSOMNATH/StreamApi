package StreamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;



public class CaloriesQ1 {

	public static void main(String[] args) {
		
		List<Fruits> fruitslist=Arrays.asList(new Fruits("Mango",95, 90,"Yellow"),
		new Fruits("Apple", 95, 30, "Red"),
	    new Fruits("Mango", 25, 10,"Red"),
		new Fruits("Tomato", 10, 10, "Red"),
		new Fruits("Grapes", 15, 20, "Green"));
		
		//fruits.forEach(System.out::println);
	
		List<Fruits>sortedList=fruitslist.stream().sorted(Comparator.comparingInt(Fruits::getCalories).reversed()).collect(Collectors.toList());
		System.out.println("Fruits with calories<100 are:");
		sortedList.forEach(System.out::println);

		
		

	}

}