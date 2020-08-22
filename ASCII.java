class ASCII
{
    int a;
    ASCII(char ch)
    {
        a=ch;
    }
    void check()
    {
        if((a>=65&&a<=90)||(a>=97&&a<=122))
        {
            System.out.println("It is a Alphabet");
        }
        else if(a>=48&&a<=57)
        {
            System.out.println("It is a digit");
        }
        else
        {
            System.out.println("It is special charecter");
        }
    }
    public static void main(char ch)
    {
        ASCII obj=new ASCII(ch);
        obj.check();
    }
} 
