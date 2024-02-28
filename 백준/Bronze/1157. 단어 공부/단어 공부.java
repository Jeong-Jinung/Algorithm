import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        String lowerCase = input.toLowerCase(Locale.ENGLISH);

        Stream<Character> stream = lowerCase.chars().mapToObj(c -> (char) c);
        Map<Character, Integer> countMap = stream
            .collect(Collectors.toMap(Function.identity(), value -> 1, Integer::sum));

        List<Character> maxCharList = countMap.entrySet().stream()
            .filter(e -> e.getValue().equals(countMap.values().stream().max(Integer::compareTo).get()))
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());

        if (maxCharList.size() > 1) {
            bw.write("?");
        } else {
            bw.write(maxCharList.get(0).toString().toUpperCase(Locale.ENGLISH));
        }


        bw.flush();
        bw.close();
    }
}