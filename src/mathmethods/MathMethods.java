/*  
Name: Evan
Program: mathMethods
Date: 2016.10.05
Describe: This program is about the Math Methods in four methods.
*/


package mathmethods;

import java.util.*;

public class MathMethods 
{
    public static double beginning(){
        double number;
        //Print out the introduction 
        System.out.println("Welcome to the Mathmethods!");
        System.out.println("1.Quadratic Equipment");
        System.out.println("2.Circle");
        System.out.println("3.Cosine Law");
        System.out.println("4.Sine Law");
        System.out.println("Enter the number of the methods");
        
        Scanner input=new Scanner(System.in);
        //Input the number of the methods
        number=input.nextDouble();
        //return value to main method
        return(number);
    
    }
    
    public static void Quadratic(){
        double root1,root2,a,b,c,d;
        
        //Print out the formula of the Quadratic 
        System.out.println("ax^2 + bx + c = 0");
        System.out.println("Please enter the number of a,b and c");
        
        //Input the numbers
        Scanner input=new Scanner(System.in);
        System.out.println("a: ");
        a=input.nextDouble();
        System.out.println("b: ");
        b=input.nextDouble();
        System.out.println("c: ");
        c=input.nextDouble();
        input.close();
        
        //Get the value d by the formula
        d=Math.pow(b,2)-4*a*c;
        
        //Switch to different codes for the three posibles for number of roots
        if(d<0)
        {
          //Print out the result for no roots
          System.out.println("There is not roots.");
        }else
        {
            //The posible that when the function has roots
            //The formula to get roots
        root1=(-b+Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a);
        root2=(-b-Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a);

                if(root1!=root2)
                 {
                     //When it has two roots
                   System.out.println("There are two roots:  "+Math.max(root1,root2)+" and "+Math.min(root1,root2));
                 }else
                 {
                     //When it has one root
                     System.out.println("There is only one root.  "+a);
                 }
    }

    } 
    
    public static void circle()
    {
        double r,D,s,S,V,n;
        Scanner input=new Scanner(System.in);
        
        //Print out the introduction and input the number
        System.out.println("Please enter the radius of the circle.");
        r=input.nextDouble();
        System.out.println("How many decimal do you want.");
        n=input.nextDouble();
        
        //Formula to get values
        D=2*r*Math.PI;
        s=Math.pow(r, 2)*Math.PI;
        V=Math.pow(r, 3)*Math.PI*4/3;
        S=Math.pow(r, 2)*Math.PI*4;
        
        //Save the decimal
        D=Math.round(D*Math.pow(10, n))/Math.pow(10, n);
        s=Math.round(s*Math.pow(10, n))/Math.pow(10, n);
        V=Math.round(V*Math.pow(10, n))/Math.pow(10, n);
        S=Math.round(S*Math.pow(10, n))/Math.pow(10, n);
        
        //Print out
        System.out.println("D: "+D);
        System.out.println("s: "+s);
        System.out.println("V: "+V);
        System.out.println("S: "+S);
    }
    
    public static void cosine()
    {
        double a,b,c,A,B,C,num;
        Scanner input=new Scanner(System.in);
        
        //Introduction
        System.out.println("Whitch do you want:");
        System.out.println("   1.Get side");
        System.out.println("   2.Get angle");
        
        //Choose the method
        num=input.nextDouble();
        
        if(num==1){
            //Input the values
            System.out.println("Please input the side a:");
            a=input.nextDouble();
            System.out.println("Please input the side c:");
            c=input.nextDouble();
            System.out.println("Please input the angle B:");
            B=Math.toRadians(input.nextDouble());
            
            //Formula to get side 
            b=Math.sqrt(Math.pow(a,2)+Math.pow(c,2)-(2*a*c*Math.cos(B)));
            
            //Print out the result
            System.out.println("The length of remain side is: "+b);
        }else if(num==2){
            //Input the values
            System.out.println("Please input the side a:");
            a=input.nextDouble();
            System.out.println("Please input the side b:");
            b=input.nextDouble();            
            System.out.println("Please input the side c:");
            c=input.nextDouble();
           
            //Formulas to get angles
            A=Math.toDegrees(Math.acos((Math.pow(b,2)+Math.pow(c,2)-Math.pow(a,2))/(2*c*b)));
            B=Math.toDegrees(Math.acos((Math.pow(a,2)+Math.pow(c,2)-Math.pow(b,2))/(2*a*c)));
            C=Math.toDegrees(Math.acos((Math.pow(a,2)+Math.pow(b,2)-Math.pow(c,2))/(2*a*b)));
            
            //Print out the results
             System.out.println("The angle of A is: "+A);
             System.out.println("The angle of B is: "+B);
             System.out.println("The angle of C is: "+C);
            
            
        }
    }
    
    public static void sine()
    {
        double a,b,A,B,num;
        //Introduction
        Scanner input=new Scanner(System.in);
        System.out.println("Whitch do you want:");
        System.out.println("   1.Get side");
        System.out.println("   2.Get angle");  
        
        //Choose the method
        num=input.nextDouble();
        
        if(num==1){
            //Input the values
            System.out.println("Please input the angle A:");
            A=Math.toRadians(input.nextDouble());
            System.out.println("Please input the side a:");
            a=input.nextDouble();
            System.out.println("Please input the angle B:");
            B=Math.toRadians(input.nextDouble());
            
            //Formula to get side 
            b=a*Math.sin(B)/Math.sin(A);
            
            //Print out the results
            System.out.println("The lenth of b is: "+b);
        }else if(num==2){
            //Input the values
            System.out.println("Please input the angle A:");
            A=Math.toRadians(input.nextDouble());
            System.out.println("Please input the side a:");
            a=input.nextDouble();
            System.out.println("Please input the side b:");
            b=input.nextDouble();
             
            //Formula to get angle
            B=Math.asin(Math.sin(A)*b/a);
            
            //Print out the results
            System.out.println("The angle B is:"+ B);
        }
    }
        public static void main(String[] args) 
        {
            double number;
            //get value from the beginning() method
            number=beginning();
            
            //switch to four different methods by the input number
            if(number==1){
            Quadratic();
            }else if(number==2){
                circle();
            }else if(number==3){
                cosine();
            }else if(number==4){
                sine();
            
            }
            

        
        }
    
}
