package test.java.padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import main.java.padroescriacao.factorymethod.IServicoRestaurante;
import main.java.padroescriacao.factorymethod.ServicoRestauranteFactory;

import static org.junit.jupiter.api.Assertions.*;

class EntregaTest {

    @Test
    void deveExecutarEntrega() {
        IServicoRestaurante servico = ServicoRestauranteFactory.obterServico("Entrega");
        assertEquals("Entrega realizada", servico.executar());
    }

    @Test
    void deveCancelarEntrega() {
        IServicoRestaurante servico = ServicoRestauranteFactory.obterServico("Entrega");
        assertEquals("Entrega cancelada", servico.cancelar());
    }
}