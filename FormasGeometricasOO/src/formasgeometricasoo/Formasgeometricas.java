
package formasgeometricasoo;


public abstract class Formasgeometricas  {
    
    private Cor borda, preenchimento;
    
    
    public Formasgeometricas(){
        this.borda=new Cor(255,0,0,0);
        this.preenchimento=new Cor(255,255,255,255);     
    }
    
    public Formasgeometricas(Cor borda, Cor preenchimento, Ponto centro){
        this.borda= borda;
        this.preenchimento= preenchimento;      
    }
    
    public Cor getCorBorda() {
	return borda;
    }
    
    public void setCorBorda(Cor borda) {
	this.borda=borda;
    }
    
    public Cor getCorPreenchimento() {
	return preenchimento;
    }
    
    public void setCorPreenchimento(Cor preenchimento) {
        this.preenchimento=preenchimento;
    }    
    
    @Override
     public String toString() {
	String s="";
	s+="Cor da Borda (a,r,g,b): ("+borda.getAlpha()+","+borda.getRed()+","+borda.getGreen()+","+borda.getBlue()+")\n";
	s+="Cor de Preenchimento: ("+preenchimento.getAlpha()+","+preenchimento.getRed()+","+preenchimento.getGreen()+","+preenchimento.getBlue()+")\n";

        return s;
    }  
    
  
}
