package prog2.model;

public class BungalowPremium extends Allotjament {
    //Atribut Bungalow Premium
    String mida;
    int habitacions;
    int placesPersones;
    int placesParquing;
    boolean terrassa;
    boolean tv;
    boolean aireFred;
    boolean serveisExtra;
    String codiWifi;

    //Constructor
    public BungalowPremium(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, int placesParquing, boolean terrassa, boolean tv, boolean aireFred,
                           boolean serveisExtra, String codiWifi) {
        super(nom_, idAllotjament_);
        this.mida = mida;
        this.habitacions = habitacions;
        this.placesPersones = placesPersones;
        this.placesParquing = placesParquing;
        this.terrassa = terrassa;
        this.tv = tv;
        this.aireFred = aireFred;
        this.serveisExtra = serveisExtra;
        this.codiWifi = codiWifi;
    }

    //Mètodes
    public boolean correcteFuncionament() {
        return (aireFred) && (codiWifi.length() >= 8 && codiWifi.length() <= 16);
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

    public boolean isServeisExtra(){
        return serveisExtra;
    }

    public String getCodiWifi(){
        return codiWifi;
    }

    @Override
    public String toString() {
        return super.toString() + "BungalowPremium{mida=" + mida + ", habitacions=" + habitacions +
                ", placesPersones=" + placesPersones + ", placesParquing=" + placesParquing + ", terrassa=" + terrassa
                + ", tv=" + tv + ", aireFred=" + aireFred + ", serveisExtra=" + serveisExtra + ", codiWifi=" + codiWifi + "}";
    }
}
