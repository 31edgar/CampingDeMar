package prog2.model;

public class BungalowPremium extends Bungalow {
    //Atribut Bungalow Premium
    private boolean serveisExtra;
    private String codiWifi;

    //Constructor
    public BungalowPremium(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, int placesParquing, boolean terrassa, boolean tv,
                           boolean aireFred, boolean serveisExtra, String codiWifi) {
        super(nom_, idAllotjament_, mida, habitacions, placesPersones, placesParquing, terrassa, tv, aireFred);
        this.serveisExtra = serveisExtra;
        this.codiWifi = codiWifi;
    }

    //Mètodes
    public boolean correcteFuncionament() {
        return (isAireFred()) && (codiWifi.length() >= 8 && codiWifi.length() <= 16);
    }

    public boolean isServeisExtra(){
        return serveisExtra;
    }

    public String getCodiWifi(){
        return codiWifi;
    }

    public void setServeisExtra(boolean serveisExtra) {
        this.serveisExtra = serveisExtra;
    }

    public void setCodiWifi(String codiWifi) {
        this.codiWifi = codiWifi;
    }

    //Declara primer un Bungalow i seguidament afageix un llistat "ServeisPreium"
    @Override
    public String toString() {
        return super.toString() + "ServeisPremium{serveisExtra=" + serveisExtra + ", codiWifi=" + codiWifi + "}";
    }
}
