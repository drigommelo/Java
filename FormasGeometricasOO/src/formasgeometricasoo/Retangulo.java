package formasgeometricasoo;


public  class Retangulo extends Formasgeometricas {
	private Cor borda, preenchimento;
	private Ponto p1;
	private Ponto p2;

	public Retangulo() {
		super();
		p1=new Ponto(0,0);
		p2=new Ponto(1,1);
	}
	public Retangulo(Ponto p1,Ponto p2) {
		super();
		this.p1=p1;
		this.p2=p2;
	}
	public Retangulo(Ponto p1,Ponto p2,Cor borda,Cor preenchimento)  {
		super ();
		this.p1=p1;
		this.p2=p2;
	}
        
	public void setVertice1(Ponto p1) {
		this.p1=p1;
	}
	public Ponto getVertice1() {
		return p1;
	}
	public void setVertice2(Ponto p2) {
		this.p2=p2;
	}
	public Ponto getVertice2() {
		return p2;
	}
	public  double area() {
	    double area;
	    area=Math.abs(p1.getX()-p2.getX()) * Math.abs(p1.getY()-p2.getY()) ;
		return area;
	}
	public  double perimetro() {
	    double perimetro;
	    perimetro=(Math.abs(p1.getX()-p2.getX()) + Math.abs(p1.getY()-p2.getY()))*2 ;
		return perimetro;
	}
	public boolean isIn (Ponto p) {
		double minX,minY,maxX,maxY;
		if (p1.getX()<p2.getX()) {
			minX=p1.getX();
			maxX=p2.getX();
		}
		else {
			minX=p2.getX();
			maxX=p1.getX();
		}
	   if (p1.getY()<p2.getY()) {
			minY=p1.getY();
			maxY=p2.getY();
		}
		else {
			minY=p2.getY();
			maxY=p1.getY();
		}
        return !((p.getX()<minX) || (p.getX()>maxX) || (p.getY()<minY) || (p.getY()>maxY));
	}
     
        @Override
	public String toString() {
		String s="Forma: Eu sou um Retangulo\n";
		s+=super.toString();
                s+="Caracteristicas Geometricas\n";
		s+="Coordenadas do Vertice 1: ("+p1.getX()+","+p1.getY()+")\n";
		s+="Coordenadas do Vertice 2: ("+p2.getX()+","+p2.getY()+")\n";
		s+="Area: " +area()+"\n";
		s+="Perimetro: " +perimetro();
		return s;
	}
}