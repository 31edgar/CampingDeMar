package prog2.model;

public abstract class Casa extends Allotjament{
    //Atributs Casa
    private String mida;
    private int habitacions;
    private int placesPersones;

    //Constructor Comú
    public Casa(String nom_, String idAllotjament, long estadaMinimaALTA_, long estadaMinimaBAIXA_, String
                mida, int habitacions, int placesPersones){
        super(nom_,idAllotjament,estadaMinimaALTA_,estadaMinimaBAIXA_);
        this.mida = mida;
        this.habitacions = habitacions;
        this.placesPersones = placesPersones;
    }

    //Mètodes
    //No és necessari redefinir "correcte funcionament" ja que és una classe abstracte
    public String getMida() {return mida;}

    public void setMida(String mida) {this.mida = mida;}

    public int getHabitacions() {return habitacions;}

    public void setHabitacions(int habitacions) {this.habitacions = habitacions;}

    public int getPlacesPersones() {return placesPersones;}

    public void setPlacesPersones(int placesPersones) {this.placesPersones = placesPersones;}

    @Override
    public String toString(){
        return super.toString() + "Casa{mida=" + mida + ", habitacions=" + habitacions + ", placesPersones=" + placesPersones + "}";
    }
}
