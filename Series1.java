import java.util.*;
class Series1
{
    int n,S=0;
    void getData()
    {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
    }
    void calc()
    {
        int j=21;
        for(int i=1;i<=n;i++)
        {
            j=-j;
            if(j>0)
            {
                j+=20;
            }
            else
            {
                j-=20;
            }
            S-=j;
        }
    }
    void disp()
    {
        System.out.println(S);
    }
    public static void main()
    {
        Series1 obj=new Series1();
        obj.getData();
        obj.calc();
        obj.disp();
    }
}