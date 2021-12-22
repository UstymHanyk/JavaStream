import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlattingTask {
    public static List<String> flattingStrings(List<String> arr){
        List<String> newArr = arr.stream().flatMap(x -> Arrays.stream(x.split(""))).collect(Collectors.toList());
        return newArr;
    }
}
