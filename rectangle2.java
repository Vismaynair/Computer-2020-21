class rectangle2
{
    double len,breadth1,ans;//interactive variables
    void init(int length,int breadth)//interactive input,formal parameters
    {
        
        len=length;
        breadth1=breadth;
    }
    double calc()//use osf return
    {
        ans=len*breadth1;
        return ans;
    }
    public static void main()
    {
        rectangle2 obj=new rectangle2();
        obj.init(2,3);//actual parameters/arguments which are passed at time of invocation
        double result=obj.calc();//caller
        System.out.println(result);
        //obj.display();
    }
}
    
   
    
    