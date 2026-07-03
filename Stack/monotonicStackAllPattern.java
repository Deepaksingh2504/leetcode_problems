// MONOTONIC STACK ALL PATTERN

import java.util.Scanner;
import java.util.Stack;
public class stackImplementation {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];

        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        int nge[]=new int[n];
        int pge[]=new int[n];
        int nse[]=new int[n];
        int pse[]=new int[n];


        Stack<Integer>stack=new Stack<>();
         Stack<Integer>stack2=new Stack<>();
          Stack<Integer>stack3=new Stack<>();
           Stack<Integer>stack4=new Stack<>();

        // next greater element

        for(int i=n-1;i>=0;i--)
        {
            int val=a[i];
            while(!stack.isEmpty() && stack.peek()<=val)
            {
                stack.pop();
            }

            if(!stack.isEmpty())
            {
            nge[i]=stack.peek();
            }
            else
            {
                nge[i]=-1;
            }

            stack.push(val);
        }

        // next smaller element

        for(int i=n-1;i>=0;i--)
        {
            int val=a[i];
            while(!stack2.isEmpty() && stack2.peek()>=val)
            {
                stack2.pop();
            }

            if(!stack2.isEmpty())
            {
            nse[i]=stack2.peek();
            }
            else
            {
                nse[i]=-1;
            }

            stack2.push(val);
        }

        // previous greater element

        for(int i=0;i<n;i++)
        {
            int val=a[i];
            while(!stack3.isEmpty() && stack3.peek()<val)
            {
                stack3.pop();
            }

            if(!stack3.isEmpty())
            {
            pge[i]=stack3.peek();
            }
            else
            {
                pge[i]=-1;
            }

            stack3.push(val);
        }

        // previous smaller element

         for(int i=0;i<n;i++)
        {
            int val=a[i];
            while(!stack4.isEmpty() && stack4.peek()>val)
            {
                stack4.pop();
            }

            if(!stack4.isEmpty())
            {
            pse[i]=stack4.peek();
            }
            else
            {
                pse[i]=-1;
            }

            stack4.push(val);
        }

       System.out.println("next greater element");
        for(int i=0;i<n;i++)
        {
            System.out.print(nge[i]+" ");
        }
        System.out.println();
        System.out.println("next smaller element");
        for(int i=0;i<n;i++)
        {
            System.out.print(nse[i]+" ");
        }
        System.out.println();
        System.out.println("previous greater element");
        for(int i=0;i<n;i++)
        {
            System.out.print(pge[i]+" ");
        }
        System.out.println();
        System.out.println("previous smaller element");
        for(int i=0;i<n;i++)
        {
            System.out.print(pse[i]+" ");
        }

    }
}
