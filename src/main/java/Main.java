import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> arr = Arrays.asList("1", "ab", "2", "3");
        MapTask mapp = new MapTask();
        System.out.println("original array: " + arr);
        System.out.println("mapped array: " + mapp.mapping(arr));

        List<String> arr2 = Arrays.asList("abcd123", "0987cbd", "zxcv");
        FlattingTask flatTask = new FlattingTask();
        flatTask.flattingStrings(arr2);
        System.out.println("original array: " + arr2);
        System.out.println("flattened array: " + flatTask.flattingStrings(arr2));

        FizzBuzzTask fizzBuzzSample = new FizzBuzzTask();
        System.out.println("fizzbuzz n: " + 20);
        System.out.println("fizzzbuzz array: " + fizzBuzzSample.fizzBuzzIt(20));


        List<String> arr3 = Arrays.asList("ABCA", "BCD", "ABC");
        GroupWordsTask map3 = new GroupWordsTask();
        System.out.println("original array: " + arr3);

        System.out.println("grouped array: " + map3.groupIt(arr3));
    }
}
