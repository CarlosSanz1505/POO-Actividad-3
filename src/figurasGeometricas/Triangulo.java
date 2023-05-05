package figurasGeometricas;

public class Triangulo {
    public double base, altura;
    public double hipotenusa() {
        return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }
    
    public double perimetro() {
        return base + altura + hipotenusa();
    }
    
    public double area() {
        return base*altura/2;
    }
    
    public String tipo() {
        // Un triangulo rectángulo NO puede ser equilatero
        // Solo los catetos pueden ser iguales
        if (base == altura) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }
}
