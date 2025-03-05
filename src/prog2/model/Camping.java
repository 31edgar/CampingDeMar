package prog2.model;
import prog2.vista.ExcepcioReserva;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class Camping implements InCamping {
    // Atributs
    private String nom_;
    private ArrayList<Allotjament> llistaAllotjaments = new ArrayList<>();
    private ArrayList<Client> llistaClients = new ArrayList<>();
    private LlistaReserves llistaReserves = new LlistaReserves(); // CAL IMPLEMENTAR LA CLASSE LlistaReserves

    // Constructor
    public Camping(String nom_) {
        this.nom_ = nom_;
    }

    // Mètodes
    // - Getters
    public String getNom() {
        return nom_;
    }

    public LlistaReserves getLlistaReserves() {
        return llistaReserves;
    }

    public ArrayList<Allotjament> getLlistaAllotjaments() {
        return llistaAllotjaments;
    }

    public ArrayList<Client> getLlistaClients() {
        return llistaClients;
    }

    public int getNumAllotjaments() {
        return llistaAllotjaments.size();
    }

    public int getNumReserves() {
        // CAL IMPLEMENTAR LA CLASSE LlistaReserves
        return 0;
    }

    public int getNumClients() {
        return llistaClients.size();
    }

    // Mètodes per afegir
    public void afegirClient(String nom_, String dni_) throws ExcepcioReserva {
        Client client = new Client(nom_, dni_);
        llistaClients.add(client);
    }

    public void afegirParcela(String nom_, String idAllotjament_, float metres, boolean connexioElectrica) {
        Parcela parcela = new Parcela(nom_, idAllotjament_, metres, connexioElectrica);
        llistaAllotjaments.add(parcela);
    }

    public void afegirBungalow(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, int placesParquing, boolean terrassa, boolean tv, boolean aireFred) {
        Bungalow bungalow = new Bungalow(nom_, idAllotjament_, mida, habitacions, placesPersones, placesParquing, terrassa, tv, aireFred);
        llistaAllotjaments.add(bungalow);
    }

    public void afegirBungalowPremium(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones,
                                      int placesParquing, boolean terrassa, boolean tv, boolean aireFred, boolean serveisExtra, String codiWifi) {
        BungalowPremium bungalowPremium = new BungalowPremium(nom_, idAllotjament_, mida, habitacions, placesPersones, placesParquing, terrassa, tv, aireFred, serveisExtra, codiWifi);
        llistaAllotjaments.add(bungalowPremium);
    }

    public void afegirGlamping(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones,
                               String material, boolean casaMascota) {
        Glamping glamping = new Glamping(nom_, idAllotjament_, mida, habitacions, placesPersones, material, casaMascota);
        llistaAllotjaments.add(glamping);
    }

    public void afegirMobilHome(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones,
                                boolean terrassaBarbacoa) {
        MobilHome mobilHome = new MobilHome(nom_, idAllotjament_, mida, habitacions, placesPersones, terrassaBarbacoa);
        llistaAllotjaments.add(mobilHome);
    }

    public void afegirReserva(String id_, String dni_, LocalDate dataEntrada, LocalDate dataSortida) throws ExcepcioReserva {
        // Busquem si el client existeix i si l'allotjament existeix
        Client client = buscarClient(dni_);
        Allotjament allotjament = buscarAllotjament(id_);
        llistaReserves.afegirReserva(allotjament, client, dataEntrada, dataSortida);
    }

    public float calculaMidaTotalParceles() {
        float midaTotal = 0;

        for (Allotjament allotjament : llistaAllotjaments) {
            if (allotjament instanceof Parcela) {
                Parcela parcela = (Parcela) allotjament; // Fem un cast al tipus parcela, per poder utilitzar el seu metode getMida()
                midaTotal += parcela.getMida();
            }
        }

        return midaTotal;
    }

    public int calculAllotjamentsOperatius() {
        int allotjamentsOperatius = 0;

        for (Allotjament allotjament : llistaAllotjaments) {

        }
    }

    public Allotjament getAllotjamentEstadaMesCurta() {
        // Falta implementar
    }

    public Client buscarClient(String dni_) throws ExcepcioReserva {
        for (Client client : llistaClients) {
            if (client.getDni().equals(dni_)) {
                return client;
            } else {
                throw new ExcepcioReserva("afegirReserva: buscarClient: dni " + dni_ + " no existeix a la llista de clients");
            }
        }
        return null;
    }

    public Allotjament buscarAllotjament(String id_) throws ExcepcioReserva{
        for (Allotjament allotjament : llistaAllotjaments) {
            if (allotjament.getId().equals(id_)) {
                return allotjament;
            } else {
                throw new ExcepcioReserva(("afegirReserva: buscarAllotjament: id " + id_ + " no existeix a la llista d'allotjaments"));
            }
        }
        return null;
    }



}
