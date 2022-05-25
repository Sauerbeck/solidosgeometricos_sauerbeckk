public class Cone {
    double altura;
    double raio;
    double pie=3.14;
    public Cone(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
        this.pie = pie;
    }
    public double volume() {
        return pie*(raio*raio)*altura/3;
    }
}
