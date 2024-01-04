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

        StringTokenizer dice = new StringTokenizer(br.readLine());

        int pip1 = Integer.parseInt(dice.nextToken());
        int pip2 = Integer.parseInt(dice.nextToken());
        int pip3 = Integer.parseInt(dice.nextToken());

        int answer = getAnswer(pip1, pip2, pip3);
        
        bw.write(String.valueOf(answer));

        bw.flush();
        bw.close();
    }

    private static int getAnswer(int pip1, int pip2, int pip3) {
        int answer = 0;

        if (pip1 == pip2 && pip2 == pip3) {
            answer = 10000 + (pip1 * 1000);
        } else if (pip1 == pip2 || pip1 == pip3 || pip2 == pip3) {
            if (pip1 == pip2) {
                answer = 1000 + (pip1 * 100);
            } else if (pip1 == pip3) {
                answer = 1000 + (pip1 * 100);
            } else {
                answer = 1000 + (pip2 * 100);
            }
        } else {
            answer = Math.max(Math.max(pip1, pip2), pip3) * 100;
        }
        return answer;
    }
}