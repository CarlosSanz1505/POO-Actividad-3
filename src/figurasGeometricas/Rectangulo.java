package figurasGeometricas;

public class Rectangulo {
    public double base, altura;
    public double perimetro() {
        return 2*base + 2*altura;
    }
    
    public double area() {
        return base*altura;
    }
}
