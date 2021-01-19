using System;

namespace Desafios {
    class MinhaClasse {
        public static void Main (string[] args) {
            int input = 0;
            while(input < 3) {
                int N = int.Parse(Console.ReadLine());
                if(N>=1 && N<=500) {
                    string[] velocidadeTartarugas = Console.ReadLine().Split(" ");
                    int[] inteiros = new int[velocidadeTartarugas.Length];
                    int maior = 0;
                    for (int i=0; i<velocidadeTartarugas.Length; i++) {
                        if(int.Parse(velocidadeTartarugas[i])>=1 && int.Parse(velocidadeTartarugas[i])<=50) {
                            inteiros[i] = int.Parse(velocidadeTartarugas[i]);
                            if(maior < inteiros[i]) {
                                maior = inteiros[i];
                                }
                            }
                        }
                        if(maior<10) {
                            Console.WriteLine("1");
                            } else if(maior>=10 && maior<20) {
                                Console.WriteLine("2");
                                } else if (maior>=20){
                                    Console.WriteLine("3");
                                    }
                            }
                        input ++;
  }

  }
}

}