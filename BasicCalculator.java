import java.util.Scanner;


public class BasicCalculator {
    
    public   double Add( double a, double b){
        
        return a +b;
    
    }
    public   double  Subtract(double  a, double  b){
        
        return a -b;
    
    }
      public   double Multiply(double a, double  b){
        
        return a *b;
    
    }
 public   double Divide(double  a, double  b){
       if(b==0) {
        System.out.println(" cannot divide by zeroo invilaid ");
        return 0;
       }else{
        System.out.println(" enter another number ");
       }
        return  a /b;
    
    }
    public static void main(String[] args) {
       Scanner cal=new Scanner(System.in);
       BasicCalculator CAL=new BasicCalculator();

System.out.println(" enter the first number ");

      double num1=cal.nextDouble();

      System.out.println(" enter the second number ");
        double num2=cal.nextDouble();

        System.out.println(" chose the operator + ,- ,* ,/");
        char operator=cal.next().charAt(0);
   
        double result;
         if (operator == '+')
          {

            result = CAL.Add(num1, num2);
            System.out.println("Result: " + result);
        } 
        else if (operator == '-') 
        {
            result = CAL.Subtract(num1, num2);
            System.out.println("Result: " + result);
        } 
        else if (operator == '*') 
        {
            result = CAL.Multiply(num1, num2);
            System.out.println("Result: " + result);
        } 
        else if (operator == '/') 
        {
           result = CAL.Divide(  num1,  num2);
            System.out.println("Result: " + result);
        } 
        else 
        {
            System.out.println(" Invalid operator");
        }


        cal.close();
    }
    
    
}
