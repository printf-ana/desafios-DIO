using System;

namespace ConsoleApplication {
    class Program {
        static void Main(string[] args) {
            var linhas = int.Parse(Console.ReadLine());
            if (1 <= linhas && linhas < 1000) {
                for (var i = 1; i <= linhas; i ++) {
                    Console.WriteLine($"{Math.Pow(i, 1)} {Math.Pow(i, 2)} {Math.Pow(i, 3)}");
                }
            } else {
                Environment.Exit(-1);
            }
        }
    }
}