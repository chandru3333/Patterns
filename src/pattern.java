import java.util.Scanner;
import java.lang.String;
public class pattern {
    static Scanner sc = new Scanner(System.in);
    static pattern p = new pattern();
    static private int input;
    static private String ch;
    static private int choice;
    public static void main(String[] args)
    {
        p.process();
    }
    void triangle()
    {
        for(int i=0;i<input;i++)
        {
            for(int j=input;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int k=0;k<i;k++)
            {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    void input1()
    {
        try {
            System.out.println("Enter the Number");
            input = Integer.parseInt(sc.nextLine());
        }
        catch(Exception e)
        {
            System.out.println("Enter only numbers");
            p.input1();
        }
    }
    void input2()
    {
        try {
            System.out.println("Enter the character");
            ch = sc.nextLine();
        }
        catch(Exception e)
        {
            System.out.println("Enter only Characters");
            p.input2();
        }
    }
    void square()
    {
        for(int i=0;i<input;i++)
        {
            for(int j=0;j<input;j++)
            {
                System.out.print(ch+"  ");
            }
            System.out.println();
        }
    }
    void input3()
    {
        System.out.println("Enter Your Choice");
        System.out.println("1.Triangle\n2.Square\n3.Reverse Triangle\n4.Diamond\n5.Right Angle Triangle\n6.Left Angle Triangle\n7.Hallow Triangle\n8.Hallow Square\n9.Hallow Reverse Triangle\n10.Hallow Right Angle Triangle\n11.Hallow Left Angle Triangle\n12.Hallow Diamond\n13.Exit");
        try {
            choice = Integer.parseInt(sc.nextLine());
        }
        catch(Exception e)
        {
            System.out.println("Enter Only Numbers");
            p.input3();
        }
    }
    void reverseTriangle()
    {
        for(int i=0;i<input;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int k=input;k>i;k--)
            {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    void diamond()
    {
        for(int a=0;a<(input*2);a++)
        {
            if(a<=input)
            {
                for (int b = input; b > a; b--)
                {
                    System.out.print(" ");
                }
                for (int c = 0; c < a; c++)
                {
                    System.out.print(ch + " ");
                }
                System.out.println();
            }
            if(a>input)
            {
                for(int d = input;d<a;d++)
                {
                    System.out.print(" ");
                }
                for(int f=input*2;f>a;f--)
                {
                    System.out.print(ch+" ");
                }
                System.out.println();
            }
        }
    }
    void rightAngleTriangle()
    {
        for(int i=0;i<input;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    void leftAngleTriangle()
    {
        for(int i=0 ;i<input;i++)
        {
            for(int j=input;j>i;j--)
            {
                System.out.print("  ");
            }
            for(int k=0;k<i;k++)
            {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    void hallow_triangle()
    {
        for(int i=0;i<input;i++)
        {
            for(int j=input;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int k=0;k<i;k++)
            {
                if(i>=3 && i<=input-2)
                {
                    if(k==0 || k==i-1)
                    {
                        System.out.print(ch+" ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
                else {
                    System.out.print(ch + " ");
                }
            }
            System.out.println();
        }
    }
    void process()
    {
        p.input3();
        switch(choice) {
            case 1:
                p.input1();
                p.input2();
                p.triangle();
                p.out();
                break;
            case 2:
                p.input1();
                p.input2();
                p.square();
                p.out();
                break;
            case 3:
                p.input1();
                p.input2();
                p.reverseTriangle();
                p.out();
                break;
            case 4:
                p.input1();
                p.input2();
                p.diamond();
                p.out();
                break;
            case 5:
                p.input1();
                p.input2();
                p.rightAngleTriangle();
                p.out();
                break;
            case 6:
                p.input1();
                p.input2();
                p.leftAngleTriangle();
                p.out();
                break;
            case 7:
                p.input1();
                p.input2();
                p.hallow_triangle();
                p.out();
                break;
            case 8:
                p.input1();
                p.input2();
                p.hallow_square();
                p.out();
                break;
            case 9:
                p.input1();
                p.input2();
                p.hallowReverseTriangel();
                p.out();
                break;
            case 10:
                p.input1();
                p.input2();
                p.hallowRightAngleTriangle();
                p.out();
                break;
            case 11:
                p.input1();
                p.input2();
                p.hallowLeftAngleTriangle();
                p.out();
                break;
            case 12:
                p.input1();
                p.input2();
                p.hallowDiamond();
                p.out();
                break;
            case 13:
                System.out.println("Program Exited Successfully!!!");
                break;
            default:
                System.out.println("Invalid Choice");
                p.process();
        }
    }
    void hallow_square()
    {
        for(int i=0;i<input;i++)
        {
            for(int j=0;j<input;j++)
            {
                if(i>=1 && i<=input-2)
                {
                    if(j>=1 && j <= input-2)
                    {
                        System.out.print("   ");
                    }
                    else
                    {
                        System.out.print(ch+"  ");
                    }
                }
                else {
                    System.out.print(ch + "  ");
                }
            }
            System.out.println();
        }
    }
    void hallowReverseTriangel()
    {
        for(int i=0;i<input;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int k=input;k>i;k--)
            {
                if(i>=1 && i<input-2)
                {
                    if(k==input || k==i+1)
                    {
                        System.out.print(ch+" ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
                else {
                    System.out.print(ch + " ");
                }
            }
            System.out.println();
        }
    }
    void hallowRightAngleTriangle()
    {
        for(int i=0;i<input;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(i>=3 && i<=input-2)
                {
                    if(j==0 || j==i-1)
                    {
                        System.out.print(ch+" ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
                else {
                    System.out.print(ch + " ");
                }
            }
            System.out.println();
        }
    }
    void hallowLeftAngleTriangle()
    {
        for(int i=0;i<input;i++)
        {
            for(int j=input;j>i;j--)
            {
                System.out.print("  ");
            }
            for(int k=0;k<i;k++)
            {
                if(i>=3 && i<=input-2)
                {
                    if(k==0 || k==i-1)
                    {
                        System.out.print(ch+" ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
                else {
                    System.out.print(ch + " ");
                }
            }
            System.out.println();
        }
    }
    void hallowDiamond()
    {
        for(int a=0;a<(input*2);a++)
        {
            if(a<=input) {
                for (int b = input; b > a; b--)
                {
                    System.out.print(" ");
                }
                for (int c = 0; c < a; c++) {
                    if(a>=3 && a<=input)
                    {
                        if(c==0 || c==a-1)
                        {
                            System.out.print(ch+" ");
                        }
                        else {
                            System.out.print("  ");
                        }
                    }
                    else {
                        System.out.print(ch + " ");
                    }
                }
                System.out.println();
            }
            if(a>input)
            {
                for(int d = input;d<a;d++)
                {
                    System.out.print(" ");
                }
                for(int f = input*2;f>a;f--)
                {
                    if(a>input && a<=(input*2)-2)
                    {
                        if(f==a+1 || f== (input*2))
                        {
                            System.out.print(ch+" ");
                        }
                        else {
                            System.out.print("  ");
                        }
                    }else{
                    System.out.print(ch+" ");
                    }
                }
                System.out.println();
            }
        }
    }
    void out()
    {
        System.out.println("Do You want to Continue 'YES' or 'NO'");
        String choice1 = sc.nextLine();
        if(choice1.equalsIgnoreCase("YES"))
        {
            p.process();
        }
        else if(choice1.equalsIgnoreCase("NO"))
        {
            System.out.println("The Program is Completed Successfully !!!");
        }
        else {
            System.out.println("Invalid Option");
            p.out();
        }
    }
}
;
