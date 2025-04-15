public class Main {
    public static void main(String[] args) {

      Empregado[] empregado = new Empregado[3];
      empregado[0] = new EmpregadoComissionado("felipe",1,1000,20);
      empregado[1] = new EmpregadoHorista("carol",2,10,2);
      empregado[2] = new EmpregadoComissionado("Luna",3,200,10);

for (Empregado e:empregado){
    System.out.println(e.calcularSalario());
    System.out.println(e.getDados());
}//for



    }//main
}//class
