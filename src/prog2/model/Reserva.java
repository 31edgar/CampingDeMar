package prog2.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reserva {
    // Atributs
    Allotjament allotjament;
    Client client;
    LocalDate dataEntrada, dataSortida;

    // Constructor
    public Reserva(Allotjament allotjament, Client client, LocalDate dataEntrada, LocalDate dataSortida) {
        long estadaSolicitada = ChronoUnit.DAYS.between(dataEntrada, dataSortida);
        String temp;

        // FALTA COMPROVAR SI ES TEMPORADA BAIXA/ALTA I SI ES POT FER LA RESERVA

        this.allotjament = allotjament;
        this.client = client;
        this.dataEntrada = dataEntrada;
        this.dataSortida = dataSortida;
    }

    // Mètodes
    // ---- Getters
    public Allotjament getAllotjament() {
        return allotjament;
    }

    public Client getClient() {
        return client;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public LocalDate getDataSortida() {
        return dataSortida;
    }

    // ---- Setters
    public void setAllotjament(Allotjament allotjament) {
        this.allotjament = allotjament;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public void setDataSortida(LocalDate dataSortida) {
        this.dataSortida = dataSortida;
    }
}

