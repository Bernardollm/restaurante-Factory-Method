package test.java.padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import main.java.padroescriacao.factorymethod.IServicoRestaurante;
import main.java.padroescriacao.factorymethod.ServicoRestauranteFactory;

import static org.junit.jupiter.api.Assertions.*;

class ReservaTest {

    @Test
    void deveExecutarReserva() {
        IServicoRestaurante servico = ServicoRestauranteFactory.obterServico("Reserva");
        assertEquals("Reserva realizada", servico.executar());
    }

    @Test
    void deveCancelarReserva() {
        IServicoRestaurante servico = ServicoRestauranteFactory.obterServico("Reserva");
        assertEquals("Reserva cancelada", servico.cancelar());
    }
}