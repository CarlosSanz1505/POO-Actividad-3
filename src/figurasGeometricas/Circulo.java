package figurasGeometricas;

public class Circulo {
    public double radio;
    public double perimetro() {
        return 2*Math.PI*radio;
    }
    
    public double area() {
        return Math.PI*Math.pow(radio, 2);
    }
}
