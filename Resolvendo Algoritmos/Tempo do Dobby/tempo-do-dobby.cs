using System;

namespace Desafios.ResolvendoAlgoritmos {
    class TempoDoDobby {
        static void Main(string[] args) {
            var minutosParaFinalExpediente = int.Parse(Console.ReadLine());

            string[] tokens = Console.ReadLine().Split(" ");

            int[] convertedItems = Array.ConvertAll<string, int>(tokens, int.Parse);

            int tempoNecessarioParaPresente1 = convertedItems[0];
            int tempoNecessarioParaPresente2 = convertedItems[1];
            int tempoNecessarioPara2Presentes = tempoNecessarioParaPresente1 + tempoNecessarioParaPresente2;

            if (tempoNecessarioPara2Presentes <= minutosParaFinalExpediente) {
                Console.WriteLine("Farei hoje!");
            } else {
                Console.WriteLine("Deixa para amanha!");
            }
        }
    }
}