package net.qwerty.soireegeek.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Joueur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,updatable = false)
    private Long id;
    private String pseudo;
    private String email;
    private String joueurTitre;
    private String phone;
    private String imageUrl ;
    @Column(nullable = false,updatable = false)
    private String joueurCode;

    public Joueur(String pseudo, String email, String joueurTitre, String phone, String imageUrl, String joueurCode) {
        this.pseudo = pseudo;
        this.email = email;
        this.joueurTitre = joueurTitre;
        this.phone = phone;
        this.imageUrl = imageUrl;
        this.joueurCode = joueurCode;
    }

    public Joueur() {

    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJoueurTitre() {
        return joueurTitre;
    }

    public void setJoueurTitre(String joueurTitre) {
        this.joueurTitre = joueurTitre;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        imageUrl = imageUrl;
    }

    public String getJoueurCode() {
        return joueurCode;
    }

    public void setJoueurCode(String joueurCode) {
        this.joueurCode = joueurCode;
    }

    @Override
    public String toString() {
        return "Joueur{" +
                "id=" + id +
                ", pseudo='" + pseudo + '\'' +
                ", email='" + email + '\'' +
                ", joueurTitre='" + joueurTitre + '\'' +
                ", phone='" + phone + '\'' +
                ", ImageUrl='" + imageUrl + '\'' +

                '}';
    }
}
