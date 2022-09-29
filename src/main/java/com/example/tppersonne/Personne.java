package com.example.tppersonne;

public class Personne {
    String nom;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    @Override
    public String toString() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    String prenom;
    Integer age;

    public Personne(String nom, String prenom, Integer age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }
}
