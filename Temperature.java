class Temperature
{
    double tf,tc;
    Temperature(double temp)
    {
        tf=temp;
    }
    void calc()
    {
        tc=((tf-32)*(5.0/9.0));
    }
    void disp()
    {
        System.out.println(tf+"F is equal to "+tc+"C");
    }
}
