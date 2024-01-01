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

        String answer = "";
        String a = st.nextToken();
        String b = st.nextToken();

        if (Integer.parseInt(a) > Integer.parseInt(b)) {
            answer = ">";
        } else if (Integer.parseInt(a) < Integer.parseInt(b)) {
            answer = "<";
        } else {
            answer = "==";
        }

        bw.write(answer);

        bw.flush();
        bw.close();
    }
}