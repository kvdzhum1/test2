package ru.stqa.bft.sandbox;

import java.security.PublicKey;

public class MyProgramm {
  public static void main(String[] args) {
      hello("Koctya");
      hello("user");
      double len =5;
      System.out.println("Площадь квадрата равна " + area(len)  );

  }

     public  static void hello (String sambody){
          System.out.println ("Hello " + sambody + "!");
      }
      public static double area (double l){
          return l*l;
      }


  }

