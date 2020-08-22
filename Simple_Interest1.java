class Simple_Interest1
{
    double p,t,r,SI;
    void init()
    {
        p=2000;
        r=3.5;
        t=2;
    }
    void calc()
    {
        SI=(p*r*t)/100;
    }
    void disp()
    {
        System.out.println("The simple interest is " + SI);
    }
}