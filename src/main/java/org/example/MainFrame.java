package org.example;
import Cadastro.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JTextField nomeAlunoField;
    private JTextField tituloLivroField;
    private JTextField autorLivroField;
    private JTextField cursoAlunoField;

    public MainFrame() {
        setTitle("Cadastro Aluno e Livro");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel nomeAlunoLabel = new JLabel("Nome do Aluno:");
        nomeAlunoLabel.setBounds(20, 20, 120, 20);
        add(nomeAlunoLabel);

        nomeAlunoField = new JTextField();
        nomeAlunoField.setBounds(150, 20, 200, 20);
        add(nomeAlunoField);

        JLabel tituloLivroLabel = new JLabel("Título do Livro:");
        tituloLivroLabel.setBounds(20, 50, 120, 20);
        add(tituloLivroLabel);

        tituloLivroField = new JTextField();
        tituloLivroField.setBounds(150, 50, 200, 20);
        add(tituloLivroField);

        JLabel autorLivroLabel = new JLabel("Autor do Livro:");
        autorLivroLabel.setBounds(20, 80, 120, 20);
        add(autorLivroLabel);

        autorLivroField = new JTextField();
        autorLivroField.setBounds(150, 80, 200, 20);
        add(autorLivroField);

        JLabel cursoAlunoLabel = new JLabel("Curso do Aluno:");
        cursoAlunoLabel.setBounds(20, 110, 120, 20);
        add(cursoAlunoLabel);

        cursoAlunoField = new JTextField();
        cursoAlunoField.setBounds(150, 110, 200, 20);
        add(cursoAlunoField);

        JButton cadastrarButton = new JButton("Cadastrar");
        cadastrarButton.setBounds(150, 140, 100, 30);

        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nomeAluno = nomeAlunoField.getText();
                String tituloLivro = tituloLivroField.getText();
                String autorLivro = autorLivroField.getText();
                String cursoAluno = cursoAlunoField.getText();

                Aluno aluno = new Aluno(nomeAluno);
                aluno.inscreverCurso(cursoAluno);

                Livro livro = new Livro(tituloLivro, autorLivro);

                Biblioteca biblioteca = new Biblioteca();
                biblioteca.adicionarLivro(livro);

                JOptionPane.showMessageDialog(null,
                        "Aluno: " + aluno.getNome() + ", ID: " + aluno.getID() + ", Curso: " + aluno.getCursos()
                                + "\n" + "Livro: " + livro.getTitulo() + ", Autor: " + livro.getAutor(),
                        "Cadastro Realizado", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        add(cadastrarButton);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainFrame();
        });
    }
}