import java.util.ArrayList;
import java.util.List;

public class GestaoBeneficiarios {
    private List<Beneficiario> beneficiarios = new ArrayList<>();

    public void cadastrarBeneficiario(Beneficiario beneficiario) {
        beneficiarios.add(beneficiario);
    }

    public List<Beneficiario> listarBeneficiarios() {
        return beneficiarios;
    }
}
