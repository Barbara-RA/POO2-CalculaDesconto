public class DescontoVIP implements DescontoStrategy {
    @Override
    public double calcular(double consumo) {
        if (consumo > 1000) {
            return consumo * 0.10;
        } else {
            return consumo * 0.05;
        }
    }
}