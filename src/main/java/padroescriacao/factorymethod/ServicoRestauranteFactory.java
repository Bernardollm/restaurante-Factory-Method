package main.java.padroescriacao.factorymethod;

public class ServicoRestauranteFactory {

    public static IServicoRestaurante obterServico(String servico) {

        if (servico == null) {
            throw new IllegalArgumentException("Serviço inexistente");
        }

        if (servico.equalsIgnoreCase("Pedido")) {
            return new Pedido();
        }

        if (servico.equalsIgnoreCase("Reserva")) {
            return new Reserva();
        }

        if (servico.equalsIgnoreCase("Entrega")) {
            return new Entrega();
        }

        throw new IllegalArgumentException("Serviço inválido");
    }
}