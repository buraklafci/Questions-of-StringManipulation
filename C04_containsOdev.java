package day12_OdevstringManipılation;

import java.util.Scanner;

public class C04_containsOdev {
    public static void main(String[] args) {
        //kullanicidan bir cümle isteyin.cümle "buyuk"kelimesi iceriyorsa tüm cümle büyük harf olarak
        //""kucuk" kelimesi iceriyorsa tüm cümleyi kücük harf olarak yazdirin
        //iki kelimeyide icermiyorsa "cümle kucuk yada buyuk kelimesi icermiyor" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen cümle girin");
        String str =scanner.nextLine().toLowerCase();

        if (str.contains("buyuk")&&str.contains("kucuk")){
            System.out.println("hem buyuk hem kucuk oldugu icin önce karar vermelisin");
        }
        else if (str.contains("buyuk")){
            System.out.println(str.toUpperCase());
        }else if (str.contains("kucuk")){
            System.out.println(str.toLowerCase());
        }else {
            System.out.println("cümlede kucuk yada buyuk kelime ıcermiyor");
        }

    }
}
