package prog2.model;

import prog2.vista.ExcepcioReserva;

public class Client {
    // Atributs
    private String nom_, dni_;

    // Constructor
    public Client(String nom_, String dni_) throws ExcepcioReserva {
        this.nom_ = nom_;
        setDni(dni_);
    }

    // Mètodes
    // -- Getters
    public String getNom() {
        return nom_;
    }
    public String getDni() {return dni_;}
    // -- Setters
    public void setNom(String nom_) {
        this.nom_ = nom_;
    }

    public void setDni(String dni_) throws ExcepcioReserva{
        if (dni_.length() == 9) {
            this.dni_ = dni_;
        } else {
            throw new ExcepcioReserva("El DNI ha de tenir 9 caràcters."); //UNHANDLED
        }
    }

    @Override
    public String toString() {
        return "Client=" + nom_ + ", DNI=" + dni_;
    }
}


