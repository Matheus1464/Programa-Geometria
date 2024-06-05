
import java.util.Scanner;

public class Execução {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        G_Plana geometriaPlana = new G_Plana();
        G_Espacial geometriaEspacial = new G_Espacial();

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
                    System.out.println("Área do quadrado: " + geometriaPlana.AreaQuadrado(ladoQuadrado));
                    break;

                case 2:
                    System.out.print("Digite a base do retângulo: ");
                    double baseRetangulo = scanner.nextDouble();
                    System.out.print("Digite a altura do retângulo: ");
                    double alturaRetangulo = scanner.nextDouble();
                    System.out.println("Área do retângulo: " + geometriaPlana.AreaRetangulo(baseRetangulo, alturaRetangulo));
                    break;

                case 3:
                    System.out.print("Digite a base do triângulo: ");
                    double baseTriangulo = scanner.nextDouble();
                    System.out.print("Digite a altura do triângulo: ");
                    double alturaTriangulo = scanner.nextDouble();
                    System.out.println("Área do triângulo: " + geometriaPlana.AreaTriangulo(baseTriangulo, alturaTriangulo));
                    break;
                    
                case 4:
                    System.out.print("Digite o lado do triângulo equilátero: ");
                    double ladoTrianguloEquilatero = scanner.nextDouble();
                    System.out.println("Área do triângulo equilátero: " + geometriaPlana.AreaTrianguloEquilatero(ladoTrianguloEquilatero));
                    break;

                case 5:
                    System.out.print("Digite a base do paralelogramo: ");
                    double baseParalelogramo = scanner.nextDouble();
                    System.out.print("Digite a altura do paralelogramo: ");
                    double alturaParalelogramo = scanner.nextDouble();
                    System.out.println("Área do paralelogramo: " + geometriaPlana.AreaParalelogramo(baseParalelogramo, alturaParalelogramo));
                    break;

                case 6:
                    System.out.print("Digite a diagonal maior do losango: ");
                    double diagonalMaiorLosango = scanner.nextDouble();
                    System.out.print("Digite a diagonal menor do losango: ");
                    double diagonalMenorLosango = scanner.nextDouble();
                    System.out.println("Área do losango: " + geometriaPlana.AreaLosango(diagonalMaiorLosango, diagonalMenorLosango));
                    break;

                case 7:
                    System.out.print("Digite a base maior do trapézio: ");
                    double baseMaiorTrapezio = scanner.nextDouble();
                    System.out.print("Digite a base menor do trapézio: ");
                    double baseMenorTrapezio = scanner.nextDouble();
                    System.out.print("Digite a altura do trapézio: ");
                    double alturaTrapezio = scanner.nextDouble();
                    System.out.println("Área do trapézio: " + geometriaPlana.AreaTrapezio(baseMaiorTrapezio, baseMenorTrapezio, alturaTrapezio));
                    break;

                case 8:
                    System.out.print("Digite o raio do círculo: ");
                    double raioCirculo = scanner.nextDouble();
                    System.out.println("Área do círculo: " + geometriaPlana.AreaCirculo(raioCirculo));
                    break;
                    
                case 9:
                    System.out.print("Digite a base do prisma: ");
                    double basePrisma = scanner.nextDouble();
                    System.out.print("Digite a altura do prisma: ");
                    double alturaPrisma = scanner.nextDouble();
                    System.out.print("Digite a profundidade do prisma: ");
                    double profundidadePrisma = scanner.nextDouble();
                    double volumePrisma = geometriaEspacial.VolumePrisma(basePrisma, alturaPrisma, profundidadePrisma);
                    double areaPrisma = geometriaEspacial.AreaPrisma(basePrisma, alturaPrisma, profundidadePrisma);
                    System.out.println("Área da superfície do prisma: " + areaPrisma);
                    System.out.println("Volume do prisma: " + volumePrisma);
                    break;

                case 10:
                    System.out.print("Digite o raio do cilindro: ");
                    double raioCilindro = scanner.nextDouble();
                    System.out.print("Digite a altura do cilindro: ");
                    double alturaCilindro = scanner.nextDouble();
                    double volumeCilindro = geometriaEspacial.VolumeCilindro(raioCilindro, alturaCilindro);
                    double areaCilindro = geometriaEspacial.AreaCilindro(raioCilindro, alturaCilindro);
                    System.out.println("Área da superfície do cilindro: " + areaCilindro);
                    System.out.println("Volume do cilindro: " + volumeCilindro);
                    break;

                case 11:
                    System.out.print("Digite a base da pirâmide: ");
                    double basePiramide = scanner.nextDouble();
                    System.out.print("Digite a altura da pirâmide: ");
                    double alturaPiramide = scanner.nextDouble();
                    System.out.print("Digite a apotema da pirâmide: ");
                    double apotemaPiramide = scanner.nextDouble();
                    double volumePiramide = geometriaEspacial.VolumePiramide(basePiramide, alturaPiramide);
                    double areaPiramide = geometriaEspacial.AreaPiramide(basePiramide, alturaPiramide, apotemaPiramide);
                    System.out.println("Área da superfície da pirâmide: " + areaPiramide);
                    System.out.println("Volume da pirâmide: " + volumePiramide);
                    break;

                case 12:
                    System.out.print("Digite o raio da esfera: ");
                    double raioEsfera = scanner.nextDouble();
                    double volumeEsfera = geometriaEspacial.VolumeEsfera(raioEsfera);
                    double areaEsfera = geometriaEspacial.AreaEsfera(raioEsfera);
                    System.out.println("Área da superfície da esfera: " + areaEsfera);
                    System.out.println("Volume da esfera: " + volumeEsfera);
                    break;

                case 13:
                    System.out.print("Digite o raio do cone: ");
                    double raioCone = scanner.nextDouble();
                    System.out.print("Digite a altura do cone: ");
                    double alturaCone = scanner.nextDouble();
                    double volumeCone = geometriaEspacial.VolumeCone(raioCone, alturaCone);
                    double areaCone = geometriaEspacial.AreaCone(raioCone, alturaCone);
                    System.out.println("Área da superfície do cone: " + areaCone);
                    System.out.println("Volume do cone: " + volumeCone);
                    break;

                case 14:
                    System.out.print("Digite o raio maior do tronco de cone: ");
                    double raioMaiorTronco = scanner.nextDouble();
                    System.out.print("Digite o raio menor do tronco de cone: ");
                    double raioMenorTronco = scanner.nextDouble();
                    System.out.print("Digite a altura do tronco de cone: ");
                    double alturaTronco = scanner.nextDouble();
                    double volumeTronco = geometriaEspacial.VolumeTronco(raioMaiorTronco, raioMenorTronco, alturaTronco);
                    double areaTronco = geometriaEspacial.AreaTronco(raioMaiorTronco, raioMenorTronco, alturaTronco);
                    System.out.println("Área da superfície do tronco de cone: " + areaTronco);
                    System.out.println("Volume do tronco de cone: " + volumeTronco);
                    break;

                case 15:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } 
        while (escolha != 15);
        scanner.close();
    }
}