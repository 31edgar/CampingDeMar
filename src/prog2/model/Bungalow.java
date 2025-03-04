package prog2.model;

public class Bungalow extends Casa {
    //Atribut Bungalow
    private int placesParquing;
    private boolean terrassa;
    private boolean tv;
    private boolean aireFred;

    //Constructor comú
    public Bungalow(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones,
                    int placesParquing, boolean terrassa, boolean tv, boolean aireFred) {
        super(nom_, idAllotjament_, 7, 4,mida,habitacions,placesPersones);
        this.placesParquing = placesParquing;
        this.terrassa = terrassa;
        this.tv = tv;
        this.aireFred = aireFred;
    }

    //Mètodes
    public boolean correcteFuncionament() {return aireFred;}

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
        return super.toString() + "Bungalow{placesParquing=" + placesParquing + ", terrassa=" + terrassa + ", tv=" + tv + ", aireFred=" + aireFred + "}";
    }
}
