import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //배열 만들어서 풀어보기
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 바구니 갯수
        int m = Integer.parseInt(st.nextToken()); // 공을 몇번 넣을 것인지

        int[] arr = new int[n]; // 바구니 배열

        for (int i = 0; i < m; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st2.nextToken());
            int end = Integer.parseInt(st2.nextToken());
            int number = Integer.parseInt(st2.nextToken());

            for (int j = start - 1; j < end; j++) {
                arr[j] = number;
            }
        }

        StringBuffer sb = new StringBuffer();
        Arrays.stream(arr).forEach(i -> sb.append(i + " "));

        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }
}