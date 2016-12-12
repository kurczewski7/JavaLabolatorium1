package pl.wroc.pwr.kurczewski;

/**
 * Created by Slawek on 11.12.2016.
 */
public class Punkt {


    private double x=0;
    private double y=0;
    private double minRandomX=0;
    private double maxRandomX=1;
    private double minRandomY=0;
    private double maxRandomY=1;

    private String name="Punkt";

    public Punkt(double x, double y)
    {
        this.x=x;
        this.y=y;
    }
    public void setName(String name) { this.name=name; }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    boolean isInCircle(Kolo k) {
        return  k.isInCircle(this);
    }


    public void setRandomPoints(){
        double zakresX=this.maxRandomX-this.minRandomX;
        double zakresY=this.maxRandomY-this.minRandomY;

        x = Math.random()*zakresX+minRandomX;
        y = Math.random()*zakresY+minRandomY;
    }
    public void setRandomScope( double minRandomX, double maxRandomX,double minRandomY, double maxRandomY){
        this.minRandomX=minRandomX;
        this.maxRandomX=maxRandomX;
        this.minRandomY=minRandomY;
        this.maxRandomY=maxRandomY;
    }
    public String getRandomCcope(){
        return "Zakres losowania: X ("+this.minRandomX+","+this.maxRandomX+"), Y ("+this.minRandomY+","+this.maxRandomY+")";
    }

    public double distance(Punkt p) {
        double dx=x-p.getX();
        double dy=y-p.getY();
        double wynik=(dx*dx)+(dy*dy);

        return Math.sqrt(wynik);
    }
    @Override
    public String toString() {
        String valX=String.format("%s",x);
        String valY=String.format("%s",y);
        return ""+this.name+" ("+valX+", "+valY+")";
    }
}
