import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int score = Integer.parseInt(br.readLine());
        
        br.close();
        
        String grade="F";
        
        if (score>59) grade="D";
        if (score>69) grade="C";
        if (score>79) grade="B";
        if (score>89) grade="A";
        
        System.out.print(grade);
    }
}