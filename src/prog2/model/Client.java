package prog2.model;

import prog2.vista.ExcepcioReserva;

public class Client {
    // Atributs
    String nom, dni;

    // Constructor
    public Client(String nom, String dni) {
        this.nom = nom;
        setDni(dni);
    }

    // Mètodes
    // -- Getters
    public String getNom() {
        return nom;
    }
    public String getDni() {return dni;}
    // -- Setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDni(String dni) {
        if (dni.length() == 9) {
            this.dni = dni;
        } else {
            throw new ExcepcioReserva("El DNI ha de tenir 9 caràcters"); //UNHANDLED
        }
    }

    @Override
    public String toString() {
        return "Client=" + nom + ", DNI=" + dni;
    }
}


