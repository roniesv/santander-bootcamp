package digital.innovation.one.uteis;

import digital.innovation.one.uteis.internal.DivHelper;
import digital.innovation.one.uteis.internal.MultHelper;
import digital.innovation.one.uteis.internal.SubHelper;
import digital.innovation.one.uteis.internal.SumHelper;

public class Calculadora {
    private SubHelper subHelper;
    private SumHelper sumHelper;
    private DivHelper diviHelper;
    private MultHelper multiHelper;


    public Calculadora(){
        diviHelper = new DivHelper();
        multiHelper = new MultHelper();
        subHelper = new SubHelper();
        sumHelper = new SumHelper();


    }
    public int sum(int a, int b){
        return sumHelper.execute(a,b);
    }
    public int sub(int a, int b){
        return subHelper.execute(a,b);
    }
    public int multi(int a, int b){
        return multiHelper.execute(a,b);
    }
    public int div  (int a, int b){
        return diviHelper.execute(a,b);
    }
}
