package prog2.model;

import prog2.vista.ExcepcioReserva;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reserva {
    // Atributs
    Allotjament allotjament;
    Client client;
    LocalDate dataEntrada, dataSortida;

    // Constructor
    public Reserva(Allotjament allotjament, Client client, LocalDate dataEntrada, LocalDate dataSortida) throws ExcepcioReserva {
        long estadaSolicitada = ChronoUnit.DAYS.between(dataEntrada, dataSortida);
        LocalDate _20marc = LocalDate.of(2025, 3, 20);
        LocalDate _21setembre = LocalDate.of(2025, 9, 21);

        // Mirem si és temporada alta o baixa
        InAllotjament.Temp temp = (dataEntrada.isAfter(_20marc) && dataEntrada.isBefore(_21setembre)) ? InAllotjament.Temp.ALTA : InAllotjament.Temp.BAIXA;

        // Comprovem si es pot fer la reserva
        if (estadaSolicitada < allotjament.getEstadaMinima(temp)) {
            throw new ExcepcioReserva("L'estada solicitada es menor que l'estada mínima");
        } // Si no es pot fer, llançarà una excepció i la reserva no serà creada

        // Altrament, es crearà la reserva
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

