import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        FabricaDesconto fabricaDesconto = new FabricaDesconto();

        String tipoCliente = JOptionPane
            .showInputDialog("Digite o tipo de cliente (Regular, VIP, Funcionario, Outro):");
        String consumoStr = JOptionPane.showInputDialog("Digite o valor do consumo:");
        double consumo = Double.parseDouble(consumoStr);


        DescontoStrategy desconto = fabricaDesconto.obterDesconto(tipoCliente);


        CalculadoraDescontos calculadora = new CalculadoraDescontos();
        double valorDesconto = calculadora.calcularDesconto(consumo, desconto);
        double valorAPagar = consumo - valorDesconto;


        String mensagem;
        if (valorDesconto > 0) {
            mensagem = String.format(
                    "Tipo de Cliente: %s\nValor da Compra: R$ %.2f\nValor do Desconto: R$ %.2f\nValor a Pagar: R$ %.2f",
                    tipoCliente, consumo, valorDesconto, valorAPagar);
        } else {
            mensagem = String.format(
                    "Tipo de Cliente: %s\nValor da Compra: R$ %.2f\nSem desconto disponível\nValor a Pagar: R$ %.2f",
                    tipoCliente, consumo, valorAPagar);
        }


        JOptionPane.showMessageDialog(null, mensagem, "Resumo da Compra", JOptionPane.INFORMATION_MESSAGE);
    }
}
