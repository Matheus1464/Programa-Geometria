import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GeometriaPlana geometriaPlana = new GeometriaPlana();
        GeometriaEspacial geometriaEspacial = new GeometriaEspacial();

        int escolha;
        do {
            System.out.println("\nEscolha uma opção:\n");
            System.out.println("Geometria plana:");
            System.out.print("1 Calcular área do quadrado -- ");
            System.out.println("2 Calcular área do retângulo\n");
            System.out.println("Geometria espacial:");
            System.out.print("3 Calcular área e volume do prisma -- ");
            System.out.println("4 Calcular área e volume do cilindro");
            System.out.println("\n5 Sair");

            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("\nDigite o lado do quadrado: ");
                    double ladoQuadrado = scanner.nextDouble();
                    System.out.println("Área do quadrado: " + geometriaPlana.calcularAreaQuadrado(ladoQuadrado));
                    break;
                case 2:
                    System.out.print("Digite a base do retângulo: ");
                    double baseRetangulo = scanner.nextDouble();
                    System.out.print("Digite a altura do retângulo: ");
                    double alturaRetangulo = scanner.nextDouble();
                    System.out.println("Área do retângulo: " + geometriaPlana.calcularAreaRetangulo(baseRetangulo, alturaRetangulo));
                    break;
                case 3:
                    System.out.print("Digite a base do prisma: ");
                    double basePrisma = scanner.nextDouble();
                    System.out.print("Digite a altura do prisma: ");
                    double alturaPrisma = scanner.nextDouble();
                    System.out.print("Digite a profundidade do prisma: ");
                    double profundidadePrisma = scanner.nextDouble();
                    double volumePrisma = geometriaEspacial.calcularVolumePrisma(basePrisma, alturaPrisma, profundidadePrisma);
                    double areaSuperficiePrisma = geometriaEspacial.calcularAreaSuperficiePrisma(basePrisma, alturaPrisma, profundidadePrisma);
                    System.out.println("Área da superfície do prisma: " + areaSuperficiePrisma);
                    System.out.println("Volume do prisma: " + volumePrisma);
                    break;
                case 4:
                    System.out.print("Digite o raio do cilindro: ");
                    double raioCilindro = scanner.nextDouble();
                    System.out.print("Digite a altura do cilindro: ");
                    double alturaCilindro = scanner.nextDouble();
                    double volumeCilindro = geometriaEspacial.calcularVolumeCilindro(raioCilindro, alturaCilindro);
                    double areaSuperficieCilindro = geometriaEspacial.calcularAreaSuperficieCilindro(raioCilindro, alturaCilindro);
                    System.out.println("Área da superfície do cilindro: " + areaSuperficieCilindro);
                    System.out.println("Volume do cilindro: " + volumeCilindro);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");

            }
        }
        while (escolha != 5);
        scanner.close();
    }
}
