package org.example;
import Cadastro.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.println("Digite 'exit' para sair ou 'continue' para adicionar um aluno e um livro:");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Programa encerrado.");
                break;
            }

            System.out.println("Digite o nome do aluno:");
            String nomeAluno = scanner.nextLine();
            Aluno aluno = new Aluno(nomeAluno);

            System.out.println("Digite o título do livro:");
            String tituloLivro = scanner.nextLine();

            System.out.println("Digite o autor do livro:");
            String autorLivro = scanner.nextLine();
            Livro livro = new Livro(tituloLivro, autorLivro);

            System.out.println("Digite o curso do aluno:");
            String cursoAluno = scanner.nextLine();
            aluno.inscreverCurso(cursoAluno);

            Biblioteca biblioteca = new Biblioteca();
            biblioteca.adicionarLivro(livro);

            System.out.println("Aluno: " + aluno.getNome() + ", ID: " + aluno.getID() + ", Curso: " + aluno.getCursos());
            System.out.println("Livro: " + livro.getTitulo() + ", Autor: " + livro.getAutor());
        }
    }
}