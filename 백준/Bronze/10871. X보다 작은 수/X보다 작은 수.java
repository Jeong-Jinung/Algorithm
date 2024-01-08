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

        StringTokenizer a = new StringTokenizer(br.readLine());
        StringTokenizer b = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(a.nextToken());
        int x = Integer.parseInt(a.nextToken());

        while (b.hasMoreTokens()) {
            int num = Integer.parseInt(b.nextToken());
            if (num < x) {
                bw.write(String.valueOf(num));
                if (b.hasMoreTokens()) {
                    bw.write(" ");
                }
            }
        }

        bw.flush();
        bw.close();
    }

}