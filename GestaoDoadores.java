import java.util.ArrayList;
import java.util.List;

public class GestaoDoadores {
    private List<Doador> doadores = new ArrayList<>();

    public void cadastrarDoador(Doador doador) {
        doadores.add(doador);
    }

    public List<Doador> listarDoadores() {
        return doadores;
    }
}



