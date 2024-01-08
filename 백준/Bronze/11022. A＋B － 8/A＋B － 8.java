import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int countOfCase = Integer.parseInt(br.readLine());

        for (int i =0; i < countOfCase; i++) {
            String[] input = br.readLine().split(" ");
            StringBuffer sb = new StringBuffer();
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            bw.write(sb.append("Case #").append(i + 1).append(": ").append(a).append(" + ").append(b).append(" = ").append(a + b).append("\n").toString());
        }

        bw.flush();
        bw.close();
    }

}