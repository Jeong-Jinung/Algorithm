import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//        StringTokenizer st = new StringTokenizer(br.readLine());

        // 양수, 양수 - 1분면
        // 음수, 양수 - 2분면
        // 음수, 음수 - 3분면
        // 양수, 음수 - 4분면

        Integer x = Integer.parseInt(br.readLine());
        Integer y = Integer.parseInt(br.readLine());
        String answer = "";

        if (x > 0 && y > 0) {
            answer = "1";
        } else if (x < 0 && y > 0) {
            answer = "2";
        } else if (x < 0 && y < 0) {
            answer = "3";
        } else if (x > 0 && y < 0) {
            answer = "4";
        }

        bw.write(answer);

        bw.flush();
        bw.close();
    }
}