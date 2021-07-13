package solid.SRP.solution;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

//single responsibility principle
public class OrdemDeCompra {
    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProdutos(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    /**public BigDecimal calcularTotal() {
        return produtos.stream()
                .map(Produto::getValor)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }*/

}
class OrdemDeCompraRepository {
    public List<OrdemDeCompra> buscarOrdemDeCompra() {
        //retorna  a lista de ordens de compra da base de dados
        return new ArrayList<>();
    }

    public void salvarOrdemCompra() {
        //salvar lista de produtos na base de dados
    }

}
class OrdemDeCompraEmail {
    public void enviarEmail(String email) {
        //enviar email da ordem de compra
    }

}
class OrdemDeCompraPrint{
    public void imprimirOrdemDeCompra(){
        //imprimir a ordem de compra
    }

}
