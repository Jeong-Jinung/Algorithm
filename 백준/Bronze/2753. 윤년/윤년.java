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
        StringTokenizer st = new StringTokenizer(br.readLine());
        //윤년 4의배수 and 100의 배수가 아닐때 or 400의 배수일때
        Integer year = Integer.parseInt(st.nextToken());
        String answer = "";
        
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            answer = "1";
        } else {
            answer = "0";
        }

        bw.write(answer);

        bw.flush();
        bw.close();
    }
}