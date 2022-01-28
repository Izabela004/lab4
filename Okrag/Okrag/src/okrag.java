import java.util.Scanner;
public class okrag {
    public static void main (String[] args){
        int X = 0;
        int Y = 0;
        int promien = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj promien:");
        promien = scanner.nextInt();

        System.out.println("Podaj wspolrzedna punkru X:");
        X = scanner.nextInt();

        System.out.println("Podaj wspolrzedna punkru Y:");
        Y = scanner.nextInt();

        getPowierzchnia(promien);
        setSrednica(promien);
        getPromien(promien);
        wSrodku(X, Y,promien);

    }

    static void getPowierzchnia(int p){
        System.out.println("Powierzchnia: " + Math.PI*p*p);
    }
    static void setSrednica(int p){
        System.out.println("Srednica: " + 2*p);
    }
    static void getPromien(int p){
        System.out.println("Promien: " + p);
    }
    static  void wSrodku(int PunktX, int PunktY, int p){
        if(Math.pow(PunktX,2)+Math.pow(PunktY,2)<Math.pow(p,2)){
            System.out.println("Punkt lezy w  okregu");
        }else System.out.println("Punkt NIE lezy w okregu");
    }
}
