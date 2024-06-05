
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
            System.out.print("1 Calcular área do quadrado        ---    ");
            System.out.println("2 Calcular área do retângulo");
            System.out.print("3 Calcular área do triângulo       ---    ");
            System.out.println("4 Calcular área do triângulo equilátero");
            System.out.print("5 Calcular área do paralelogramo   ---    ");
            System.out.println("6 Calcular área do losango");
            System.out.print("7 Calcular área do trapézio        ---    ");
            System.out.println("8 Calcular área do círculo\n");
            System.out.println("Geometria espacial:");
            System.out.print("9 Calcular área e volume do prisma      ---    ");
            System.out.println("10 Calcular área e volume do cilindro");
            System.out.print("11 Calcular área e volume da pirâmide   ---    ");
            System.out.println("12 Calcular área e volume da esfera");
            System.out.print("13 Calcular área e volume do cone       ---    ");
            System.out.println("14 Calcular área e volume do tronco de cone");
            System.out.println("\n15 Sair");

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
                    System.out.print("Digite a base do triângulo: ");
                    double baseTriangulo = scanner.nextDouble();
                    System.out.print("Digite a altura do triângulo: ");
                    double alturaTriangulo = scanner.nextDouble();
                    System.out.println("Área do triângulo: " + geometriaPlana.calcularAreaTriangulo(baseTriangulo, alturaTriangulo));
                    break;
                case 4:
                    System.out.print("Digite o lado do triângulo equilátero: ");
                    double ladoTrianguloEquilatero = scanner.nextDouble();
                    System.out.println("Área do triângulo equilátero: " + geometriaPlana.calcularAreaTrianguloEquilatero(ladoTrianguloEquilatero));
                    break;
                case 5:
                    System.out.print("Digite a base do paralelogramo: ");
                    double baseParalelogramo = scanner.nextDouble();
                    System.out.print("Digite a altura do paralelogramo: ");
                    double alturaParalelogramo = scanner.nextDouble();
                    System.out.println("Área do paralelogramo: " + geometriaPlana.calcularAreaParalelogramo(baseParalelogramo, alturaParalelogramo));
                    break;
                case 6:
                    System.out.print("Digite a diagonal maior do losango: ");
                    double diagonalMaiorLosango = scanner.nextDouble();
                    System.out.print("Digite a diagonal menor do losango: ");
                    double diagonalMenorLosango = scanner.nextDouble();
                    System.out.println("Área do losango: " + geometriaPlana.calcularAreaLosango(diagonalMaiorLosango, diagonalMenorLosango));
                    break;
                case 7:
                    System.out.print("Digite a base maior do trapézio: ");
                    double baseMaiorTrapezio = scanner.nextDouble();
                    System.out.print("Digite a base menor do trapézio: ");
                    double baseMenorTrapezio = scanner.nextDouble();
                    System.out.print("Digite a altura do trapézio: ");
                    double alturaTrapezio = scanner.nextDouble();
                    System.out.println("Área do trapézio: " + geometriaPlana.calcularAreaTrapezio(baseMaiorTrapezio, baseMenorTrapezio, alturaTrapezio));
                    break;
                case 8:
                    System.out.print("Digite o raio do círculo: ");
                    double raioCirculo = scanner.nextDouble();
                    System.out.println("Área do círculo: " + geometriaPlana.calcularAreaCirculo(raioCirculo));
                    break;
                case 9:
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
            }
        } while (escolha != 15);
        scanner.close();
    }
}