class Calculator
{
    int ans;
    void add(int a,int b)
    {
        ans=a+b;
        System.out.println(ans);
    }
    void sub(int a,int b)
    {
        ans=a-b;
        System.out.println(ans);
    }
    void mul(int a,int b)
    {
        ans=a*b;
        System.out.println(ans);
    }
    void div(int a,int b)
    {
        ans=a/b;
        System.out.println(ans);
    }
    void calc(int a, int b,char ch)
    {
        if(ch=='+')
        {
            add(a,b);
        }
        else if(ch=='-')
        {
            sub(a,b);
        }
        else if(ch=='*')
        {
            mul(a,b);
        }
        else if(ch=='/')
        {
            div(a,b);
        }
        else
        {
            System.out.println("Please enter +,-,* or / only");
        }
    }
    public static void main(int a, int b, char ch)
    {
        Calculator obj=new Calculator();
        obj.calc(a,b,ch);
    }
}