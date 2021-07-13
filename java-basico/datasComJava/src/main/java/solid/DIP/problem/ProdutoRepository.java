package solid.DIP.problem;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;

public class ProdutoRepository {

    //dependencia da classe MySqlConnection..
    //mudou o banco tem que criar novamente e mudar...nao e legal
    private MySqlConnection mySqlConnection;
    public ProdutoRepository(){
        this.mySqlConnection = new MySqlConnection();
    }
    public List<Produto> buscarProdutos(){
        //retorna a lista de produtos da base de dados;
        return new ArrayList<>();
    }
    public void salvarProdutos(Produto produto){
        //salva lista de produtos na base de dados;
    }

    private class MySqlConnection {
    }
}
