class AVG_MKS_A1
{
    int chem,comp,maths;
    double avg;
    void init()
    {
        chem=97;
        comp=95;
        maths=90;
    }
    void calc()
    {
        double sum=(double) (chem + comp + maths);
        avg = sum/3;
    }
    void disp()
    {
        System.out.print("The avg marks are " + avg);
    }
}