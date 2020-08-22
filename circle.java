class circle
{
    double area,radius;
    void init(double r)
    {
        radius=r;
    }
    double calc()
    {
        area=radius*3.14*radius;
        return area;
    }
    public static void main()
    {
        circle obj=new circle();
        obj.init(10.5);
        double result=obj.calc();
        System.out.println(result);
    }
}