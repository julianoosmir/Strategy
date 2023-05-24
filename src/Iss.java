import java.math.BigDecimal;

public class Iss implements Imposto {
    public BigDecimal calcularImposto(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.6"));
    }
}
