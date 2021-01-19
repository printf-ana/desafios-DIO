using System;
using static System.Math;

class Program {
    static void Main(string[] args) {

        string[] km = Console.ReadLine().Split(" ");
        int h = Int32.Parse(km[0]);
        int veloc = Int32.Parse(km[1]);

        double x = 12;
        double litro = (h * veloc);
        double total = litro/x;

        Console.WriteLine(total.ToString("N3"));
    }
}