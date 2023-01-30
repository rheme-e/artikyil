package Giris;
import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {
        int a;
        Scanner inp=new Scanner(System.in);
        System.out.print("Yılı Giriniz:");
        a=inp.nextInt();

        if(a % 4==0){
            if((a % 4==0) && (a % 100==0)){
                if((a % 100==0) && (a % 400==0)){
                    System.out.println("Artık yıldır:"+a);
                }else{
                    System.out.println("Artık yıl değildir:"+a);
                }
            } else if((a % 4==0) && (a % 100!=0)){
                    System.out.println("Artık yıldır:"+a);
            }
        }else {
            System.out.println("Artık yıl değildir:"+a);
        }
    }
}
