package solid.OCP.solution;

//Open Closed Principle (Tem que ser aberta para extends e open para alteracao
public class ControladorDeDesconto {
    public void adicionarDescontoLivro(DescontoLivro descontoLivro){
        descontoLivro.valorDesconto ();
    }

}
