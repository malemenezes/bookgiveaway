public class Doacao {
    private Doador doador;
    private Livro livro;
    private String dataDoacao;


    public Doacao(Doador doador, Livro livro, String dataDoacao) {
        this.doador = doador;
        this.livro = livro;
        this.dataDoacao = dataDoacao;
    }


    public Doador getDoador() {
        return doador;
    }

    public void setDoador(Doador doador) {
        this.doador = doador;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public String getDataDoacao() {
        return dataDoacao;
    }

    public void setDataDoacao(String dataDoacao) {
        this.dataDoacao = dataDoacao;
    }
}
