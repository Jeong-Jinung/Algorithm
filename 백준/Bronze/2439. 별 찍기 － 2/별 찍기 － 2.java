import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int countOfStart = Integer.parseInt(br.readLine());

        for (int i = 0; i < countOfStart; i++) {
            int blank = countOfStart - (i + 1);
            int star = countOfStart - blank;

            for (int k = 0; k < blank ; k++) {
                bw.write(" ");
            }

            for(int k = 0; k < star; k++) {
                bw.write("*");
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }

}