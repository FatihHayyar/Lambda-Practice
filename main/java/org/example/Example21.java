package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Example21 {
    public static void main(String[] args) {


    Example21Apartmant daire1=new Example21Apartmant("dogu",4000,3);
    Example21Apartmant daire2=new Example21Apartmant("bati",2500,2);
    Example21Apartmant daire3=new Example21Apartmant("guney",3500,1);
    Example21Apartmant daire4=new Example21Apartmant("dogu",3000,5);

    List<Example21Apartmant> kiralikDaireler=new ArrayList<>(Arrays.asList(daire1,daire2,daire3,daire4));
//dogu cephesindeki kiralık daireleri kiralarına göre sıralayın
example(kiralikDaireler);
example1(kiralikDaireler);

    }
public static void example(List<Example21Apartmant> list) {
        list.stream().filter(t->t.getCephe().equals("dogu"))
                .sorted(Comparator.comparing(Example21Apartmant::getKira)).forEach(t-> System.out.println(t+" "));
}
//kat sayısı 2den cok olan dairelerin kiralarını listeleyın
public static void example1(List<Example21Apartmant> list) {
    list.stream().filter(t->t.getKira()>2).forEach(t-> System.out.print(t.getKatSayisi()+" "));

}




}