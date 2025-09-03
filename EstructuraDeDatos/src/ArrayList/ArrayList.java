package ArrayList;

import java.util.List;

public class ArrayList {
    public static void main(String[]args){
        List<String> students = new java.util.ArrayList<>();

        students.add("Maria");
        students.add("Pedro");
        students.add("Federico");
        students.add("Jann");

        System.out.println("1.- "+ students.get(0));
        System.out.println("ESTUDIANTES::: "+ students);
    }
}
