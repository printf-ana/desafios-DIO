using System;

namespace EstruturaDoPrograma {
    class Program {
        static void Main(string[] args) {
            string[] tokens = Console.ReadLine().Split(" ");
            int[] convertedItems = Array.ConvertAll<string, int>(tokens, int.Parse);

            var numPessoas = convertedItems[0];
            var numDatas = convertedItems[1];

            string data = "Pizza antes de FdA";

            for (int i = 0; i < numDatas; i++) {
                tokens = Console.ReadLine().Split(" ");
                bool aconteceEncontro = true;
                for (int j = 1; j <= numPessoas; j++) {
                    if (int.Parse(tokens[j]) != 1) {
                        aconteceEncontro = false;
                        break;
                    }
                }
                if(aconteceEncontro) {
                    if(data == "Pizza antes de FdA")
                        data = tokens[0];
                }
            }
            Console.WriteLine($"{data}");
        }
    }

}