package ArrayList;

import java.util.LinkedList;
import java.util.List;

public class linkedList {
    public static  void main(String[]args){
        List<String> cities = new LinkedList<>();


        cities.add("Mex");
        cities.add("Arg");
        cities.add("Arg");
        cities.add("Mex");

        cities.addFirst("ECU");
        cities.addLast("Goku");
        System.out.println("CITIES:::: "+cities);
    }
}
