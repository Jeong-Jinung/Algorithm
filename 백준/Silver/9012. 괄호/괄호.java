import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine()); // 테스트 케이스 수

        for (int i = 0; i < count; i++) {
            char[] charArray = br.readLine().toCharArray();// 주어진 문자열
            Deque<Character> deque = new ArrayDeque<>();
            boolean isValid = true;

            for (char vp : charArray) {
                if (vp == '(') {
                    deque.push(vp);
                } else {
                    if (deque.isEmpty()) {
                        bw.write("NO \n");
                        isValid = false;
                        break;
                    }
                    deque.pop();
                }
            }

            if (isValid) {
                if (deque.isEmpty()) {
                    bw.write("YES \n");
                } else {
                    bw.write("NO \n");
                }
            }


        }

        bw.flush();
        bw.close();
    }

}