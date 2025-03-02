package prog2.model;

public class Glamping extends Allotjament {
    //Atributs Glamping
    String mida;
    int habitacions;
    int placesPersones;
    int placesParquing;
    boolean terrassa;
    boolean tv;
    boolean aireFred;
    String material;
    boolean casaMascota;

    //Constructor
    public Glamping(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, int placesParquing, boolean terrassa, boolean tv, boolean aireFred,
                    String material, boolean casaMascota) {
        super(nom_, idAllotjament_);
        this.mida = mida;
        this.habitacions = habitacions;
        this.placesPersones = placesPersones;
        this.placesParquing = placesParquing;
        this.terrassa = terrassa;
        this.tv = tv;
        this.aireFred = aireFred;
        this.material = material;
        this.casaMascota = casaMascota;
    }

    //Mètodes
    public boolean correcteFuncionament() {
        return casaMascota;
    }

    public String getMida(){
        return mida;
    }

    public int getHabitacions(){
        return habitacions;
    }

    public int getPlacesPersones(){
        return placesPersones;
    }

    public int getPlacesParquing(){
        return placesParquing;
    }

    public boolean isTerrassa(){
        return terrassa;
    }

    public boolean isTv(){
        return tv;
    }

    public boolean isAireFred(){
        return aireFred;
    }

    public String getMaterial(){
        return material;
    }

    public boolean isCasaMascota(){
        return casaMascota;
    }

    @Override
    public String toString() {
        return super.toString() + "Glamping{mida=" + mida + ", habitacions=" + habitacions +
                ", placesPersones=" + placesPersones + ", placesParquing=" + placesParquing + ", terrassa=" + terrassa
                + ", tv=" + tv + ", aireFred=" + aireFred + ", material=" + material + ", casaMascota=" + casaMascota + "}";
    }
}
