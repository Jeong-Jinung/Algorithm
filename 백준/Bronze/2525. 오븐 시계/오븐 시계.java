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

        StringTokenizer nowTime = new StringTokenizer(br.readLine()); // 현재 시 / 분
        int cookTime = Integer.parseInt(br.readLine()); // 요리 시간 (분단위)

        int h = Integer.parseInt(nowTime.nextToken());
        int m = Integer.parseInt(nowTime.nextToken());

        if (m + cookTime >= 60) {
            h = (h + (m + cookTime) / 60) % 24;
            m = (m + cookTime) % 60;
        } else {
            m += cookTime;
        }

        bw.write(h + " " + m);

        bw.flush();
        bw.close();
    }
}