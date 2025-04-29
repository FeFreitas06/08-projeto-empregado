import java.text.DecimalFormat;

public class Controle {

    private Empregado[] empregado = new Empregado[5];
private int index = 0;

    public void inserir(Empregado  empregado){
this.empregado[index] = empregado;
index++;
    }//inserir

public Empregado pesquisar(long matricula){
        for (int i=0;i<index;i++){
if (empregado[i].matricula == matricula){
    return empregado[i];
}//if
        }//for
return null;
}//pesquisar


    public String Listar(){
        DecimalFormat df = new DecimalFormat("#,##0.00");
        String aux ="";
        for (int i=0; i<index; i++){
            aux += empregado[i].getDados();
aux+= "Salário R$ "+df.format(empregado[i].calcularSalario())+ "\n";
aux+="---------------------------------------\n";

        }//for


        return aux;
    }//Listar




}//class
