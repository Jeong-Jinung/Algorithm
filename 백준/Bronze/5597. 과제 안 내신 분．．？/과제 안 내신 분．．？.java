import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //배열 만들어서 풀어보기
        int[] arr = new int[28];
        List<Integer> anwser = new ArrayList<>();
        Map<Integer, Integer> arrMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            arrMap.put(Integer.parseInt(br.readLine()), i);
        }

        for (int i = 1; i < 31; i++) {
            if (!arrMap.containsKey(i)) {
                anwser.add(i);
            }
        }

        List<Integer> collect = anwser.stream().sorted().collect(Collectors.toList());

        bw.write(collect.get(0) + "\n" + collect.get(1));

        bw.flush();
        bw.close();
    }
}