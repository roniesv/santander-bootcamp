package solid.LSP.problem;
//
public class Main {
    public static void main(String[] args) {
        //retangulo base sofre alteracao nos seu metodo na classe filha
        //solucaoes diversas, criar uma interface para q cada uma implementasse sua propria area.
        //quadrado nao extender um retangulo. Nem toda abstracao funciona se nao for feita com sua clase base tambem
        Retangulo retangulo = new Quadrado();
        retangulo.setAltura(10);
        retangulo.setLargura(5);

        System.out.println("Area :"+retangulo.getArea());
    }


}
