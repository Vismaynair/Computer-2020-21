
class SI
{
   double principle,time,rate,SI;
    void init()
    {
        principle=200;
        rate=2.5;
        time=5;
    }
    void calc()
    {
        SI=(principle*rate*time)/100;
    }
    void display()
    {
        System.out.println(SI);
    }
}
  
