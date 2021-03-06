package feature;

import java.util.ArrayList;
import java.util.List;

public class forEachExample {

	public static void main(String[] args) {
		// Lambda expression for foreach funcionality
		List<String> list=new ArrayList<String>();  
        list.add("ankit");  
        list.add("mayank");  
        list.add("irfan");  
        list.add("jai");  
        
        // For each old implementation
        for(String str : list) {
        	
        }
        // For each new implementation
        list.forEach(  
            n->System.out.println(n)
        );  

	}

}
