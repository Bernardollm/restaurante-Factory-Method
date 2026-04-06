package main.java.padroescriacao.factorymethod;

public class Reserva implements IServicoRestaurante {

    public String executar() {
        return "Reserva realizada";
    }

    public String cancelar() {
        return "Reserva cancelada";
    }
}