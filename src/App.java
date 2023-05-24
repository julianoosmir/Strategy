import java.math.BigDecimal;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Orcamento orcamento = new Orcamento(new BigDecimal(100));
        CalculadoraDeImposto calculadoraDeImposto = new CalculadoraDeImposto();
        BigDecimal icms = calculadoraDeImposto.calcularImposto(orcamento, new Icms());
        BigDecimal iss = calculadoraDeImposto.calcularImposto(orcamento, new Iss());

        System.out.println("icms : " + icms.intValue() + " e iss : " + iss.intValue());
    }
}
