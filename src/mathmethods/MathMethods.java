

package mathmethods;

import java.util.*;

public class MathMethods 
{
    public static double beginning(){
        double number;
        System.out.println("Welcome to the Mathmethods!");
        System.out.println("1.Quadratic Equipment")
        System.out.println("2.Circle")
        System.out.println("3.Cosine Law")
        System.out.println("4.Sine Law")
        System.out.println("Enter the number of the methods")
        
        Scanner.input=new Scanner(System.in);
        number=input.nextDouble();
        return(number);
    
    }
    
    public static void Quadratic(){
        double root1,root2,a,b,c,d;
        System.out.println("ax^2 + bx + c = 0");
        System.out.println("Please enter the number of a,b and c");
        
        Scanner.input=new Scanner(System.in);
        System.out.println("a: ");
        a=input.nextDouble();
        System.out.println("b: ");
        b=input.nextDouble();
        System.out.println("c: ");
        c=input.nextDouble();
        input.close();
        
        d=Math.pow(b,2)-4*a*c;
        if(d<0)
        {
          System.out.println("There is not roots.");
        }else
        {
        root1=(-1*b+Math.sqrt(Math.pow(b,2)-4*a*c))/2/a;
        root2=(-1*b-Math.sqrt(Math.pow(b,2)-4*a*c))/2/a;
                if(root1!=root2)
                 {
                   System.out.println("There are two roots.  "+Math.max(a,b)+" and "+Math.min(a,b));
                 }else
                 {
                     System.out.println("There is only one root.  "+a);
         }
    }

                               
        public static void main(String[] args) 
        {
            double number;
            
            number=beginning();
            
            if(number==1){
            Quadratic();
            }

            
        }
    
}
