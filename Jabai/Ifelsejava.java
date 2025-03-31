package Galpo.com.ex;

public class Ifelsejava {

  public static void main(String[] args) {
   int x = 20;
   int y = 50;
   if (x < y){
     
     System.out.println("x is less than y");
   }
   
   int time = 20;
   if (time < 18){
   
     System.out.println("Good day.");
   } else if (time < 18){
   
     System.out.println("Good evening.");
   } else {
   
     System.out.println("Good day.");
  }
    
   int x2 = 18;
String result = (x2 > 13) ? "x2 is larger than 13" : "13 is lesser than x2";
     System.out.println(result);
    
   int password = 2745;
   if (password == 2745){
     System.out.println("Wasah! Correct Password!");
   } else {
     System.out.println("Ngeh! Ngeh! Wrong Password!");
   }
   
 }
}
