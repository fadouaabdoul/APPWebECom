package com.APPWebECom.APPWebECom.Beans;

import java.util.Date;

public class Commande {
        public int idCom;
        public Date dateCom;
        public float montant;

        public Commande(){}

    public Commande(int idCom, Date dateCom, float montant) {
        this.idCom = idCom;
        this.dateCom = dateCom;
        this.montant = montant;
    }

    public int getIdCom() {
        return idCom;
    }

    public void setIdCom(int idCom) {
        this.idCom = idCom;
    }

    public Date getDateCom() {
        return dateCom;
    }

    public void setDateCom(Date dateCom) {
        this.dateCom = dateCom;
    }

    public float getMontant() {
        return montant;
    }

    public void setMontant(float montant) {
        this.montant = montant;
    }

    @Override
    public String toString() {
        return "Commande{" +
                "idCom=" + idCom +
                ", dateCom=" + dateCom +
                ", montant=" + montant +
                '}';
    }
}
