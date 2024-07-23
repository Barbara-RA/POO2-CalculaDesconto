public class FabricaDesconto {
    public DescontoStrategy obterDesconto(String tipoCliente) {
        switch (tipoCliente) {
            case "Regular":
                return new DescontoRegular();
            case "VIP":
                return new DescontoVIP();
            case "Funcionario":
                return new DescontoFuncionario();
            default:
                return new SemDesconto();
        }
    }
}
