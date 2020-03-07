package Main;

import java.util.Scanner;

import Main.Recursos.Aluno;
import Main.Recursos.Lista;

public class App 
{
    public static void main( String[] args )
    {
        Lista lista = new Lista();
        Scanner input = new Scanner(System.in);
        String nome;
        int sair = 0;
        while (sair == 0) {
            System.out.println("Digite um nome: ");
            lista.adicionarAluno(nome = input.next());
            System.out.println(lista.toString());
            System.out.println("\n\nDeseja sair? (S = 1/N = 0)");
            sair = input.nextInt();
        }
    }
}
