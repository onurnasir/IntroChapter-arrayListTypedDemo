import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> sehirler = new ArrayList<>();
        sehirler.add("Ankara");
        //sehirler.add(1); //Yukarda tanımladığımız gibi sadece String ifade olmalıdır.
        sehirler.add("İstanbul");
        sehirler.add("İzmir");
        sehirler.add("Aydın");

        //sehirler.remove(0); //Bu şekilde de silinebilir.Bir alt satırdaki gibide silinebilir.
        sehirler.remove("İstanbul");
        Collections.sort(sehirler);
        for (String sehir : sehirler) { // Bu for each yapısıdır.
            System.out.println(sehir);
        }
    }
}