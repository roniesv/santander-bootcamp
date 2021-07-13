package solid.SRP.problem;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

//single responsibility principle
//ordem de compra ter seu principio...salvar banco, recuperar do banco, enviar por email, imprimir evitar o godclass
public class OrdemDeCompra {
    private List<solid.SRP.solution.Produto> produtos = new ArrayList<>();
    public void adicionarProdutos(solid.SRP.solution.Produto produto){produtos.add(produto);}
    public void removerProduto(solid.SRP.solution.Produto produto) {produtos.remove(produto);}

    /**public BigDecimal calcularTotal(){
        return produtos.stream()
                .map(Produto::getValor)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }*/
    public List<solid.SRP.solution.OrdemDeCompra>buscarOrdemDeCompra(){
        //retorna  a lista de ordens de compra da base de dados
        return new ArrayList<>();
    }
    public void salvarOrdemCompra(){
        //salvar lista de produtos na base de dados
    }
    public void enviarEmail(String email){
        //enviar email da ordem de compra
    }
    public void imprimirOrdemDeCompra(){
        //imprimir a ordem de compra
    }

}
