package day12_OdevstringManipılation;

import java.util.Scanner;

public class C03_containsOdev {
    public static void main(String[] args) {
        //kullanicidan email adresini girmesini isteyin,mail @gmail.com icermiyorsa
        //"lutfen gmail adresi giriniz",@gmail.com ile bitiyorsa"Email adresiniz kaydedildi,
        //@gmail.com ile bitmiyorsa "lütfen yazimi kontrol edin" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen mail adresinizi girin");
        String mail=scanner.nextLine();
          //1.cözüm
        if (!mail.contains("@gmail.com")) {
            System.out.println("lütfen gmail adresini giriniz");
        }else if (mail.lastIndexOf("@gmail.com")==mail.length()-10){
            System.out.println("Email adresiniz kaydedildi");
        }else {
            System.out.println("lütfen yazimi kontrol edin");
        }


        //2.cözüm
        if (!mail.contains("@gmail.com")) {
            System.out.println("lütfen gmail adresini giriniz");}
        else if (mail.endsWith("@gmail.com")) {
            System.out.println("Email adresiniz kaydedildi");}
        else {
            System.out.println("lütfen yazimi kontrol edin");}

    }
}
