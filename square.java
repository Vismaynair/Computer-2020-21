class square
{
    int side,area;
    void init(int num1)
    {
        side=num1;
    }
    void calc()
    {
        area=side*side;
    }
    void display()
    {
        System.out.println(area);
    }
    public static void main()
    {
        square obj=new square();
        obj.init(8);
        obj.calc();
        obj.display();
    }
}