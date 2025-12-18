import java.util.*;
public class box
        {
            double length,breadth,height,volume;
            Scanner sc=new Scanner(System.in);
            void get_data()
            {
                System.out.println("Enter the length of the box");
                length=sc.nextInt();
                System.out.println("Enter the breadth of the box");
                breadth=sc.nextInt();
                System.out.println("Enter the height of the box");
                height=sc.nextInt();
            }
            void volume()
            {
                volume=length*breadth*height;
                System.out.println("The volume of the box is: "+volume);
            }
            public static void main(String args[])
            {
            Scanner sc=new Scanner(System.in);
            box ob=new box();
            ob.get_data();
            ob.volume();
            }
        }

