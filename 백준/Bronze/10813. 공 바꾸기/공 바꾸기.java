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
        int m = Integer.parseInt(st.nextToken()); // 공을 몇번 바꿀것인가?

        int[] arr = new int[n]; // 바구니 배열

        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < m; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());
            int temp = 0;

            temp = arr[a-1];
            arr[a-1] = arr[b-1];
            arr[b-1] = temp;
        }

        StringBuffer sb = new StringBuffer();
        Arrays.stream(arr).forEach(i -> sb.append(i + " "));

        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }
}