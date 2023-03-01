// Actividad de clase
// Actividad Figuras_Geometricas
// Equipo Fier
// Conde Orozco Maria Fernanda
// De la cruz Luna Javier 
// Tobon Cahum Marco David 
package figurasGeométricas;

public class Triángulo {
	private double lado1;
    private double lado2;
    private double lado3;
    private double p;
    private double a;

    public Triángulo (double lado1, double lado2, double lado3) {
       
    	if (lado1 > 0 && lado2 > 0 && lado3 > 0) {
            this.lado1 = lado1;
            this.lado2 = lado2;
            this.lado3 = lado3;
        } else {
            System.out.println("Error: los lados deben ser positivos. Se asignará el valor 1.");
            this.lado1 = 1;
            this.lado2 = 1;
            this.lado3 = 1;
        }
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        if (lado1 > 0) {
            this.lado1 = lado1;
        } else {
            System.out.println("Error: el lado debe ser positivo. No se asignará el valor.");
        }
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        if (lado2 > 0) {
            this.lado2 = lado2;
        } else {
            System.out.println("Error: el lado debe ser positivo. No se asignará el valor.");
        }
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        if (lado3 > 0) {
            this.lado3 = lado3;
        } else {
            System.out.println("Error: el lado debe ser positivo. No se asignará el valor.");
        }
    }

    public double getPerimetro() {
    	p = lado1 + lado2 + lado3;
    	return p;
    }

    public double getArea() {
      a = p / 2;
      Math.sqrt(a * (a - lado1) * (a - lado2) * (a - lado3));
        return a;
    }

    public String getTipo() {
        if (lado1 == lado2 && lado2 == lado3) {
            return "Equilatero";
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return "Isóseles";
        } else {
            return "Escaleno";
        }

    }
   
    public boolean isRectangulo() {
        double m = lado1 * lado1;
        double n = lado2 * lado2;
        double ñ = lado3 * lado3;
        boolean r = (m == n + ñ) || (n == m + ñ) || (ñ == m + n);
        System.out.print("Triangulo Rectangulo: ");

        return r;
    }
}
