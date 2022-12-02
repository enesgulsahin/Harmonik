import java.util.Scanner;
public class main {
    public static void main (String [] args){
    Scanner inp = new Scanner(System.in);
    System.out.print("Bir sayı giriniz : ");
    double sayi = inp.nextInt();
    double  toplam = 0;
    double baslangicNoktasi = 1;
    for(double i = 1; i <= sayi; i++){
        toplam +=  baslangicNoktasi / i;
    } System.out.print(toplam);






    }
}
