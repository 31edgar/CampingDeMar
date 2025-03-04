package prog2.model;

public class Bungalow extends Allotjament {
    //Atribut Bungalow
    String mida;
    int habitacions;
    int placesPersones;
    int placesParquing;
    boolean terrassa;
    boolean tv;
    boolean aireFred;

    //Constructor comú
    public Bungalow(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones,
                    int placesParquing, boolean terrassa, boolean tv, boolean aireFred) {
        super(nom_, idAllotjament_, 7, 4);
        this.mida = mida;
        this.habitacions = habitacions;
        this.placesPersones = placesPersones;
        this.placesParquing = placesParquing;
        this.terrassa = terrassa;
        this.tv = tv;
        this.aireFred = aireFred;
    }

    //Mètodes
    public boolean correcteFuncionament() {
        return aireFred;
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

    @Override
    public String toString() {
        return super.toString() + "Bungalow{mida=" + mida + ", habitacions=" + habitacions + ", placesPersones=" +
                placesPersones + ", placesParquing=" + placesParquing + ", terrassa=" + terrassa + ", tv=" + tv + ", aireFred=" + aireFred + "}";
    }
}
