package Cadastro;
import java.util.List;
import java.util.ArrayList;

public class Aluno {
    private String nome;
    private int id;
    private List<String> cursos;

    // Construtor
    public Aluno(String nome) {
        this.nome = nome;
        this.id = gerarIDUnico();
        this.cursos = new ArrayList<>();
    }

    private static int contadorID = 1;

    private int gerarIDUnico() {
        return contadorID++;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getID(){
        return id;
    }

    public void setID(int id){
        this.id = id;
    }

    public List<String> getCursos(){
        return cursos;
    }

    public void  setCursos(List<String> cursos){
        this.cursos = cursos;
    }

    public void inscreverCurso(String curso) {
        cursos.add(curso);
    }

    public void desincreverCurso(String curso){cursos.remove(curso);}


}
