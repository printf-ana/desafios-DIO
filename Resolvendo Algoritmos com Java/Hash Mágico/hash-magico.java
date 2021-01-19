import java.util.ArrayList;
import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int N = Integer.parseInt(input);
        
        for (int i = 0; i < N; i++) {
            
            int L = sc.nextInt();
            int result = 0;
            
            for (int j = 0; j < L; j++) {
                
                String lines = sc.next();
                
                char[] array = lines.toCharArray();
                
                for (int z = 0; z < array.length; z++) {
                    
                    int alPos = (int) array[z] - 65;
					result += alPos + j + z;
                
                }
            
            }
            
            System.out.println(result);
        
        }
    
    }

}