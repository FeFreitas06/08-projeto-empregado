import static java.lang.Long.parseLong;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;



public class Util {
   private Controle controle= new Controle();

    public void menu(){
int opcao;
String aux = "1- Cadastrar\n2- Pesquisar\n3- Listar\n4- Finalizar";

while (true){
    opcao = parseInt(showInputDialog(aux));
    if (opcao == 4){
        return;
    }
    switch (opcao){
        case 1:
            inserir();
            break;
        case 2:
            pesquisar();
            break;
        case 3:
            listar();
            break;
        default:
            showMessageDialog(null, "Opção inválida");
    }
}//while


    }//menu


    public void inserir(){
    String nome;
    long matricula;
double totalDeVendas, comissao;
int totalDeHoras;
double valorDaHora;
String menu = "1 - Empregado Comissionado\n 2 - Empregado Horista\n 3 - Sair";
    int opcao;
    while(true){
        opcao = parseInt(showInputDialog(menu));
        if (opcao == 3){
            return;
        }
        if (opcao ==1 || opcao == 2){
            nome = showInputDialog("Nome do empregado:");
            matricula = parseLong(showInputDialog("Digite a matricula do empregado:"));
            if (opcao == 1){
                totalDeVendas = parseDouble(showInputDialog("Total de vendas:"));
                        comissao = parseDouble(showInputDialog("Comissao de Vendas:"));
                        controle.inserir(new EmpregadoComissionado(nome, matricula, totalDeVendas, comissao));

            }
            else {
                totalDeHoras = parseInt(showInputDialog("Total de Horas Trabalhadas: "));
                valorDaHora = parseDouble(showInputDialog("Valor da hora Trabalhada: "));
                controle.inserir(new EmpregadoHorista(nome, matricula, totalDeHoras,valorDaHora));
            }//else

        }//if 1
    }//while


    }//inserir


    public void pesquisar(){
        long matricula = parseLong(showInputDialog("Matricula para pesquisa"));
        Empregado empregado = controle.pesquisar(matricula);
        if (empregado ==null){
            showMessageDialog(null, "Empregado com matricula "+matricula+" não encontrado");
        }
        else {
            showMessageDialog(null, empregado.getDados());
        }//else
    }//pesquisar


    public void listar(){
      String lista = controle.Listar();
      showMessageDialog(null, lista);
      //outra forma de fazer --> showMessageDialog(null, controle.Listar());

    }//listar

}//class
