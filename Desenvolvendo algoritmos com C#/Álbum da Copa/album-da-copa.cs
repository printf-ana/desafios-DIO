using System;

class Program
{
    static void Main(string[] args)

    {
        int numeroDeFigurinhas = int.Parse(Console.ReadLine());
        int numeroDeFigurinhasCompradas = int.Parse(Console.ReadLine());
        int totalDeFigurinhas = 0;

        int[] albumDeFigurinha = new int[numeroDeFigurinhasCompradas];

        for (int i = 0; i < numeroDeFigurinhasCompradas; i++)
        {
            string entrada = Console.ReadLine();
            if (entrada != null)
            {
                albumDeFigurinha[i] = int.Parse(entrada);
            }
        }

        for (int i = 0; i < numeroDeFigurinhasCompradas; i++)
        {
            int figurinha = albumDeFigurinha[i];
            int repetida = 0;

            for (int j = 0; j < numeroDeFigurinhasCompradas; j++)
            {
                if (albumDeFigurinha[j] == figurinha)
                {
                    repetida++;
                }
            }

            if (repetida >= 2)
            { 
                for (int j = 0; j < numeroDeFigurinhasCompradas; j++)
                {
                    if (figurinha == albumDeFigurinha[j])
                    { 
                        albumDeFigurinha[j] = -1;
                        break;
                    }
                }
            }
        }

        int figuras = 0;

        for (int i = 0; i < numeroDeFigurinhasCompradas; i++)
        {
            if (albumDeFigurinha[i] != -1)
            {
                figuras++;
            }
        }

        totalDeFigurinhas = numeroDeFigurinhas - figuras;

        Console.Write(totalDeFigurinhas);

    }
}