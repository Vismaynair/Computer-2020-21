class Student
{
    String name;
    double test1,test2,test3;
    Student(double test1,double test2, double test3)
    {
        this.test1=test1;
        this.test2=test2;
        this.test3=test3;
    }
    double getAverage()
    {
        return((test1+test2+test3)/3.0);
    }
    public static void main(double test1, double test2, double test3)
    {
        Student std,std1,std2,std3;
        std=new Student(test1,test2,test3);
        std1=new Student(90,80,90);
        std2=std1;
        std3=null;
        std.name="John Smith";
        std1.name="Mary Jones";
    }
}