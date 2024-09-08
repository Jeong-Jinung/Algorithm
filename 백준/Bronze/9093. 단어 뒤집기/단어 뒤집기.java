import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int n = Integer.parseInt(br.readLine()); // 테스트 케이스 수

        for (int k = 0; k < n; k++) {

            String str = br.readLine(); // 문장
            String[] separateSentence = str.split(" ");

            for (int i = 0; i < separateSentence.length; i++) {

                final String word = separateSentence[i];

                if (word.length() == 1) {
                    bw.write(word + " ");
                } else {
                    int  length= (word.length() / 2);
                    char[] charArray = word.toCharArray();
                    
                    for (int j = 0; j < length; j++) {
                        int charArrayLength = charArray.length;
                        int switchIndex = charArrayLength - 1 - j;

                        char temp = charArray[j]; // 템프에 첫번째 문자 저장
                        charArray[j] = charArray[switchIndex]; // 첫번째 자리에 마지막 문자를 넣기
                        charArray[switchIndex] = temp; // 마지막 자리에 템프를 넣기
                    }
                    bw.write(new String(charArray) + " ");
                }
            }

            if (k != n - 1) {
                bw.write("\n");
            }

        }


        bw.flush();
        bw.close();
    }

}