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
        String number = br.readLine();

        char[] charArray = number.toCharArray();
        int result = 0;

        for (int i = 0; i < n; i++) {
            result += Integer.parseInt(String.valueOf(charArray[i]));
        }


        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }

}