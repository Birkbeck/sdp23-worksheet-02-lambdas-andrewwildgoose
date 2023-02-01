import java.util.List;

public class BetterEntry {

    public <T extends Comparable> Boolean twoElementPredicate(T s1, T s2){
        List<T> sortItems = List.of(s1, s2);
        sortItems.sort(T::compareTo);
        return sortItems.get(0).equals(s1);
    }
    public static <T extends Comparable> T betterEntry(T s1, T s2, TwoElementPredicate a){
        if(a.twoElementPredicate(s1, s2)) {
            return s1;
        }else{
            return s2;
        }

    }

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "what";

        String result = betterEntry(str1, str2, (a, b) -> a.length() > b.length());
        System.out.println("Result: " + result);


    }
}
