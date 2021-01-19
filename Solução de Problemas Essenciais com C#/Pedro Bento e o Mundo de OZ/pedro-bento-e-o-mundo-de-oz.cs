using System;
using System.Collections.Generic;
using System.Linq;

class Program {
  static void Main(string[] args) {
    string joia = "";
    List<string> joias = new List<string>();
    
    do {
      joia = Console.ReadLine();
      if (!string.IsNullOrWhiteSpace(joia)) {
        joias.Add(joia);
      } else {
        break;
      }
    } while (true);
    IEnumerable<string> distinctJoias = joias.Distinct();
    Console.WriteLine(distinctJoias.Count());
  }

}