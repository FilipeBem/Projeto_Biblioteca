package Cadastro;
import java.util.List;
import java.util.ArrayList;

public class Biblioteca {
    private List<Livro> acervo;
    private List<Aluno> alunos;

    // Construtor
    public Biblioteca() {
        this.acervo = new ArrayList<>();
        this.alunos = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        acervo.add(livro);
    }

    public void removerLivro(Livro livro) {
        acervo.remove(livro);
    }

}
