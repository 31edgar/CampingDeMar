package prog2.model;
import prog2.vista.ExcepcioReserva;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class LlistaReserves implements InLlistaReserves {

    //Atribut llistaReserves
    private ArrayList<Reserva> reserves;

    public LlistaReserves() {
        this.reserves = new ArrayList<>();
    }

    public void afegirReserva(Allotjament allotjament, Client client, LocalDate dataEntrada, LocalDate dataSortida) throws ExcepcioReserva {
        //Comprovacions
        if(allotjamentDisponible(allotjament,client,dataEntrada,dataSortida) && isEstadaMinima(allotjament,client,dataEntrada,dataSortida)){
        //Crea i afageix reserva a la llista
        Reserva novaReserva = new Reserva(allotjament,client,dataEntrada,dataSortida);
        reserves.add(novaReserva);}
    }

    public int getNumReserves() {
        return reserves.size();
    }

    boolean allotjamentDisponible (Allotjament allotjament, Client client, LocalDate dataEntrada, LocalDate dataSortida) throws ExcepcioReserva{
        for (int n=0; n<getNumReserves(); n++) {
            Reserva reserva = reserves.get(n);

            // Comprova si tipus d'allotjament és el mateix
            if (reserva.getAllotjament().equals(allotjament)) {
                // Comprovació de solapament de dates (data sortida és després d'una data d'entrada o una data d'entrada és abans d'una data de sortida)
                if (dataSortida.isAfter(reserva.getDataEntrada()) || dataEntrada.isBefore(reserva.getDataSortida())) {
                    throw new ExcepcioReserva("L’allotjament amb identificador "+ reserva.getAllotjament().getId() + " no està disponible en la data demanada " + dataEntrada +
                            " pel client "+ client +" amb DNI: "+ client.getDni()+".");
                }
            }
        }


        return true;
    }

    boolean isEstadaMinima (Allotjament allotjament, Client client, LocalDate dataEntrada, LocalDate dataSortida) throws ExcepcioReserva {
        //Definició teporades
        LocalDate _20marc = LocalDate.of(2025, 3, 20);
        LocalDate _21setembre = LocalDate.of(2025, 9, 21);
        InAllotjament.Temp temp = (dataEntrada.isAfter(_20marc) && dataEntrada.isBefore(_21setembre)) ? InAllotjament.Temp.ALTA : InAllotjament.Temp.BAIXA;

        if (ChronoUnit.DAYS.between(dataEntrada, dataSortida) < allotjament.getEstadaMinima(temp)) {
            throw new ExcepcioReserva("no compleixen l'estada mínima");
        }
        return true;
    }

}



