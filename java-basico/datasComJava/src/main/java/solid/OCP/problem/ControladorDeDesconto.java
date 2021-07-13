package solid.OCP.problem;

//Open Closed Principle (Tem que ser aberta para extends e open para alteracao
public class ControladorDeDesconto {
    public void adicionarDescontoLivroInfantil(DescontoLivroInfantil descontoLivroInfantil){
        descontoLivroInfantil.valorDescontoLivroInfantil();
    }
    public void adicionarDescontoLivroAutoAjuda(DescontoLivroAutoAjuda descontoLivroAutoAjuda){
        descontoLivroAutoAjuda.valorDescontoLivroAutoAjuda();
    }
    public void adicionarDescontoLivroAcao(DescontoLivroAcao descontoLivroAcao){
        descontoLivroAcao.valorDescontoLivroAcao();
    }


}
