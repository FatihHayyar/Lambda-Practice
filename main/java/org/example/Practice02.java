package org.example;

import java.util.ArrayList;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Practice02 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Elma");
        list.add("portakal");
        list.add("uzum");
        list.add("cilek");
        list.add("greyfurt");
        list.add("nar");
        list.add("mandalina");
        list.add("armut");
        list.add("elma");
        list.add("keciboynuzu");
        list.add("Ayva");
example(list);
        System.out.println();
        System.out.println(example1(list));
        example2(list);
        System.out.println();
        System.out.println(example3(list));
        example4(list);
        System.out.println();
        example5(list);
        example6(list);
        example7(list);
        example8(list);
        example9(list);
    }
    //S1: list elemanlarını ilk harf buyuk gerisi kucuk sekılde listeleyelim
    public static void example(List<String> list){
        list.stream().
                map(t->t.substring(0,1).toUpperCase()+t.substring(1)).forEach(t-> System.out.print(t+" "));
    }
// S2: ilk harfi e ve ya c olanlari listeleyelim
public static List<String> example1(List<String> list){
        return
        list.stream().filter(t -> t.startsWith("e")||t.startsWith("c")).collect(Collectors.toList());
}
//S3: tum stringlerin basina ve sonuna yildiz ekleyerek yazdiralim
public static void example2(List<String> list){

            list.forEach(t -> System.out.print("*"+t+"*"+" "));
}
//S4 : icinde e olanlardan yeni bir list olusturunuz
public static List<String> example3(List<String> list){
    return
            list.stream().filter(t -> t.contains("e")).collect(Collectors.toList());
}
//S5: tum 'l' leri silelim yazdiralim
public static void example4(List<String> list){

    list.stream().map(t->t.replace("l", "")).forEach(t-> System.out.print(t+" "));
}
//S6: List elemanarını 2.harfe gore sıralayıp
//ilk 5 elemandan char sayısı en buyuk elemanı print
public static void example5(List<String> list){

    System.out.println(list.stream().sorted(Comparator.comparing(t -> t.charAt(1))).limit(5).sorted(Comparator.comparing(String::length).reversed()).findFirst());

}
//S7: uzunlugu 3 ile 7 arası olan veya a ile biten elemanlardan yeni bir liste olustur
public static void example6(List<String> list){

    System.out.println(list.stream().filter(t -> t.length() > 3 && t.length() < 7 || t.endsWith("a")).collect(Collectors.toList()));

}
//S8:list elemanlarını uzunluklarına ve ikinci harflerine göre benzersiz sıralayıp yazdırın
public static void example7(List<String> list){

    System.out.println(list.stream().sorted(Comparator.comparing(String::length)).distinct().collect(Collectors.toList()));

}
// S9: uzunlugu 4 ve 8 olanlar haric bir liste olusturunuz
public static void example8(List<String> list){

    System.out.println(list.stream().filter(t->t.length()!=4&&t.length()!=8).collect(Collectors.toList()));

}
//S10: List elemanlarını son harfe göre sıralayıp, son 3 elemanı yazdırın
public static void example9(List<String> list){

    System.out.println(list.stream().sorted(Comparator.comparing(t->t.charAt(t.length()-1))).sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList()));

}
}
