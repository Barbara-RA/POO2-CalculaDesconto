public class DescontoFuncionario implements DescontoStrategy {
    
    public double calcular(double consumo) {
        return consumo * 0.30;
    }
}