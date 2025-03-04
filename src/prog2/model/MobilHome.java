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
    public MobilHome(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones,
                     boolean terrasaBarbacoa) {
        super(nom_, idAllotjament_, 5, 3);
        this.mida = mida;
        this.habitacions = habitacions;
        this.placesPersones = placesPersones;
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

    public boolean isTerrasaBarbacoa(){
        return terrasaBarbacoa;
    }

    @Override
    public String toString() {
        return super.toString() + "MobilHome{mida=" + mida + ", habitacions=" + habitacions +
                ", placesPersones=" + placesPersones + ", terrasaBarbacoa=" + terrasaBarbacoa + "}";
    }
}

