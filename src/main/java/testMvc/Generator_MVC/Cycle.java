package testMvc.Generator_MVC;

public class Cycle {

   public String sort_C(String variable, int rStart, int rSize, int cStart, int cSize) {
      String row = "", column = "", allResult = "";

      int c = cStart;
      while (c <= cSize) {
         column = variable.replace("C1", "C" + c);

         int r = rStart;
         while (r <= rSize) {
            row = column.replace("R1", "R" + r);
            allResult = allResult + row + "\n";
            r++;
         }
         c++;
      }
      return (allResult);
   }


   public String sort_R(String variable, int rStart, int rSize, int cStart, int cSize) {
      String row = "", column = "", allResult = "";

      for (int r = rStart; r <= rSize; r += 1) {
         row = variable.replace("R1", "R" + r);

         for (int c = cStart; c <= cSize; c += 1) {
            column = row.replace("C1", "C" + c);
            allResult = allResult + column + "\n";
         }
      }
      return (allResult);
   }
}

