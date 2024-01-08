import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //배열 만들어서 풀어보기
        int[] arr = new int[9];
        int count = 1;
        
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < 9; i++) {
            if (max < arr[i]) {
                max = arr[i];
                count = i+1;
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        bw.write(max + "\n" + count);
        bw.flush();
        bw.close();
    }

}