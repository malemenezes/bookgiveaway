import java.time.LocalDate;

public class Lib {

    private String nome;
    private String conteudo;
    private LocalDate dataCriacao;
    private LocalDate dataModificacao;
    private long tamanho;

    public Lib(String nome) {
        this.nome = nome;
        this.dataCriacao = LocalDate.now();
        this.dataModificacao = dataCriacao;
    }

    public Lib(String nome, String conteudo) {
        this(nome);
        this.conteudo = conteudo;
        this.tamanho = conteudo.length(); 
    }
    
    

    private void salvar() {
        
    }

    private void carregar() {
            
        }
    }
