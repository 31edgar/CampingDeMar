package prog2.model;

public class Parcela extends Allotjament {
    //Atributs Parcela
    float metres;
    boolean connexioElectrica;

    //constructor comú
    public Parcela(String nom_, String idAllotjament, float metres, boolean connexioElectrica){
    }

    public boolean correcteFuncionament(){
        return connexioElectrica;
    }

    public float getMida() {
        return metres;
    }

    public void setMida(float metres){
        this.metres = metres;
    }

    public boolean isConnexioElectrica(){
        return connexioElectrica;
    }

    public void setConnexioElectrica(boolean connexioElectrica){
        this.connexioElectrica = connexioElectrica;
    }
}
