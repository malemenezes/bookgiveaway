import java.util.ArrayList;
import java.util.List;

public class Beneficiario {

    private String nome;
    private List<Livro> livrosRecebidos = new ArrayList<>();

    public Beneficiario(String nome) {
        this.nome = nome;
    }

    public void receberLivro(Livro livro, int quantidade) {
        for (Livro l : livrosRecebidos) {
            if (l.getTitulo().equals(livro.getTitulo())) {
                l.setQuantidade(((Livro) l).getQuantidade() + quantidade);
                return;
            }
        }
        livrosRecebidos.add(new Livro(livro.getTitulo(), livro.getAutor(), quantidade));
    }

    public List<Livro> getLivrosRecebidos() {
        return livrosRecebidos;
    }

    @Override
    public String toString() {
        return "Beneficiario{" +
                "nome='" + nome + '\'' +
                ", livrosRecebidos=" + livrosRecebidos +
                '}';
    }
}
