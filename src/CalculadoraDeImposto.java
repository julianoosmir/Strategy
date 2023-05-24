import java.math.BigDecimal;

public class CalculadoraDeImposto {
    public BigDecimal calcularImposto(Orcamento orcamento, Imposto imposto){
        return imposto.calcularImposto(orcamento);
    }
}
