public class Piramide {
    double base;
    double altura;
    double area;

    public Piramide(double base, double altura, double area){
        this.base = base;
        this.altura = altura;
        this.area = area;
    }
    public double volume(){
        return base * altura / area;
    }

}
