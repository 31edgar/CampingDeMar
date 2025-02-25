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

    public BungalowPremium(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, int placesParquing, boolean terrassa, boolean tv, boolean aireFred,
                           boolean serveisExtra, String codiWifi) {
    }

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
        return placesPersones;
    }

    public boolean isTerrassa(){
        return terrassa;
    }

    public boolean isTv(){
        return terrassa;
    }

    public boolean isAireFred(){
        return terrassa;
    }

    public boolean isServeisExtra(){
        return serveisExtra;
    }

    public String getCodiWifi(){
        return codiWifi;
    }
}
