import java.util.Scanner;
class Amstronefun
{
    int num,rev,arm=0,copy,i;
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the 3 Digit no:");
        num=sc.nextInt();
        copy=num;
    }
    public void loop()
    {
        for(i=1;i<=3;i++)
        {
            rev=(num%10);
            arm=(rev*rev*rev)+arm;
            num=num/10;
        }
    }
    public void ifelse()
    {
         if(copy==arm)
        {
             System.out.print(copy+":no. is Amstrone");
        }
         else
        {
            System.out.print(copy+":no. is not a Amstrone");
        }
    }
    public static void main(String[] args) 
    {
      Amstronefun af=new Amstronefun();
      af.input();
      af.loop();
      af.ifelse();  
    }
}
