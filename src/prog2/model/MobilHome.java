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

    public MobilHome(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, int placesParquing, boolean terrassa, boolean tv, boolean aireFred,
                     boolean terrasaBarbacoa) {
    }

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

    public boolean isTerrasaBarbacoa(){
        return  terrasaBarbacoa;
    }
}
