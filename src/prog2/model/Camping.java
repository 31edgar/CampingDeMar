package prog2.model;
import prog2.model.InCamping;
import java.util.ArrayList;

public class Camping implements InCamping {
    // Atributs
    String nom;
    ArrayList<Allotjament> llistaAllotjaments = new ArrayList<>();
    ArrayList<Client> llistaClients = new ArrayList<>();
    LlistaReserves llistaReserves = new LlistaReserves(); // CAL IMPLEMENTAR LA CLASSE LlistaReserves

    // Mètodes
    // - Getters
    public String getNom() {
        return nom;
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

}
