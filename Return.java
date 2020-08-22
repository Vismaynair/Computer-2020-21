class Return
{
    int num1,num2,ans;
    void init(int a,int b)
    {
        num1=a;
        num2=b;
    }
    int calc()
    {
        ans=num1+num2;
        return ans;
    }
    public static void main()
    {
        Return obj=new Return();
        obj.init(3,6);
        int result=obj.calc();
        System.out.println(result);
    }
}
