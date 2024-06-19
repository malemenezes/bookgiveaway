public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private String dataPublicacao;

    public Livro(String titulo, String autor, String isbn, String dataPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.dataPublicacao = dataPublicacao;
    }


    public Livro(String titulo2, String autor2, int quantidade) {
	}

	public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }


	public int getQuantidade() {
		return 0;
	}


	public void setQuantidade(int i) {
	}
}
