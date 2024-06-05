
public class GeometriaPlana {
    // Método para calcular a área do quadrado
    public double calcularAreaQuadrado(double lado) {
        return lado * lado;
    }

    // Método para calcular a área do retângulo
    public double calcularAreaRetangulo(double base, double altura) {
        return base * altura;
    }

    // Método para calcular a área do triângulo
    public double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2.0;
    }

    // Método para calcular a área do triângulo equilátero
    public double calcularAreaTrianguloEquilatero(double lado) {
        return (Math.sqrt(3) / 4) * lado * lado;
    }

    // Método para calcular a área do paralelogramo
    public double calcularAreaParalelogramo(double base, double altura) {
        return base * altura;
    }

    // Método para calcular a área do losango
    public double calcularAreaLosango(double diagonalMaior, double diagonalMenor) {
        return (diagonalMaior * diagonalMenor) / 2.0;
    }

    // Método para calcular a área do trapézio
    public double calcularAreaTrapezio(double baseMaior, double baseMenor, double altura) {
        return ((baseMaior + baseMenor) * altura) / 2.0;
    }

    // Método para calcular a área do círculo
    public double calcularAreaCirculo(double raio) {
        return Math.PI * raio * raio;
    }
}
