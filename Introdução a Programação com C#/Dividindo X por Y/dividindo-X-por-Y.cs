using System;

namespace ConsoleApplication {
    class Program {
        static void Main(string[] args) {
            var limit = Int32.Parse(Console.ReadLine());
            for (var i = 0; i < limit; i ++) {
                var line = Console.ReadLine().Split(' ');
                var x = Double.Parse(line[0]);
                var y = Double.Parse(line[1]);

                if (y == 0) {
                    Console.WriteLine("divisao impossivel");
                } else {
                    var divisao = x / y;

                    if (divisao < 0 && divisao.ToString("N1") == "0.0") {
                        Console.WriteLine("-0.0");
                    } else {
                        Console.WriteLine(divisao.ToString("N1"));
                    }
                }
            }
        }
    }
}