package Modul1.Branching;
/*  Найти max{min(a, b), min(c, d)}. */

public class Task2 {
    public static void main(String[] args) {
        int a=9;
        int b=4;
        int c=6;
        int d=8;
        System.out.println("max{min("+a+", "+ b+"),min("+c+", "+d+")} = " + max(min(a,b),min(c,d)));
        //System.out.println("max{min("+a+", "+ b+"),min("+c+", "+d+")} = " + Math.max(Math.min(a,b),Math.min(c,d)));
    }
    public static int min (int x, int y) {
        if (x<=y){
            return x;
        }
        else  {
            return y;
        }
    }
    public static int max (int z, int s) {
        if (z>=s){
            return z;
        }
        else {
            return s;
        }
    }
}
