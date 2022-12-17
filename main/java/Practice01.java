import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Practice01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(-5, -8, -2, -12, 0, 1, 12, 5, 5, 6, 9, 15, 8));
//S2: sadece negatif olanlari yazdir
        list.stream().filter(i ->i<0).forEach(i -> System.out.print(i+" "));
        //S3: pozitif olanlardan yeni bir liste olustur
        System.out.println();
        list.stream().filter(i ->i>0).forEach(i -> System.out.print(i+" "));
        //S3: pozitif  ve cift olanlardan yeni bir liste olustur
        System.out.println();
        list.stream().filter(i ->i>0).filter(i->i%2==0).forEach(i -> System.out.print(i+" "));
        //S3: pozitif  veya cift olanlardan yeni bir liste olustur
        System.out.println();
        list.stream().filter(i ->i>0||i%2==0).forEach(i -> System.out.print(i+" "));
        // S6: list in elemanlarin karelerini aynı satırda bır bosluklu yazdıralım
        System.out.println();
        list.stream().map(i->i*i).forEach(i-> System.out.print(i+" "));
        //map():stream den gelen elemanları baska ttıplere donusturmek veya uzerlerınde
        //ıslem yapmak ıcın (update) kullanılır
        //S7: Listin cift elemanlarının kuplerini  aynı satırda bır bosluklu yazdıralım
        System.out.println();
        list.stream().filter(i->i%2==0).map(i->i*i*i).forEach(i-> System.out.print(i+" "));
        //S8 : list in elemanlarin karelerinden tekrarsiz yazdıralım
        System.out.println();
        list.stream().map(i->i*i).distinct().forEach(i-> System.out.print(i+" "));
        //distinct listedeki elemanlari tekrarsiz yazar
//distinct() => Bu method tekrarlı elemanları sadece bir kere akısa sokar.
// Bu akışın farklı elemanlarından (Object.equals (Object) 'e göre) oluşan bir akış döndürür.
// Sıralı akışlar için, farklı elemanın seçimi sabittir
// (yinelenen öğeler için, karşılaşma sırasında ilk görünen öğe korunur.)
// Sırasız akışlar için, herhangi bir kararlılık garantisi verilmez. Stream return eder.
        System.out.println();
//S9: listin elemanlarini kucukten buyuge siralayalim
        list.stream().sorted().forEach(i -> System.out.print(i+" "));
        System.out.println();
        //S10: listin elemanlarini buyukten kucuge siralayalim
        list.stream().sorted(Comparator.reverseOrder()).forEach(i -> System.out.print(i+" "));
        System.out.println();
// S11: list pozitif elemanlari icn kuplerini bulup birler basamagi 5 olanlardan yeni bir list olusturalim
        System.out.println(list.stream().filter(i -> i > 0).map(i -> i * i * i).filter(i -> i % 10 == 5).collect(Collectors.toList()));
        // .collect(Collectors.toList()); akıştan gelen elemanları yeni bir listenin içerisine yerleştirir.
        System.out.println();
        //S12: list pozitif elemanlari icn karelerini bulup birler basamagi
        // 5 olmayanlardan yeni bir list olusturalim
        System.out.println(list.stream().filter(i -> i > 0).map(i -> i * i).filter(i -> i % 10 != 5).collect(Collectors.toList()));
// S13 :list elemanlarini toplamini bulalim
        System.out.println(list.stream().reduce(0, (a, b) -> a + b));
        System.out.println(list.stream().reduce(Integer::sum));
        System.out.println(list.stream().reduce(Math::addExact));

    }
}
