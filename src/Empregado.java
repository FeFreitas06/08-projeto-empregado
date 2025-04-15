//SUPERCLASSE
public abstract class Empregado {
    long matricula;
    String nome;


public String getDados(){
String aux ="";
aux+= "Matricula: "+matricula +"\n";
aux+= "Nome: "+nome +"\n";
    return aux;
}//getdados




    public abstract double calcularSalario();


//Construto


    public Empregado(String nome, long matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }
}//class
