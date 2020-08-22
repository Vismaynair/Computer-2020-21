class overloading
{
    void num_calc(int num, char ch)
    {
        if(ch=='s')
        {
            System.out.println("The square of "+num+" is "+num*num);
        }
        else
        {
            System.out.println("The cube of "+num+" is "+num*num*num);
        }
    }
    void num_calc(int a, int b, char ch)
    {
        if (ch=='p')
        {
            System.out.println("The product of the integers is "+a*b);
        }
        else
        {
            System.out.println("The sum of the integers is "+(a+b));
        }
    }
    public static void main()
    {
        overloading obj=new overloading();
        obj.num_calc(1,2,'s');
        obj.num_calc(3,'s');
    }
}

