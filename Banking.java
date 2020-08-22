import java.util.*;
class Banking
{
    double R,H,W;
    Banking()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Rate");
        R=sc.nextDouble();
        System.out.println("Enter the No. of Hrs");
        H=sc.nextDouble();
    }
    void check()
    {
        if(H/35>=1)
        {
            W=1.0*R*35;
            hrs1();
        }
        else
        {
            W=1.0*R*H;
            disp();
        }
    }
    void hrs1()
    {
        if(H/60==1)
        {
            W+=1.5*R*25;
            hrs2();
        }
        else
        {
            W+=1.5*R*(H-35);
            disp();
        }
    }
    void hrs2()
    {
        if(H/70==1)
        {
            W+=2.0*R*10;
        }
        else
        {
            W+=2.0*R*(H-60);
        }
        disp();
    }
    void disp()
    {
        System.out.println("His wages is "+W+" rupees");
    }
    public static void main()
    {
        Banking obj=new Banking();
        if(obj.H>70)
        {
            obj.H=60;
        }
        obj.check();
    }
}