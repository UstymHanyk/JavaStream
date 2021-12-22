import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzTask {
    public static List<String> fizzBuzzIt(Integer n){
        List<Integer> arr = IntStream.range(1,n+1).boxed().collect(Collectors.toList());
        List<String> newArr = arr.stream().map(x -> ((x%3!=0)&(x%5!=0)? x: "") + (x%3==0? "Fizz": "") + (x%5==0? "Buzz": "")).collect(Collectors.toList());
        return newArr;
    }
}

