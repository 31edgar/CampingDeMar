package prog2.model;
import prog2.model.InAllotjament;

public class Allotjament implements InAllotjament {
    // Atributs classe Allotjament
    private String nom_;
    private String idAllotjament_;
    private long estadaMinimaALTA_;
    private long estadaMinimaBAIXA_;

    //Constructor vuit
    public Allotjament(){
    }

    //Constructor comú
    public Allotjament(String nom_, String idAllotjament_, long estadaMinimaALTA_, long estadaMinimaBAIXA_){
    }

    public String getNom() {
        return nom_;
    }

    public void setNom(String nom) {
        this.nom_ = nom;
    }

    public String getId() {
        return idAllotjament_;
    }

    public void setId(String id) {
        this.idAllotjament_ = id;
    }

    public long getEstadaMinima(Temp temp) {
        if (temp == Temp.valueOf("ALTA")){
            return estadaMinimaALTA_;
        }
        if (temp == Temp.valueOf("BAIXA")){
            return estadaMinimaBAIXA_;
        }
        return 0;
    }

    public void setEstadaMinima(long estadaMinimaALTA_, long estadaMinimaBAIXA_) {
        this.estadaMinimaALTA_ = estadaMinimaALTA_;
        this.estadaMinimaBAIXA_ = estadaMinimaBAIXA_;
    }

    public boolean correcteFuncionament() {
        return false;
    }
}
