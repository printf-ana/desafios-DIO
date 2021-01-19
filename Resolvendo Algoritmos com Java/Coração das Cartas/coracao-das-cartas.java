import java.util.*;

public class Main {
    
    static Map<String, Integer> m = new HashMap<String, Integer>();
    static int n;
    static int[][] pilha = new int[3][102];

    static public boolean cartas(int a, int b, int c) {
        
        String ss = "" + a + b + c;
        
        if(a == b && b == c && c == n) {
            
            m.putIfAbsent(ss, 1);
            return true;
        
        }

        int x = m.getOrDefault(ss, 0);
        
        if (x > 0) return (x == 1? true : false);
        
        if(a < n && pilha[0][a]%3 == 0 && cartas(a + 1, b, c)) {
        
            m.putIfAbsent(ss, 1);
            return true;
        
        }
        
        if(b < n && pilha[1][b]%3 == 0 && cartas(a, b + 1, c)) {
        
            m.putIfAbsent(ss, 1);
            return true;
        
        }
        
        if(c < n && pilha[2][c]%3 == 0 && cartas(a, b, c + 1)) {
        
            m.putIfAbsent(ss, 1);
            return true;
        
        }
        if(a < n && b < n && (pilha[0][a]+pilha[1][b]) % 3 == 0 && cartas(a + 1, b + 1, c)) {
            
            m.putIfAbsent(ss, 1);
            return true;
        }

        if(a < n && c < n && (pilha[0][a]+pilha[2][c]) % 3 == 0 && cartas(a + 1, b, c + 1)) {
            
            m.putIfAbsent(ss, 1);
            return true;
        
        }

        if(b < n && c < n && (pilha[1][b]+pilha[2][c])%3 == 0 && cartas(a, b + 1, c + 1)) {
            
            m.putIfAbsent(ss, 1);
            return true;
        
        }
        
        if(a < n && b < n && c < n && (pilha[0][a]+pilha[1][b]+pilha[2][c]) % 3 == 0 && cartas(a + 1, b + 1, c + 1)) {
            
            m.putIfAbsent(ss, 1);
            return true;
        }

        m.putIfAbsent(ss, 2);
        return false;
    
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while(true) {
            
            n = Integer.parseInt(in.nextLine());
            
            if (n == 0) break;
            
            for (int i = 0 ; i < n; i++) {
                
                StringTokenizer st = new StringTokenizer(in.nextLine());
                pilha[0][i] = Integer.parseInt(st.nextToken());
                pilha[1][i] = Integer.parseInt(st.nextToken());
                pilha[2][i] = Integer.parseInt(st.nextToken());
            
            }

            if (cartas(0,0,0) == true) System.out.println("1");
            else System.out.println("0");
            m.clear();
        }

    }

}