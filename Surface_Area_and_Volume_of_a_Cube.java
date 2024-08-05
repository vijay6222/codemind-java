import java.util.Scanner;
public class main{
    public static void main(String args[]){
        Scanner my = new Scanner(System.in);
        int r,a,v;
        r=my.nextInt();
       a=r*r*r;
       v=6*r*r;
    System.out.printf("Surface area = %d and Volume = %d",v,a);
    }
}