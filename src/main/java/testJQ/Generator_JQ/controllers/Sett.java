package testJQ.Generator_JQ.controllers;

import java.io.Serializable;

public class Sett implements Serializable {

   private int R_St;
   private int R_Sz;
   private int C_St;
   private int C_Sz;

   private String RC_p;
   private String InTxt;
   private String OutTxt;


   public int getR_St() {
      return R_St;
   }

   public void setR_St(int R_St) {
      this.R_St = R_St;
   }

   public int getR_Sz() {
      return R_Sz;
   }

   public void setR_Sz(int R_Sz) {
      this.R_Sz = R_Sz;
   }

   public int getC_St() {
      return C_St;
   }

   public void setC_St(int C_St) {
      this.C_St = C_St;
   }

   public int getC_Sz() {
      return C_Sz;
   }

   public void setC_Sz(int C_Sz) {
      this.C_Sz = C_Sz;
   }

   public String getRC_p() {
      return RC_p;
   }

   public void setRC_p(String RC_p) {
      this.RC_p = RC_p;
   }

   public String getInTxt() {
      return InTxt;
   }

   public void setInTxt(String InTxt) {
      this.InTxt = InTxt;
   }

   public String getOutTxt() {
      return OutTxt;
   }

   public void setOutTxt(String OutTxt) {
      this.OutTxt = OutTxt;
   }

}