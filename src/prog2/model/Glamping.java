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

    public Glamping(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, int placesParquing, boolean terrassa, boolean tv, boolean aireFred,
                    String material, boolean casaMascota) {
    }

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

    public String getMaterial(){
        return material;
    }

    public boolean isCasaMascota(){
        return casaMascota;
    }

}
