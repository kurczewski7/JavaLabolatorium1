package pl.wroc.pwr.kurczewski;
import static jdk.nashorn.internal.objects.Global.print;
import static jdk.nashorn.internal.objects.Global.println;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double promien=2;
        int ilosc=10;   // rozmiar pętli
        int i;


        Punkt punkt=new Punkt(1,2);
        Punkt punkt2=new Punkt(1,2);
        System.out.println("Obiekty punkt i koło");
        System.out.println(punkt);

        Punkt srodek=new Punkt(1,1);
        Kolo kolo= new Kolo(srodek,promien);
        System.out.println(kolo);
        punkt.setRandomScope(0,2,0,2);
        System.out.println(punkt.getRandomCcope());
        kolo.losujKilka(punkt, ilosc);


        kolo.setName("Drugie koło");
        srodek.setX(-1);
        srodek.setY(1);
        kolo.setR(1);
        System.out.println(kolo);
        punkt.setRandomScope(-2,0,0,2);
        System.out.println(punkt.getRandomCcope());
        kolo.losujKilka(punkt, ilosc);


        kolo.setName("Trzecia koło");
        srodek.setX(-1);
        srodek.setY(-1);
        kolo.setR(1);
        System.out.println(kolo);
        punkt.setRandomScope(-2,0,-2,0);
        System.out.println(punkt.getRandomCcope());
        kolo.losujKilka(punkt, ilosc);


        kolo.setName("Czwarte koło");
        srodek.setX(1);
        srodek.setY(-1);
        kolo.setR(1);
        System.out.println(kolo);
        punkt.setRandomScope(0,2,-2,0);
        System.out.println(punkt.getRandomCcope());
        kolo.losujKilka(punkt, ilosc);

        System.out.println("--------------------------------------_------------------");
        System.out.println("Dwa koła zachodzące na siebie, środki na jednej wysokości");
        kolo.setName("Kało małe");
        srodek.setX(-2);
        srodek.setY(1);
        kolo.setR(2);
        System.out.println(kolo);
        punkt.setRandomScope(-2,0,-1,3);
        System.out.println(punkt.getRandomCcope());
        System.out.println("");

        Punkt srodek2 = new Punkt(2, 1);
        Kolo kolo2=new Kolo(srodek2,3);
        kolo2.setName("Koło duże");
        System.out.println(kolo2);
        punkt2.setRandomScope(-1,5,-2,4);
        System.out.println(punkt2.getRandomCcope());
        System.out.println("");

        System.out.println("Losowanie w obszarze koła małego. ");
        System.out.println(punkt.getRandomCcope());
        for(i=1; i<=ilosc; i++){
            punkt.setRandomPoints();
            boolean inCircle1 = kolo.isInCircle(punkt);
            punkt2.setX(punkt.getX());
            punkt2.setY(punkt.getY());
            boolean inCircle2 = kolo2.isInCircle(punkt2);
            punkt.setName(String.format("   Punkt %d", i));
            if (inCircle1 && inCircle2) {

                System.out.println(punkt + "należy do obu kół");
            } else if (inCircle1) {
                System.out.println(punkt + "należy do koła mniejszego");
            } else if (inCircle2) {
                System.out.println(punkt + "należy do koła większego");
            } else {
                System.out.println(punkt + "nie należy żadnego koła");
            }
        }

        System.out.println("Losowanie w obszarze koła dużego.");
        System.out.println(punkt2.getRandomCcope());
        for(i=1; i<=ilosc; i++){
            punkt2.setRandomPoints();
            boolean inCircle1 = kolo.isInCircle(punkt2);
            punkt.setX(punkt2.getX());
            punkt.setY(punkt2.getY());
            boolean inCircle2 = kolo2.isInCircle(punkt);
            punkt2.setName(String.format("   Punkt %d", i));
            if (inCircle1 && inCircle2) {

                System.out.println(punkt2 + "należy do obu kół");
            } else if (inCircle1) {
                System.out.println(punkt2 + "należy do koła mniejszego");
            } else if (inCircle2) {
                System.out.println(punkt2 + "należy do koła większego");
            } else {
                System.out.println(punkt2 + "nie należy żadnego koła");
            }
        }

    }
}
