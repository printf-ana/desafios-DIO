using System;

namespace Desafios.IntroducaoProgramacao {
    class Distancia {
        static void Main() {
            int quilometros = Int32.Parse(Console.ReadLine());
            int minutos = quilometros * 2;
            Console.WriteLine(minutos + " minutos");
        }
    }
}