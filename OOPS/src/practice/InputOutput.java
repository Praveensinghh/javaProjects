package practice;

public class InputOutput {
   int a;
   int b;
   InputOutput(){
       this(10,20);
       System.out.println("cons 1");
   }
       InputOutput(int a,int b){
           this.a=a;
           this.b=b;
           System.out.println("cons 2");
       }
   }


