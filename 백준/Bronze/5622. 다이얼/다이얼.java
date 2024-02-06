import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();

        Map<Integer, String> dialMap = new HashMap<>();
        dialMap.put(2, "ABC");
        dialMap.put(3, "DEF");
        dialMap.put(4, "GHI");
        dialMap.put(5, "JKL");
        dialMap.put(6, "MNO");
        dialMap.put(7, "PQRS");
        dialMap.put(8, "TUV");
        dialMap.put(9, "WXYZ");

        String[] splitWord = word.split("");
        int seconds = 0;

        for (String s : splitWord) {
            for (Integer key : dialMap.keySet()) {
                if (dialMap.get(key).contains(s)) {
                    seconds += key + 1;
                }
            }
        }
        bw.write(String.valueOf(seconds));
        bw.flush();
        bw.close();
    }
}