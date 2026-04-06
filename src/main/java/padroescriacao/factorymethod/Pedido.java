package main.java.padroescriacao.factorymethod;

public class Pedido implements IServicoRestaurante {

    public String executar() {
        return "Pedido realizado";
    }

    public String cancelar() {
        return "Pedido cancelado";
    }
}