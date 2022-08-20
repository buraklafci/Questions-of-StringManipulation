package day12_OdevstringManipılation;

import java.util.Scanner;

public class  C02_indexOfOdev {
    public static void main(String[] args) {
        /*
        kullanicidan bir cümle ve bir kelime isteyin,kelimenin cümledeki
        kullanimina bakarak asagidaki 3 cümleden uygun olani yazdirin
        -girilen kelime cümlede kullanilmamis
        -girilen kelime cümlede 1 kere kullanilmis
        -girilen kelime cümlede 1 den fazla kullanilmis
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("lütfen bir cümle girin:");
        String cümle=scanner.nextLine();
        System.out.print("lütfen bir kelime girin:");
        String kelime= scanner.next();

        //1.cözüm  sadece indexOf() ile cözümü
        int ilkkelime=cümle.indexOf(kelime);
        int ikincikelime=cümle.indexOf(kelime,ilkkelime+1);


        //1.cözüm indexOf kullanma
      if(cümle.indexOf(kelime)==-1){
           System.out.println("kelime kullanilmamis");
       }else if(ikincikelime==-1){
           System.out.println("kelime 1 kere kullanilmis");
       }else {
           System.out.println("kelime 1 den fazla kullanilmis");
       }



        //2.cözüm indexOf ve lastIndexOf ile kullanımı  java cok guzel
        if(cümle.indexOf(kelime)==-1){
            System.out.println("kelime kullanilmamis");
        }else if(cümle.indexOf(kelime)==cümle.lastIndexOf(kelime)){
            System.out.println("kelime 1 kere kullanilmis");
        }else {
            System.out.println("kelime 1 den fazla kullanilmis");
        }



        //3.cözüm indexOf, lastIndexOf ve contains ile kullanımı
        if (!cümle.contains(kelime)){
            System.out.println("kelime kullanilmamis");
        }else if(cümle.indexOf(kelime)==cümle.lastIndexOf(kelime)){
            System.out.println("kelime 1 kere kullanilmis");
        }else {
        System.out.println("kelime 1 den fazla kullanilmis");
    }
    }
}
