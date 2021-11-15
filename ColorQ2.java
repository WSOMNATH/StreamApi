package StreamApi;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ColorQ2 {

	public static void main(String[] args) {
		
		List<Fruits> fruitslist=Arrays.asList(new Fruits("Mango",99, 90,"Yellow"),
		new Fruits("Apple", 95, 30, "Red"),
	    new Fruits("Strawberry", 35, 10,"Red"),
		new Fruits("Cherry", 10, 10, "Red"),
		new Fruits("Grapes", 15, 20, "Green"));
		
		//fruits.forEach(System.out::println);
		List<Fruits> colorList=fruitslist.stream().sorted(Comparator.comparing(Fruits::getColor)).collect(Collectors.toList());
		System.out.println("Colorwise sorting of fruits is:");
		colorList.forEach(System.out::println);
	}

}
