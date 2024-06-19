import java.util.ArrayList;
import java.util.List;

public class GestaoDoacoes {
    private List<Doacao> doacoes = new ArrayList<>();

    public void registrarDoacao(Doacao doacao) {
        doacoes.add(doacao);
    }

    public List<Doacao> listarDoacoes() {
        return doacoes;
    }
}
