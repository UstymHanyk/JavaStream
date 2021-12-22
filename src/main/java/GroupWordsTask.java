import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordsTask {
    public Map<Character, Long> groupIt(List<String> arr) {
        Map<Character, Long> groupMap = arr.stream()
                .collect(Collectors.groupingBy(strKey -> strKey.charAt(0), HashMap::new, Collectors.toList()))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(strKey -> strKey.getKey(), strVal -> strVal.getValue()
                        .stream()
                        .flatMap(str -> Arrays.stream(str.split("")))
                        .filter(chr -> chr.equals(strVal.getKey().toString()))
                        .count()));

        return groupMap;
    }
}