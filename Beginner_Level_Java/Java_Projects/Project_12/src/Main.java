import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int var1, var2, var3;
        Scanner inp = new Scanner(System.in);
        System.out.print("İlk tam sayıyı giriniz: ");
        var1 = inp.nextInt();
        System.out.print("İkinci tam sayıyı giriniz: ");
        var2 = inp.nextInt();
        System.out.print("Üçüncü sayıyı giriniz: ");
        var3 = inp.nextInt();

        if ((var1==var2)&&(var2==var3)) System.out.println(var1 + "=" + var2 + "=" + var3);

        if ((var1 > var2) && (var1 > var3)){
            if (var2>var3)                      {System.out.println(var1 + ">" + var2 + ">" + var3);}      //var1>var2>var3
            else if(var3>var2)                  {System.out.println(var1 + ">" + var3 + ">" + var2);}      //var1>var3>var2
            else                                {System.out.println(var1 + ">" + var3 + "=" + var2);}      //var1>var2=var3
        }else if ((var1==var2)&&(var2>var3))    {System.out.println(var1 + "=" + var2 + ">" + var3);}      //var1=var2>var3
         else if ((var1==var3)&&(var3>var2))    {System.out.println(var1 + "=" + var3 + ">" + var2);}      //var1=var3>var2

        if ((var2 > var1) && (var2 > var3)){
            if (var1>var3)                      {System.out.println(var2 + ">" + var1 + ">" + var3);}      //var2>var1>var3
            else if(var3>var1)                  {System.out.println(var2 + ">" + var3 + ">" + var1);}      //var2>var3>var1
            else                                {System.out.println(var2 + ">" + var1 + "=" + var3);}      //var2>var1=var3
        }else if ((var2==var3)&&(var3>var1))    {System.out.println(var2 + "=" + var3 + ">" + var1);}      //var2=var3>var1

        if ((var3 > var1) && (var3 > var2)){
            if (var1>var2)                      {System.out.println(var3 + ">" + var1 + ">" + var2);}      //var3>var1>var2
            else if(var2>var1)                  {System.out.println(var3 + ">" + var2 + ">" + var1);}      //var3>var2>var1
            else                                {System.out.println(var3 + ">" + var1 + "=" + var2);}      //var3>var1=var2
        }
    }
}