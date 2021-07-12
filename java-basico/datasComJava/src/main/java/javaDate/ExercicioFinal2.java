package javaDate;
import java.util.Calendar;

public class ExercicioFinal2 {
    public static void main(String[] args) {
        Fatura fatura;
        Calendar dataVencimento;
        Calendar dataPagamento;
        Calendar dataPagamentoLimite;
        double valor;
        int dia, mes, ano;

        dia = 30; mes = 5; ano=2021;
        valor = 100;
        dataPagamento = Calendar.getInstance();
        dataVencimento = Calendar.getInstance();
        dataPagamentoLimite = Calendar.getInstance();

        dataVencimento.set(Calendar.YEAR,ano);
        dataVencimento.set(Calendar.MONTH, mes);
        dataVencimento.set(Calendar.DAY_OF_MONTH, dia);


        dataPagamentoLimite.set(Calendar.YEAR,dataVencimento.get(Calendar.YEAR));
        dataPagamentoLimite.set(Calendar.MONTH,dataVencimento.get(Calendar.MONTH));
        dataPagamentoLimite.set(Calendar.DATE,dataVencimento.get(Calendar.DATE));
        dataPagamentoLimite.add(Calendar.DATE, 10);




        fatura = new Fatura(dataVencimento, dataPagamento, valor);

        if(dataPagamento.after(dataPagamentoLimite)){
            System.out.println("pagamento dez dias depois nao e possivel");
            System.out.print(dataPagamento.get(Calendar.DAY_OF_MONTH)+"/");
            System.out.print(dataPagamento.get(Calendar.MONTH)+1+"/");
            System.out.print(dataPagamento.get(Calendar.YEAR));
            System.out.println("");
            System.out.println("Vencimento em");
            System.out.print(dataVencimento.get(Calendar.DAY_OF_MONTH)+"/");
            System.out.print(dataVencimento.get(Calendar.MONTH)+1+"/");
            System.out.print(dataVencimento.get(Calendar.YEAR));

            System.out.println("\nData limite max para pagamento em");
            System.out.print(dataPagamentoLimite.get(Calendar.DAY_OF_MONTH)+"/");
            System.out.print(dataPagamentoLimite.get(Calendar.MONTH)+1+"/");
            System.out.print(dataPagamentoLimite.get(Calendar.YEAR));
        }else{
            fatura.setStatus(true);
            System.out.println("Fatura Paga "+fatura.isStatus());
            System.out.print(dataPagamento.get(Calendar.DAY_OF_MONTH)+"/");
            System.out.print(dataPagamento.get(Calendar.MONTH)+1+"/");
            System.out.print(dataPagamento.get(Calendar.YEAR));
            System.out.println("");
            System.out.println("Vencimento em");
            System.out.print(dataVencimento.get(Calendar.DAY_OF_MONTH)+"/");
            System.out.print(dataVencimento.get(Calendar.MONTH)+1+"/");
            System.out.print(dataVencimento.get(Calendar.YEAR));
            System.out.println("\nData limite max para pagamento em");
            System.out.print(dataPagamentoLimite.get(Calendar.DAY_OF_MONTH)+"/");
            System.out.print(dataPagamentoLimite.get(Calendar.MONTH)+1+"/");
            System.out.print(dataPagamentoLimite.get(Calendar.YEAR));


        }


    }

}
class Fatura{
    double valor;
    Calendar dtVencimento;
    Calendar dtPagamento;
    Calendar dtPagamentoLimite;
    boolean status;

    Fatura(Calendar dtVencimento, Calendar dtPagamento, double valor){
        this.dtVencimento = dtVencimento;
        this.dtPagamento=dtPagamento;
        setDtPagamentoLimite(this.dtVencimento);
        this.valor = valor;
    }
    public double getValor(){
        return this.valor;
    }
    public Calendar getDataVencimento(){
        return this.dtVencimento;
    }
    public Calendar getDataPagamentoLimite(){
        return this.dtPagamentoLimite;
    }
    public Calendar getDataPagamento(){
        return this.dtPagamento;
    }

    public boolean isStatus() {
        return status;
    }

    public void setDtPagamento(Calendar dtPagamento) {
        this.dtPagamento = dtPagamento;
    }

    public void setDtPagamentoLimite(Calendar dt) {

    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
