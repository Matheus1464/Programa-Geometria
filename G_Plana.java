
public class G_Plana {
    
    public double AreaQuadrado(double lado) {
        return lado * lado;
    }

    public double AreaRetangulo(double base, double altura) {
        return base * altura;
    }

    public double AreaTriangulo(double base, double altura) {
        return (base * altura) / 2.0;
    }

    public double AreaTrianguloEquilatero(double lado) {
        return (Math.sqrt(3) / 4) * lado * lado;
    }

    public double AreaParalelogramo(double base, double altura) {
        return base * altura;
    }

    public double AreaLosango(double diagonalMaior, double diagonalMenor) {
        return (diagonalMaior * diagonalMenor) / 2.0;
    }

    public double AreaTrapezio(double baseMaior, double baseMenor, double altura) {
        return ((baseMaior + baseMenor) * altura) / 2.0;
    }

    public double AreaCirculo(double raio) {
        return Math.PI * raio * raio;
    }
}
