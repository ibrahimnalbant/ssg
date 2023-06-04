package methodcreaationobjectcreation1;

public class Calculator {
    // iki variable’in degerlerini Cikarma yapan  bir method olusturalim

    public static void sayilar(int a, int b) {
        System.out.println("iki sayi :" +a +" ve "+ b);
    }

    public static int cikarma( int a , int b) {
        System.out.println("iki sayinin farki :" + (a-b));
        return a - b;
    }

    public static void main(String[] args) {
        sayilar(5,6);
        cikarma(5,6);

    }

}
