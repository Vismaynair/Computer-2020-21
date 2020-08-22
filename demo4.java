class demo4
{
    int n1,n2,ans;
    void init(int num1,int num2)//parametrised method,mltiple method,interactive method
    {
        n1=num1;
        n2=num2;
    }
    void calc()
    {
        ans=n1+n2;//adding two numbers
    }
    void display()
    {
        System.out.println(ans);
    }
    public static void main()
    {
        demo4 obj=new demo4();//object creation
        obj.init(4,6);
        obj.calc();
        obj.display();
    }
}

        