package prog2.model;

public class MobilHome extends Casa {
    //Atributs MobilHome
    private boolean terrasaBarbacoa;

    //Constructor
    public MobilHome(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones,
                     boolean terrasaBarbacoa) {
        super(nom_, idAllotjament_, 5, 3, mida, habitacions, placesPersones);
        this.terrasaBarbacoa = terrasaBarbacoa;
    }

    //Mètodes
    public boolean correcteFuncionament() {
        return terrasaBarbacoa;
    }

    public boolean isTerrasaBarbacoa(){
        return terrasaBarbacoa;
    }

    public void setTerrasaBarbacoa(boolean terrasaBarbacoa) {
        this.terrasaBarbacoa = terrasaBarbacoa;
    }

    @Override
    public String toString() {
        return super.toString() + "MobilHome{terrasaBarbacoa=" + terrasaBarbacoa + "}";
    }
}

