package test.java.padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import main.java.padroescriacao.factorymethod.IServicoRestaurante;
import main.java.padroescriacao.factorymethod.ServicoRestauranteFactory;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void deveExecutarPedido() {
        IServicoRestaurante servico = ServicoRestauranteFactory.obterServico("Pedido");
        assertEquals("Pedido realizado", servico.executar());
    }

    @Test
    void deveCancelarPedido() {
        IServicoRestaurante servico = ServicoRestauranteFactory.obterServico("Pedido");
        assertEquals("Pedido cancelado", servico.cancelar());
    }
}