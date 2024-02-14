import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int start = 1;
        int max = n * 2 - 1;
        String asterisk = "*";

        for (int i = 1; i <= n; i++) {
            bw.write(" ".repeat(n-i));
            bw.write(asterisk.repeat(start));
//            bw.write(" ".repeat(n-i));
            start += 2;
            bw.newLine();
        }

        start = max - 2;

        for(int i = n-1; i > 0; i--) {
            bw.write(" ".repeat(n-i));
            bw.write(asterisk.repeat(start));
//            bw.write(" ".repeat(n-i));
            start -= 2;
            if (i != 1) {
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
    }
}