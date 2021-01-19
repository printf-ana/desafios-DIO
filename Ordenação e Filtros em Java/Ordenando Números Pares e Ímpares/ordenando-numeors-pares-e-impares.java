import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class OrderingEvenNumbers {

    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());        
        
        int N = Integer.parseInt(st.nextToken());
                    
        ArrayList<Integer> entrada = new ArrayList<Integer>();
        ArrayList<Integer> pares = new ArrayList<Integer>();
        ArrayList<Integer> impares = new ArrayList<Integer>();

        for (int i = 0; i < N; i++) {
            
            st = new StringTokenizer(br.readLine());
            entrada.add(Integer.parseInt(st.nextToken()));
            
            if (entrada.get(i) % 2 == 0) {
                
                pares.add(entrada.get(i));
            
            } else {
               
                impares.add(entrada.get(i));
            
            }
        
        }
        
        Collections.sort(pares);    
        Collections.sort(impares);        

        Collections.reverse(impares);

        for (int par : pares) {
        
            System.out.println(par);
        
        }
        
        for (int impar : impares) {
            
            System.out.println(impar);
        
        }

    }

}