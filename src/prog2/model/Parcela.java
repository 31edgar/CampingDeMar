package prog2.model;

public class Parcela extends Allotjament {
    //Atributs Parcela
    private float metres;
    private boolean connexioElectrica;

    //Constructor comú
    public Parcela(String nom_, String idAllotjament, float metres, boolean connexioElectrica){
        super(nom_, idAllotjament, 4, 2);
        this.metres = metres;
        this.connexioElectrica = connexioElectrica;
    }

    //Mètodes
    public boolean correcteFuncionament() {return connexioElectrica;}

    public float getMida() {return metres;}

    public void setMida(float metres){
        this.metres = metres;
    }

    public boolean isConnexioElectrica(){
        return connexioElectrica;
    }

    public void setConnexioElectrica(boolean connexioElectrica){
        this.connexioElectrica = connexioElectrica;
    }

    @Override
    public String toString() {
        return super.toString() + "Parcela{metres=" + metres + ", connexioElectrica=" + connexioElectrica + "}";
    }
}


