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
    public Bungalow(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, int placesParquing, boolean terrassa, boolean tv, boolean aireFred) {
    }

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
}
