package feature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.sound.midi.ControllerEventListener;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class streamsExample {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 4, 6, 8, 10); 
		ArrayList<String> list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		List<String> list3 = new ArrayList<>();
		List<String> list4 = new ArrayList<>();
		List<HashMap> mapList = new ArrayList<>();
		String combinedString = "";
		int answer = 0;
		boolean result = false;
		
		list1.add("a");
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add("d");
		list1.add("e");
		
		list2.add("a");
		/*list2.add("a");
		list2.add("a");
		list2.add("a");
		list2.add("a");
		list2.add("a");
		list2.add("a");
		list2.add("a");
		list2.add("a");*/
		list2.add("b");
		list2.add("c");
		list2.add("f");
		list2.add("g");
		list2.add("h");
		list2.add("i");
		list2.add("j");
		
		result = list1.stream().allMatch(element -> list2.contains(element));
		System.out.println(result);
		result = list1.stream().anyMatch(element -> list2.contains(element));
		System.out.println(result);
		result = list1.stream().noneMatch(element -> list2.contains(element));
		System.out.println(result);

		list3.addAll(list1);
		list3.addAll(list2);
		list4 = list3.stream().distinct().limit(list3.size()).collect(Collectors.toList());
		System.out.println("Distinct :" + list4 + " Size : " + list4.size());
  
        answer = list.stream().max(Integer::compare).get();
        System.out.println(answer);
        answer = list.stream().min(Integer::compare).get();
        System.out.println(answer);
        
        // Reduce will return a single value as a result
        // First parameter holds the result and Second parameter holds the current value of the stream
        combinedString = list1.stream().reduce((str1, str2) -> {System.out.println(str1 + " " + str2); return str1 + "_" + str2;}).get();
        System.out.println(combinedString);
		
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        List<Float> productPriceList2 =productsList.stream()  
                                     .filter(p -> p.price > 30000)// filtering data  
                                     .map(p->p.price)        // fetching price  
                                     .collect(Collectors.toList()); // collecting as list  
        System.out.println(productPriceList2);
        
        for(int i=10; i<15; i++) {
        	HashMap map = new HashMap<>();
        	map.put("Age", i);
        	mapList.add(map);
        }
        
        List resultString = mapList.stream()
        		.filter(elementMap -> Integer.parseInt(elementMap.get("Age").toString()) == 12)
        		.map(elementMap -> elementMap.get("Age")).collect(Collectors.toList());
        System.out.println("Age : " + resultString);
	}

}

class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
} 
