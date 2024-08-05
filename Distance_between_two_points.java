import java.util.Scanner;
public class main{
    public static void main(String args[]){
        Scanner my = new Scanner(System.in);
        double a,b,c,d;
        double dis;
        a=my.nextDouble();
        b=my.nextDouble();
        c=my.nextDouble();
        d=my.nextDouble();
        dis=Math.sqrt(Math.pow(c-a,2)+Math.pow(d-b,2));
    System.out.printf("%.4f",dis);
    }
}