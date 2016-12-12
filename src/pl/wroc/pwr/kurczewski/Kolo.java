package pl.wroc.pwr.kurczewski;

/**
 * Created by Slawek on 11.12.2016.
 */
public class Kolo {
    Punkt circleCenter;
    double r=0;
    String name="Koło";

    public Kolo(Punkt sr, double r){
        this.circleCenter=sr;
        this.r=r;
        circleCenter.setName("środek");
    }
    boolean isInCircle(Punkt p){
        return circleCenter.distance(p) <=r;
    }

    public void setName(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return name+" ["+circleCenter+", promień "+r+"]";
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void losujKilka(Punkt punkt, int ilosc){
          String napis;
          for( int i=1;i<=ilosc; i++) {
            punkt.setRandomPoints();
            punkt.setName(String.format("   Punkt %d",i));
            System.out.println(punkt+((this.isInCircle(punkt)) ? "w obrębie koła "  : "poza kołem "));
        }
    }

}
