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

        Integer score = Integer.parseInt(st.nextToken());
        String answer = "";
        
        switch (score / 10) {
            case 10:
            case 9:
                answer = "A";
                break;
            case 8:
                answer = "B";
                break;
            case 7:
                answer = "C";
                break;
            case 6:
                answer = "D";
                break;
            default:
                answer = "F";
                break;
        }

        bw.write(answer);

        bw.flush();
        bw.close();
    }
}