package Main.Recursos;

public class Lista{
    private Aluno[] aluno;
    private int i=0;

    public Lista(){}

    /*public void adicionarAluno(String nome){
        System.out.println("test");
        alunos[i].setNome(nome);
        System.out.println("test");
        alunos[i].setId(this.i++);
        this.i++;
    }*/

    public Aluno adicionarAluno(String nome){
        Aluno alunos = new Aluno(i++,nome);
        i++;
        return alunos;
    }

    @Override
    public String toString(){
        String retorno="";
        int j=0;
        while(j<=this.i){
            retorno = retorno + aluno[j].toString()+"\n";
            j++;
        }
        
        return retorno;
    }
}