package testJQ.Generator_JQ;

import testJQ.Generator_JQ.controllers.GeneratorData;

public class GeneratorFunc {



   public String sort_C(GeneratorData gd) {
      String row = "", column = "", allResult = "";

      int c = gd.getStartC();
      while (c <= gd.getSizeC()) {
         column = gd.getInputTxt().replace("C1", "C" + c);

         int r = gd.getStartR();
         while (r <= gd.getSizeR()) {
            row = column.replace("R1", "R" + r);
            allResult = allResult + row + "\n";
            r++;
         }
         c++;
      }
      return (allResult);
   }


   public String sort_R(GeneratorData gd) {
      String row = "", column = "", allResult = "";

      for (int r = gd.getStartR(); r <= gd.getSizeR(); r += 1) {
         row = gd.getInputTxt().replace("R1", "R" + r);

         for (int c = gd.getStartC(); c <= gd.getSizeC(); c += 1) {
            column = row.replace("C1", "C" + c);
            allResult = allResult + column + "\n";
         }
      }
      return (allResult);
   }
}

