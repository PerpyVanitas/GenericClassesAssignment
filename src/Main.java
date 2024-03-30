import Arithmetic.Arithmetic;
import Map.MyMap;

public class Main {
    public static void main(String[] args) {

        Arithmetic<Integer, Double> arithmetic = new Arithmetic<>(3, 10.2);
        Object result1 = arithmetic.add();
        Object result2 = arithmetic.subtract();
        Object result3 = arithmetic.multiply();
        Object result4 = arithmetic.divide();
        Object result5 = arithmetic.getMin();
        Object result6 = arithmetic.getMax();

        System.out.println("Tests for Arithmetic: ");
        System.out.println("Class: ");
        System.out.println(STR."\{result1.getClass()}\n\{result1}");
        System.out.println("Class: ");
        System.out.println(STR."\{result2.getClass()}\n\{result2}");
        System.out.println("Class: ");
        System.out.println(STR."\{result3.getClass()}\n\{result3}");
        System.out.println("Class: ");
        System.out.println(STR."\{result4.getClass()}\n\{result4}");
        System.out.println("Class: ");
        System.out.println(STR."\{result5.getClass()}\n\{result5}");
        System.out.println("Class: ");
        System.out.println(STR."\{result6.getClass()}\n\{result6}");


        System.out.println("\n\nTests for Map: ");
        MyMap<String, Integer> myMap = new MyMap<>();
        myMap.put("Test1", 1234);
        myMap.put("Test2", 5678);
        myMap.put("Test3", 21);
        System.out.println(myMap);
        System.out.println(myMap.get("Test2"));
        System.out.println(myMap.get("Test1"));
        System.out.println(myMap.remove("Test2"));
        myMap.put("Test4", 456);
        myMap.put("Test5", 1);
        System.out.println(myMap);
        System.out.println(myMap.remove("Test"));
        System.out.println(myMap.get("Test5"));
        System.out.println(myMap.remove("Test3"));
        System.out.println(myMap);
    }
}