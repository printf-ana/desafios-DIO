import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GymkhanaInTheCamp {

	public static void main(String[] args) {
        
        Scanner scr = new Scanner(System.in);
		List<String> listaAlunos = new ArrayList<>(); 
		
		int numeroDeAlunos;
		String aluno;
		String valorFicha;
		int valorAtualFicha;
		int indiceAtual;
		int indiceAlunoEliminado;
		
		numeroDeAlunos = Integer.parseInt(scr.next());
		
		while (numeroDeAlunos > 0) {
            
            for (int i = 0; i < numeroDeAlunos; i++) {
				
				aluno = scr.next();
				valorFicha = scr.next();	
				listaAlunos.add(aluno.trim() + " " + valorFicha.trim());
            
            }
			
			indiceAtual = 0;
			indiceAlunoEliminado = 0;
			valorAtualFicha = Integer.parseInt(listaAlunos.get(indiceAtual).split(" ")[1]);
			
			for (int i = 0; i < numeroDeAlunos - 1; i++) {

				if (valorAtualFicha % 2 == 0) {
                    
                    indiceAlunoEliminado = (listaAlunos.size() - (valorAtualFicha % listaAlunos.size()) + indiceAtual) % listaAlunos.size();
					
				} else if (valorAtualFicha % 2 != 0) {
                    
                    indiceAlunoEliminado = (valorAtualFicha % listaAlunos.size() + indiceAtual) % listaAlunos.size();
                
                }
				
			valorAtualFicha = Integer.parseInt(listaAlunos.get(indiceAlunoEliminado).split(" ")[1]);
			listaAlunos.remove(indiceAlunoEliminado);

			indiceAtual = (valorAtualFicha % 2 == 0) ? 
					((indiceAlunoEliminado <= listaAlunos.size() - 1) ? 
							indiceAlunoEliminado : 0):
						((indiceAlunoEliminado == 0) ?
							(listaAlunos.size() - 1):(indiceAlunoEliminado - 1));
				
			}

			System.out.println("Vencedor(a): " + listaAlunos.get(0).split(" ")[0]);
			
			listaAlunos.clear();
			numeroDeAlunos = Integer.parseInt(scr.next());
						
		}
			
		scr.close();
		
	}

}