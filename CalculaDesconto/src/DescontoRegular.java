public class DescontoRegular implements DescontoStrategy {
    public double calcular(double consumo) {
        if (consumo > 1000) {
            return consumo * 0.05;
        } else {
            return consumo * 0.02;
        }
    }
}