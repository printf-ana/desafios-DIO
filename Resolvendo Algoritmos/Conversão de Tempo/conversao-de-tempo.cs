using System;

namespace Desafios.ResolvendoAlgoritmos {
    class ConversaoTempo {
        static void Main(string[] args) {
            var timeInSeconds = int.Parse(Console.ReadLine());
            var hours = timeInSeconds / (60 * 60);
            timeInSeconds = timeInSeconds % (60 * 60);
            var minutes = timeInSeconds / 60;
            var seconds = timeInSeconds % 60;

            Console.WriteLine($"{hours}:{minutes}:{seconds}");
        }
    }
}