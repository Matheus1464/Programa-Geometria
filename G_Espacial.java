
public class G_Espacial {

    public double VolumePrisma(double base, double altura, double profundidade) {
        double volume = base * altura * profundidade;
        return volume;
    }

    public double AreaPrisma(double base, double altura, double profundidade) {
        double areaBase = base * altura;
        double areaLateral = 2 * (base * profundidade + altura * profundidade);
        double areaTotal = 2 * areaBase + areaLateral;
        return areaTotal;
    }

    public double VolumeCilindro(double raio, double altura) {
        double volume = Math.PI * raio * raio * altura;
        return volume;
    }

    public double AreaCilindro(double raio, double altura) {
        double areaBase = Math.PI * raio * raio;
        double areaLateral = 2 * Math.PI * raio * altura;
        double areaTotal = 2 * areaBase + areaLateral;
        return areaTotal;
    }

    public double VolumePiramide(double base, double altura) {
        double volume = (1.0 / 3.0) * base * altura;
        return volume;
    }

    public double AreaPiramide(double base, double altura, double apotema) {
        double areaBase = base * base;
        double areaLateral = 2 * base * apotema;
        double areaTotal = areaBase + areaLateral;
        return areaTotal;
    }

    public double VolumeEsfera(double raio) {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
        return volume;
    }

    public double AreaEsfera(double raio) {
        double area = 4 * Math.PI * Math.pow(raio, 2);
        return area;
    }

    public double VolumeCone(double raio, double altura) {
        double volume = (1.0 / 3.0) * Math.PI * Math.pow(raio, 3) * altura;
        return volume;
    }

    public double AreaCone(double raio, double altura) {
        double areaBase = Math.PI * Math.pow(raio, 2);
        double geratriz = Math.sqrt(Math.pow(raio, 2) + Math.pow(altura, 2));
        double areaLateral = Math.PI * raio * geratriz;
        double areaTotal = areaBase + areaLateral;
        return areaTotal;
    }

    public double VolumeTronco(double raioMaior, double raioMenor, double altura) {
        double volume = (1.0 / 3.0) * Math.PI * altura * (Math.pow(raioMaior, 2) + Math.pow(raioMenor, 2) + raioMaior * raioMenor);
        return volume;
    }

    public double AreaTronco(double raioMaior, double raioMenor, double altura) {
        double geratriz = Math.sqrt(Math.pow((raioMaior - raioMenor), 2) + Math.pow(altura, 2));
        double areaBaseMaior = Math.PI * Math.pow(raioMaior, 2);
        double areaBaseMenor = Math.PI * Math.pow(raioMenor, 2);
        double areaLateral = Math.PI * geratriz * (raioMaior + raioMenor);
        double areaTotal = areaBaseMaior + areaBaseMenor + areaLateral;
        return areaTotal;
    }
}