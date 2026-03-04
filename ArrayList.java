import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        var places= new ArrayList<String>();
        places.add("Temple");
        places.add("Park");
        places.add("Food Hub");
        places.add("Beach");
        
        places.set(2,"Memorial"); // updates
        
        System.out.println("Updated place:" + places.get(2));
        
        System.out.println("The total size is: "+ places.size());
        
        for (String i: places) {    // using for-each loop
            System.out.println(i);
        }
        
        System.out.println();
        
        places.remove(1);   // deletes
        
        Collections.sort(places);  //sorts
        
        
        for (int i=0; i<places.size(); i++) {
            System.out.println(places.get(i));
        }
        // places.clear(); //clears the entire list
        
    }
}
