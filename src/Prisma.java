
    public class Prisma {
        double base;
        double altura;
        public Prisma(double base, double altura) {
            this.base = base;
            this.altura = altura;
        }
        public double volume(){
            return base * altura;
        }
    }


