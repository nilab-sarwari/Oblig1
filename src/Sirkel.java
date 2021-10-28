public class Sirkel {
    public double getDiameter(double r){
        return r*2;
    }

    public double getOmkrets(double r){
        return 2*Math.PI*r;
    }

    public double getAreal(double r){
        return Math.PI*Math.pow(r, 2);
    }
}
