import java.util.List;
import java.util.stream.Collectors;

public class MapTask {
    public static List<Integer> mapping(List<String> arr){
        List<Integer> newArr = arr.stream().filter(x -> x.matches("\\d+")).map(Integer::parseInt).collect(Collectors.toList());
        return newArr;
    }
}
