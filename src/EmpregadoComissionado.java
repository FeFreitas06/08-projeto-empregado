import java.text.DecimalFormat;

public class EmpregadoComissionado extends Empregado{



    double totalDeVendas;
    double comissao;

    @Override
    public String getDados() {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        String aux = super.getDados();
        aux += "Total de vendas: "+df.format(totalDeVendas) +"\n";
        aux += "Comissão: "+df.format(comissao)+"%\n";
        return aux;
    }

    public double calcularSalario(){


        return  totalDeVendas * comissao/100;
    }

    //construtor

    public EmpregadoComissionado(String nome, long matricula, double totalDeVendas, double comissao) {
        super(nome, matricula);
        this.totalDeVendas = totalDeVendas;
        this.comissao = comissao;
    }
}//class
