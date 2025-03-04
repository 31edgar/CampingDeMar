package prog2.model;

public class Glamping extends Casa {
    //Atributs Glamping
    private String material;
    private boolean casaMascota;

    //Constructor
    public Glamping(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones,
                    String material, boolean casaMascota) {
        super(nom_, idAllotjament_, 5, 3, mida, habitacions, placesPersones);
        this.material = material;
        this.casaMascota = casaMascota;
    }

    //Mètodes
    public boolean correcteFuncionament() {
        return casaMascota;
    }

    public String getMaterial(){
        return material;
    }

    public boolean isCasaMascota(){
        return casaMascota;
    }

    @Override
    public String toString() {
        return super.toString() + "Glamping{material=" + material + ", casaMascota=" + casaMascota + "}";
    }
}
