class Library
{
   int acc_num;//instance variable
   String title;
   String author;
    void input(int acc_num1,String title1, String author1)//methods wiith parameters
    {
      acc_num=acc_num1;
      title=title1;
      author=author1;
    }
    void computer(int late1)//wil compute the fine ifthe book is submitted
    {
      int late=late1;
      int fine=2*late;
    }
    void display()
    {
    System.out.println("Accession Number \t"+ "Title \t    "+"Author");
    System.out.println(acc_num + "\t    " + title + "\t  " + author);
}
    public static void main()
    {
        Library obj=new Library();
        obj.input(12345,"Stars","Shakespeare");
        obj.computer(20);
        obj.display();
        
        
    }
}