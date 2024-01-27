import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 테스트 개수
        int t = Integer.parseInt(br.readLine());
        // 각 글자를 담을 배열
        String[] words = new String[t];
        for (int i = 0; i < t; i++) {
            words[i] = br.readLine();
        }

        for (int i = 0; i < t; i++) {
            if (words[i].length() == 1) {
                bw.write(words[i] + words[i] + "\n");
            } else {
                String first = String.valueOf(words[i].charAt(0));
                String last = String.valueOf(words[i].charAt(words[i].length() - 1));
                bw.write(first + last + "\n");
            }
        }

        bw.flush();
        bw.close();
    }

}