
public class GeometriaEspacial {
    // Método para calcular a área da base e o volume do prisma
    public double calcularVolumePrisma(double base, double altura, double profundidade) {
        double volume = base * altura * profundidade;
        return volume;
    }
 
    // Método para calcular a área da superfície e o volume do cilindro
    public double calcularVolumeCilindro(double raio, double altura) {
        double volume = Math.PI * raio * raio * altura;
        return volume;
    }
    
    // Método para calcular a área da superfície do prisma
    public double calcularAreaSuperficiePrisma(double base, double altura, double profundidade) {
        double areaBase = base * altura;
        double areaLateral = 2 * (base * profundidade + altura * profundidade);
        double areaTotal = 2 * areaBase + areaLateral;
        return areaTotal;
    }
    
    // Método para calcular a área da superfície do cilindro
    public double calcularAreaSuperficieCilindro(double raio, double altura) {
        double areaBase = Math.PI * raio * raio;
        double areaLateral = 2 * Math.PI * raio * altura;
        double areaTotal = 2 * areaBase + areaLateral;
        return areaTotal;
    }
}