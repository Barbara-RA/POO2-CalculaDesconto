public class CalculadoraDescontos {
    public double calcularDesconto(double consumo, DescontoStrategy desconto) {
        return desconto.calcular(consumo);
    }
}
