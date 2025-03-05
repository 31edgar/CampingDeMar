package prog2.model;
import prog2.vista.ExcepcioReserva;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reserva {
    // Atributs
    private Allotjament allotjament;
    private Client client;
    private LocalDate dataEntrada, dataSortida;

    // Constructor
    public Reserva(Allotjament allotjament, Client client, LocalDate dataEntrada, LocalDate dataSortida) throws ExcepcioReserva{
        //Definició teporades
        LocalDate _20marc = LocalDate.of(2025, 3, 20);
        LocalDate _21setembre = LocalDate.of(2025, 9, 21);
        InAllotjament.Temp temp = (dataEntrada.isAfter(_20marc) && dataEntrada.isBefore(_21setembre)) ? InAllotjament.Temp.ALTA : InAllotjament.Temp.BAIXA;

        if (ChronoUnit.DAYS.between(dataEntrada, dataSortida) < allotjament.getEstadaMinima(temp)) {
            throw new ExcepcioReserva("Estada mínima no complida");
        }

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

