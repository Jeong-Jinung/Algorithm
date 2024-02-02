import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();
        String[] words = word.split("");
        // 몇번째에 해당 알파벳이 등장하는지 넣기
        Map<String, Integer> result = new LinkedHashMap<>();
        StringBuffer sb = new StringBuffer();

        //주어진 단어가 몇번째에 등장하는지 넣기
        for (int i = 0; i < words.length; i++) {
            if (!result.containsKey(words[i])) {
                result.put(words[i], i);
            }

        }
        
        for (int i = 0; i < 26; i++) {
            if (!result.containsKey(String.valueOf((char)(i + 97)))) {
                sb.append("-1 ");
            } else {
                sb.append(result.get(String.valueOf((char)(i + 97))) + " ");
            }
        }

        bw.write(sb.toString().stripTrailing());
        bw.flush();
        bw.close();
    }

}