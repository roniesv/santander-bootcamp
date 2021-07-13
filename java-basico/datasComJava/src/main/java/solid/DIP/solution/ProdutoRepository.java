package solid.DIP.solution;

import java.util.ArrayList;
import java.util.List;

public class ProdutoRepository {

    private DbConnection dbConnection;
    public ProdutoRepository(DbConnection dbConnection){
        this.dbConnection = dbConnection;
    }
    public List<Produto> buscarProdutos(){
        //retorna a lista de produtos da base de dados;
        return new ArrayList<>();
    }
    public void salvarProdutos(Produto produto){
        //salva lista de produtos na base de dados;
    }
}
