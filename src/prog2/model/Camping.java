package prog2.model;
import prog2.vista.ExcepcioReserva;

import java.time.LocalDate;
import java.util.ArrayList;

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
        // Falta implementar
    }

    public float calculaMidaTotalParceles() {
        // Falta implementar
    }

    public int calculAllotjamentsOperatius() {
        // Falta implementar
    }

    public Allotjament getAllotjamentEstadaMesCurta() {
        // Falta implementar
    }



}
