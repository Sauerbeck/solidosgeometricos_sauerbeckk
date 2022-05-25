public class Main {
    public static void main(String[] args) {

        Cubo cubo = new Cubo(10,10,10);
        System.out.println(cubo.volume());
        Piramide piramide  = new Piramide(10,10,3);
        System.out.println(piramide.volume());
        Prisma prisma = new Prisma(10,5);
        System.out.println(prisma.volume());
        Cone cone = new Cone(10,5);
        System.out.println(cone.volume());

    }
}
