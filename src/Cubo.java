public class Cubo {
    double base;
    double altura;
    double largura;

    public Cubo(double base, double altura, double largura){
        this.base = base;
        this.altura = altura;
        this.largura = largura;
    }
    public double volume(){
        return base * altura * largura;
    }

}
