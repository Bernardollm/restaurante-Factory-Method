package test.java.padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import main.java.padroescriacao.factorymethod.ServicoRestauranteFactory;

import static org.junit.jupiter.api.Assertions.*;

class ServicoRestauranteFactoryTest {

    @Test
    void deveRetornarExcecaoParaServicoInexistente() {
        try {
        ServicoRestauranteFactory.obterServico(null);            
        fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Serviço inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaServicoInvalido() {
        try {
        ServicoRestauranteFactory.obterServico("Teste");            
        fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Serviço inválido", e.getMessage());
        }
    }
}