
import java.util.Scanner;
 
public class Execução {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        G_Plana geometriaPlana = new G_Plana();
        G_Espacial geometriaEspacial = new G_Espacial();
        int escolha;


        do {
            escolha = menuPrincipal(scanner);
            switch (escolha) {
                case 1:
                    menuGeometriaPlana(scanner, geometriaPlana);
                    break;

                case 2:
                    menuGeometriaEspacial(scanner, geometriaEspacial);
                    break;

                case 3:
                    System.out.println("\nSaindo");
                    break;
                default:
                    System.out.println("\nOpção inválida.");
           }
        } while (escolha != 3);
        scanner.close();
    }
 

    private static int menuPrincipal(Scanner scanner) {
        System.out.println("\nEscolha uma opção:");
        System.out.println("1 Geometria plana");
        System.out.println("2 Geometria espacial");
        System.out.println("3 Sair");
        return scanner.nextInt();
    }
 

    private static void menuGeometriaPlana(Scanner scanner, G_Plana geometriaPlana) {
        int escolha;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.print("1 Área do Quadrado       ---   ");
            System.out.println("2 Área do Retângulo");
            System.out.print("3 Área do Triângulo      ---   ");
            System.out.println("4 Área do Triângulo Equilátero");
            System.out.print("5 Área do Paralelogramo  ---   ");
            System.out.println("6 Área do Losango");
            System.out.print("7 Área do Trapézio       ---   ");
            System.out.println("8 Área do Círculo");
            System.out.println("9 Voltar ao Menu Principal");
 
            escolha = scanner.nextInt();
            double lado, base, altura, diagonalMaior, diagonalMenor, raio;
 

            switch (escolha) {
                case 1:
                    System.out.print("\nDigite o lado do quadrado: ");
                    lado = scanner.nextDouble();
                    System.out.println("Área do quadrado: " + geometriaPlana.AreaQuadrado(lado));
                    break;

                case 2:
                    System.out.print("\nDigite a base do retângulo: ");
                    base = scanner.nextDouble();
                    System.out.print("Digite a altura do retângulo: ");
                    altura = scanner.nextDouble();
                    System.out.println("Área do retângulo: " + geometriaPlana.AreaRetangulo(base, altura));
                    break;

                case 3:
                    System.out.print("\nDigite a base do triângulo: ");
                    base = scanner.nextDouble();
                    System.out.print("Digite a altura do triângulo: ");
                    altura = scanner.nextDouble();
                    System.out.println("Área do triângulo: " + geometriaPlana.AreaTriangulo(base, altura));
                    break;

                case 4:
                    System.out.print("\nDigite o lado do triângulo equilátero: ");
                    lado = scanner.nextDouble();
                    System.out.println("Área do triângulo equilátero: " + geometriaPlana.AreaTrianguloEquilatero(lado));
                    break;

                case 5:
                    System.out.print("\nDigite a base do paralelogramo: ");
                    base = scanner.nextDouble();
                    System.out.print("Digite a altura do paralelogramo: ");
                    altura = scanner.nextDouble();
                    System.out.println("Área do paralelogramo: " + geometriaPlana.AreaParalelogramo(base, altura));
                    break;

                case 6:
                    System.out.print("\nDigite a diagonal maior do losango: ");
                    diagonalMaior = scanner.nextDouble();
                    System.out.print("Digite a diagonal menor do losango: ");
                    diagonalMenor = scanner.nextDouble();
                    System.out.println("Área do losango: " + geometriaPlana.AreaLosango(diagonalMaior, diagonalMenor));
                    break;

                case 7:
                    System.out.print("\nDigite a base maior do trapézio: ");
                    base = scanner.nextDouble();
                    System.out.print("Digite a base menor do trapézio: ");
                    double baseMenor = scanner.nextDouble();
                    System.out.print("Digite a altura do trapézio: ");
                    altura = scanner.nextDouble();
                    System.out.println("Área do trapézio: " + geometriaPlana.AreaTrapezio(base, baseMenor, altura));
                    break;

                case 8:
                    System.out.print("\nDigite o raio do círculo: ");
                    raio = scanner.nextDouble();
                    System.out.println("Área do círculo: " + geometriaPlana.AreaCirculo(raio));
                    break;
                    
                case 9:
                    System.out.println("\nVoltando ao menu principal");
                    break;
                default:
                    System.out.println("\nOpção inválida.");
            }
        } while (escolha != 9);
    }
 

    private static void menuGeometriaEspacial(Scanner scanner, G_Espacial geometriaEspacial) {
        int escolha;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.print("1 Área e Volume do Prisma     ---   ");
            System.out.println("2 Área e Volume do Cilindro");
            System.out.print("3 Área e Volume da Pirâmide   ---   ");
            System.out.println("4 Área e Volume da Esfera");
            System.out.print("5 Área e Volume do Cone       ---   ");
            System.out.println("6 Área e Volume do Tronco de Cone");
            System.out.println("7 Voltar ao Menu Principal");
 
            escolha = scanner.nextInt();
            double base, altura, profundidade, raio, apotema, raioMaior, raioMenor;
 

            switch (escolha) {
                case 1:
                    System.out.print("\nDigite a base do prisma: ");
                    base = scanner.nextDouble();
                    System.out.print("Digite a altura do prisma: ");
                    altura = scanner.nextDouble();
                    System.out.print("Digite a profundidade do prisma: ");
                    profundidade = scanner.nextDouble();
                    System.out.println("Área da superfície do prisma: " + geometriaEspacial.AreaPrisma(base, altura, profundidade));
                    System.out.println("Volume do prisma: " + geometriaEspacial.VolumePrisma(base, altura, profundidade));
                    break;
                    
                case 2:
                    System.out.print("\nDigite o raio do cilindro: ");
                    raio = scanner.nextDouble();
                    System.out.print("Digite a altura do cilindro: ");
                    altura = scanner.nextDouble();
                    System.out.println("Área da superfície do cilindro: " + geometriaEspacial.AreaCilindro(raio, altura));
                    System.out.println("Volume do cilindro: " + geometriaEspacial.VolumeCilindro(raio, altura));
                    break;

                case 3:
                    System.out.print("\nDigite a base da pirâmide: ");
                    base = scanner.nextDouble();
                    System.out.print("Digite a altura da pirâmide: ");
                    altura = scanner.nextDouble();
                    System.out.print("Digite a apotema da pirâmide: ");
                    apotema = scanner.nextDouble();
                    System.out.println("Área da superfície da pirâmide: " + geometriaEspacial.AreaPiramide(base, altura, apotema));
                    System.out.println("Volume da pirâmide: " + geometriaEspacial.VolumePiramide(base, altura));
                    break;

                case 4:
                    System.out.print("\nDigite o raio da esfera: ");
                    raio = scanner.nextDouble();
                    System.out.println("Área da superfície da esfera: " + geometriaEspacial.AreaEsfera(raio));
                    System.out.println("Volume da esfera: " + geometriaEspacial.VolumeEsfera(raio));
                    break;

                case 5:
                    System.out.print("\nDigite o raio do cone: ");
                    raio = scanner.nextDouble();
                    System.out.print("Digite a altura do cone: ");
                    altura = scanner.nextDouble();
                    System.out.println("Área da superfície do cone: " + geometriaEspacial.AreaCone(raio, altura));
                    System.out.println("Volume do cone: " + geometriaEspacial.VolumeCone(raio, altura));
                    break;

                case 6:
                    System.out.print("\nDigite o raio maior do tronco de cone: ");
                    raioMaior = scanner.nextDouble();
                    System.out.print("Digite o raio menor do tronco de cone: ");
                    raioMenor = scanner.nextDouble();
                    System.out.print("Digite a altura do tronco de cone: ");
                    altura = scanner.nextDouble();
                    System.out.println("Área da superfície do tronco de cone: " + geometriaEspacial.AreaTronco(raioMaior, raioMenor, altura));
                    System.out.println("Volume do tronco de cone: " + geometriaEspacial.VolumeTronco(raioMaior, raioMenor, altura));
                    break;

                case 7:
                    System.out.println("\nVoltando ao menu principal");
                    break;
                default:
                    System.out.println("\nOpção inválida.");

            }
        } while (escolha != 7);
    }
}