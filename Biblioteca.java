import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Livro> acervo;
    private List<Usuario> listaDeUsuarios;

    public Biblioteca() {
        this.acervo = new ArrayList<>();
        this.listaDeUsuarios = new ArrayList<>();
    }

    public Livro pesquisarLivroPorTitulo(String titulo) {
        for(Livro livro : this.acervo) {
            if(livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }

    public void cadastrarLivro(Livro livro) {
        this.acervo.add(livro);
        System.out.println("O livro " + livro.getTitulo() + " foi cadastrado.");
    }

    public void cadastrarUsuario(Usuario usuario) {
        this.listaDeUsuarios.add(usuario);
        System.out.println("O usuário " + usuario.getNome() + " foi cadastrado.");
    }

    public static void main(String[] args) {
        Livro livroJava = new Livro("Java Como Programar", "Deitel", 2014);
        Usuario meuUsuario = new Usuario("Thiago", "123");
        Biblioteca minhaBiblioteca = new Biblioteca();
        minhaBiblioteca.cadastrarLivro(livroJava);
        minhaBiblioteca.cadastrarUsuario(meuUsuario);
        Livro livroEncontrado = minhaBiblioteca.pesquisarLivroPorTitulo("java");
        System.out.println(livroEncontrado);
    }
}
