package day12_OdevstringManipılation;

import java.util.Scanner;

public class C01_indexOfOdev {
    public static void main(String[] args) {
        //kullanicidan bir cümle ve harf isteyin,harfin cümlede var olup olmadigini yazdirin
        Scanner scanner = new Scanner(System.in);
        System.out.print("lütfen bir cümle girin:");
        String cümle=scanner.nextLine();
        System.out.print("lütfen bir harf girin:");
        char harf=scanner.next().charAt(0);
       //1.çözüm
        if (cümle.indexOf( harf )==-1){
            System.out.println("harf cümlede yoktur");
        }else {
            System.out.println("harf cümlede mevcuttur");
        }


        //2.çözüm  contains ta char olmayacagı için harfi string yapmamız gerekecek
        System.out.println("lütfen bir harf girin");
        String harf2=scanner.next();
        if (cümle.contains(harf2)){
            System.out.println("harf vardir");
        }else {
            System.out.println("harf yoktur");
        }
    }
}
