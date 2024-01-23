import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 단어를 split 해서 list 로 만들고 size 확인
        List<String> words = Arrays.asList(br.readLine().split(""));
        int size = words.size();

        bw.write(String.valueOf(size));
        bw.flush();
        bw.close();
    }

}