import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 5행 열은 정해지지 않음
        String[][] arr = new String[5][];

        for (int i = 0; i < arr.length; i++) {
            String[] split = br.readLine().split("");
            arr[i] = split;
        }

        for (int i = 0; i < 15; i++) {
            if (arr[0].length > i) {
                bw.write(arr[0][i]);
            }
            if (arr[1].length > i) {
                bw.write(arr[1][i]);
            }
            if (arr[2].length > i) {
                bw.write(arr[2][i]);
            }
            if (arr[3].length > i) {
                bw.write(arr[3][i]);
            }
            if (arr[4].length > i) {
                bw.write(arr[4][i]);
            }
        }

        bw.flush();
        bw.close();
    }
}