package solid.LSP.problem;

public class Retangulo {
    private double altura;
    private double largura;

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public double getLargura() {
            return largura;
    }
    public double getArea(){
        return altura*largura;
    }

}
