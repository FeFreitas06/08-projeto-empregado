import java.text.DecimalFormat;

public class EmpregadoHorista extends Empregado{
    int totalDeHorasTrabalhadas;
    double valorDaHoraTrabalhada;


    public String getDados() {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        String aux = super.getDados();
        aux += "Total de horas trabalhadas: "+df.format(totalDeHorasTrabalhadas) +"\n";
        aux += "Valor da hora trabalhada: "+df.format(valorDaHoraTrabalhada)+"%\n";
        return aux;
    }
    public double calcularSalario() {

        return  totalDeHorasTrabalhadas * valorDaHoraTrabalhada;
    }

//construtor


    public EmpregadoHorista(String nome, long matricula, int totalDeHorasTrabalhadas, double valorDaHoraTrabalhada) {
        super(nome, matricula);
        this.totalDeHorasTrabalhadas = totalDeHorasTrabalhadas;
        this.valorDaHoraTrabalhada = valorDaHoraTrabalhada;
    }
}//class
