// Actividad de clase
// Actividad Figuras_Geometricas
// Equipo Fier
// Conde Orozco Maria Fernanda
// De la cruz Luna Javier 
// Tobon Cahum Marco David 
package figurasGeométricas;

public class Rectángulo {
  private double b;
  private double h;
  private double a;
  private double p;
    
    
    public Rectángulo(double b, double h) {
  	  this.b=b;	
  	  this.h=h;	
  	  
  	  }

	public double getB() {
		if(b <= 0) {
			b = 0.0;
			System.out.print("Error ");
		}else {
			System.out.print("");
		}
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getH() {
		if(h <= 0) {
			h = 0.0;
			System.out.print("Error ");
		}else {
			System.out.print("");
		}
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}

	public double getA() {
		a = b * h;
		if(b <= 0 || h<=0) {
			a=0.0;
			System.out.print("Error ");
		}else {
			System.out.print("El área es: ");
		}
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getP() {
		p = 2*b + 2*h;
		if(b <= 0 || h<=0) {
			p=0.0;
			System.out.print("Error ");
		}else {
			System.out.print("El perímetro es: ");
		}
		return p;
	}

	public void setP(double p) {
		this.p = p;
	}
	
	public boolean getC() {
		boolean c = b == h;
		System.out.println("");
		System.out.print("Cuadrado: ");
		return c;

	}
}
