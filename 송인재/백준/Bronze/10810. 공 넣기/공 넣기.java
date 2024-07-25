import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int basket[] = new int[n];
        
        for (int i=0; i<n; i++) basket[i] = 0; 

        for (int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken())-1;
            int end = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            for (int j=start; j<end; j++) basket[j] = k;
        }

        br.close();

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<n; i++) sb.append(basket[i]).append(" ");

        System.out.print(sb);
    }
}