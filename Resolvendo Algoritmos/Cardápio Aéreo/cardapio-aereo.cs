using System;

class Desafio {
    static void Main() {
        string[] line1 = Console.ReadLine().Split(' ');
            int Ca = int.Parse(line1[0]);
            int Ba = int.Parse(line1[1]);
            int Pa = int.Parse(line1[2]);

        string[] line2 = Console.ReadLine().Split(' ');
            int Cr = int.Parse(line2[0]);
            int Br = int.Parse(line2[1]);
            int Pr = int.Parse(line2[2]);
            int resposta = sobra(Ca, Cr) + sobra(Ba, Br) + sobra(Pa, Pr);
            
            Console.WriteLine($"{resposta}");
    }

    public static int sobra(int x, int y) {
      int resultado = y - x;
      if (resultado >= 0) {
        return resultado;
      }
        return 0;
    }
}