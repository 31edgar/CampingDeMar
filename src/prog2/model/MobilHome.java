package prog2.model;

public class MobilHome extends Allotjament {
    //Atributs MobilHome
    String mida;
    int habitacions;
    int placesPersones;
    int placesParquing;
    boolean terrassa;
    boolean tv;
    boolean aireFred;
    boolean terrasaBarbacoa;

    //Constructor
    public MobilHome(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, int placesParquing, boolean terrassa, boolean tv, boolean aireFred,
                     boolean terrasaBarbacoa) {
        super(nom_, idAllotjament_);
        this.mida = mida;
        this.habitacions = habitacions;
        this.placesPersones = placesPersones;
        this.placesParquing = placesParquing;
        this.terrassa = terrassa;
        this.tv = tv;
        this.aireFred = aireFred;
        this.terrasaBarbacoa = terrasaBarbacoa;
    }

    //Mètodes
    public boolean correcteFuncionament() {
        return terrasaBarbacoa;
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

    public boolean isTerrasaBarbacoa(){
        return terrasaBarbacoa;
    }

    @Override
    public String toString() {
        return super.toString() + "MobilHome{mida=" + mida + ", habitacions=" + habitacions +
                ", placesPersones=" + placesPersones + ", placesParquing=" + placesParquing + ", terrassa=" + terrassa
                + ", tv=" + tv + ", aireFred=" + aireFred + ", terrasaBarbacoa=" + terrasaBarbacoa + "}";
    }
}

