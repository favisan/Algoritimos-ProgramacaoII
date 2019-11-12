package Aula8.TAD;

/**
 * @author pedro.saraujo
 */
public class Fracao {
    
    // atributos
    private int numerador, denominador;
    
    // construtor
    public Fracao (int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
    
    // mÃ©todos
    public Fracao soma (Fracao f) {
        int n = this.numerador*f.denominador 
                + this.denominador*f.numerador;
        int d = this.denominador*f.denominador;
        return new Fracao(n, d);
    }
    
    public Fracao multiplicacao (Fracao f) {
        int n = this.numerador*f.numerador;
        int d = this.denominador*f.denominador;
        return new Fracao(n, d);
    }
    
    public boolean igualdade (Fracao f) {
            return this.numerador*f.denominador == this.denominador*f.numerador;
    }
    
  
    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }
}
