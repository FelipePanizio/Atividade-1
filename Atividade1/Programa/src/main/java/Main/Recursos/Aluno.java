package Main.Recursos;

public class Aluno {
    private int id;
    private String nome;

    public Aluno(){}

    public Aluno(int id, String nome){
        this.id = id;
        this.nome = nome;
    }

    public int getId(){
        return this.id;
    }
    public String getNome(){
        return this.nome;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    
    public String toString(){
        String retorno = "Id: "+ this.id + " Nome: " + this.nome;
        return  retorno;
    }
}