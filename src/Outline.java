import java.util.Arrays;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Outline {

  static List<String> getCities(){
    return new ArrayList<>(Arrays.asList("London", "Cardiff", "Rome", "Birmingham", "Glasgow",
            "Belfast", "Dublin", "Madrid", "Oslo", "Warsaw", "Moscow", "Stockholm", "Bonn", "Berlin", "Paris",
            "Vienna", "Athens"));
  }

  public static int eChecker(String a){
    int answer = (a.contains("E") || a.contains("e") ? 0 : 1);
    return answer;
  }

  public static String betterString(String s1, String s2, BiFunction a){
    if(a(s1, s2) = s1) {
      return s2;
    }else{
      return s2;
    }

  }

  public static void main(String... args) { // varargs alternative to String[]
    Integer[] intArray = {1,7,3,4,8,2};
    System.out.println(Arrays.asList(intArray));
    // Arrays.sort(intArray,.......)
    String[] cities = getCities().toArray(new String[0]);
    // 1a.
    Arrays.sort(cities, (s1, s2) -> s1.length() - s2.length());
    System.out.println("Q1a. = " + Arrays.toString(cities));
    // 1b.
    cities = getCities().toArray(new String[0]);
    Arrays.sort(cities, (s1, s2) -> s2.length() - s1.length());
    System.out.println("Q1b. = " + Arrays.toString(cities));
    // 1c.
    cities = getCities().toArray(new String[0]);
    Arrays.sort(cities, (s1, s2) -> s1.charAt(0) - s2.charAt(0));
    System.out.println("Q1c. = " + Arrays.toString(cities));
    // 1d.
    cities = getCities().toArray(new String[0]);
    Arrays.sort(cities, Comparator.comparingInt(a -> (a.contains("E") || a.contains("e") ? 0 : 1)));
    System.out.println("Q1d. = " + Arrays.toString(cities));
    // 2.
    cities = getCities().toArray(new String[0]);
    Arrays.sort(cities, Comparator.comparingInt(Outline::eChecker));
    System.out.println("Q2. = " + Arrays.toString(cities));

  } 
}
