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
    public Glamping(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones,
                    String material, boolean casaMascota) {
        super(nom_, idAllotjament_, 5, 3);
        this.mida = mida;
        this.habitacions = habitacions;
        this.placesPersones = placesPersones;
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

    public String getMaterial(){
        return material;
    }

    public boolean isCasaMascota(){
        return casaMascota;
    }

    @Override
    public String toString() {
        return super.toString() + "Glamping{mida=" + mida + ", habitacions=" + habitacions +
                ", placesPersones=" + placesPersones + ", material=" + material + ", casaMascota=" + casaMascota + "}";
    }
}
