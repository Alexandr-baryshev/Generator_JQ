package testJQ.Generator_JQ.controllers;

import java.io.Serializable;

public class GeneratorData implements Serializable {

   private int startR;
   private int sizeR;
   private int startC;
   private int sizeC;

   private String priRC;
   private String inputTxt;
   private String outTxt;

   public int getStartR() {
      return startR;
   }

   public void setStartR(int startR) {
      this.startR = startR;
   }

   public int getSizeR() {
      return sizeR;
   }

   public void setSizeR(int sizeR) {
      this.sizeR = sizeR;
   }

   public int getStartC() {
      return startC;
   }

   public void setStartC(int startC) {
      this.startC = startC;
   }

   public int getSizeC() {
      return sizeC;
   }

   public void setSizeC(int sizeC) {
      this.sizeC = sizeC;
   }

   public String getPriRC() {
      return priRC;
   }

   public void setPriRC(String priRC) {
      this.priRC = priRC;
   }

   public String getInputTxt() {
      return inputTxt;
   }

   public void setInputTxt(String inputTxt) {
      this.inputTxt = inputTxt;
   }

   public String getOutTxt() {
      return outTxt;
   }

   public void setOutTxt(String outTxt) {
      this.outTxt = outTxt;
   }
}