import java.util.List;

public class BetterString implements TwoStringPredicate{

    public Boolean twoStringPredicate(String s1, String s2){
        List<String> sortItems = List.of(s1, s2);
        sortItems.sort(String::compareTo);
        return sortItems.get(0).equals(s1);
    }
    public static String betterString(String s1, String s2, TwoStringPredicate a){
        if(a.twoStringPredicate(s1, s2)) {
            return s1;
        }else{
            return s2;
        }

    }

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "what";

        String result = betterString(str1, str2, (a, b) -> a.length() > b.length());
        System.out.println("Result: " + result);


    }
}
