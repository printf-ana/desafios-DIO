using System;

namespace Desafios.ResolvendoAlgoritmos {
    class RodizioCarruagem {
        static bool validatePlaca(string placa) {
            if (placa.Length != 8) 
                return false;

            for (int j = 4; j < 8; j++) {
                if (!Char.IsDigit(placa, j)) {
                    return false;
                }
            }

            for (int j = 0; j < 3; j++) {
                if (!Char.IsUpper(placa, j)) {
                    return false;
                }
            }

            if (placa.IndexOf('-') == -1) {
                return false;
            }
            return true;
        }

        static string getAllowedDayFromDigit(int digit) {
            switch (digit) {
                case 1:
                case 2: return "SEGUNDA";

                case 3:
                case 4: return "TERCA";

                case 5:
                case 6: return "QUARTA";

                case 7:
                case 8: return "QUINTA";

                case 9:
                case 0: return "SEXTA";

                default:
                return "";
            }
        }

        static void Main(string[] args) {
            var quantidadeDeTestes = int.Parse(Console.ReadLine());
            for (int i = 0; i < quantidadeDeTestes; i++) {
                string placa = Console.ReadLine();
                if (!validatePlaca(placa)) {
                    Console.WriteLine("FALHA");
                    continue;
                }
                int lastDigit = int.Parse(placa[placa.Length - 1].ToString());
                Console.WriteLine(getAllowedDayFromDigit(lastDigit));
            }
        }
    }
}