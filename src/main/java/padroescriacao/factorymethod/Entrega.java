package main.java.padroescriacao.factorymethod;

public class Entrega implements IServicoRestaurante {

    public String executar() {
        return "Entrega realizada";
    }

    public String cancelar() {
        return "Entrega cancelada";
    }
}