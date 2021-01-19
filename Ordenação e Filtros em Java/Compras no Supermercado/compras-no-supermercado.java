import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SupermarketShopping {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        String produtos;

        List<List<String>> listaProdutos = new ArrayList<>() {
            
            private static final long serialVersionUID = 1L;

            @Override
            public String toString() {
                
                StringBuilder stb = new StringBuilder();
                
                for (int i = 0; i < this.size(); i++) {
                    
                    stb.append(this.get(i) + " ");
                
                }

                return stb.toString();
            
            }
        
        };

        Set<String> set = new TreeSet<>();

        int N = scr.nextInt();

        scr.nextLine();

        for (int i = 0; i <N; i++) {

            produtos = scr.nextLine();
            String[] produto = produtos.split(" ");

            for (int j = 0; j < produto.length; j++) {
                
                set.add(produto[j].toLowerCase());
            
            }

            List<String> listaP = new ArrayList<>() {

                private static final long serialVersionUID = 1L;

                @Override
                public String toString() {
                    
                    StringBuilder stb = new StringBuilder();
                    
                    for (int i = 0; i < this.size(); i++) {
                    
                        stb.append(this.get(i) + " ");
                    
                    }

                    return stb.toString();
                
                }
            
            };

            Iterator<String> iterator = set.iterator();
            
            while (iterator.hasNext()) {
                
                listaP.add(iterator.next());
            
            }
            
            listaProdutos.add(listaP);
            set.clear();
        
        }
        
        listaProdutos.forEach(System.out::println);
        scr.close();
    
    }

}