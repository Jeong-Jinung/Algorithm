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

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int numberOfRepetitions = Integer.parseInt(st.nextToken());
            String word = st.nextToken();
            StringBuffer sb = new StringBuffer();

            for (int j = 0; j < word.length(); j++) {

                for (int k = 0; k < numberOfRepetitions; k++) {
                    sb.append(word.charAt(j));
                }
            }
            if (i != t - 1) {
                sb.append("\n");
            }
            bw.write(sb.toString());
        }

        bw.flush();
        bw.close();
    }
}