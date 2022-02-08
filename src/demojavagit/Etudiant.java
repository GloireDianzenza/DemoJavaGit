/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demojavagit;

/**
 *
 * @author HP
 */
public class Etudiant 
{
    private int id;
    
    private String nom;
    
    private double moyenne;
    
    public Etudiant(int I,String name,double m)
    {
        id = I;
        nom = name;
        moyenne = m;
    }
    
    public int getId()
    {
        return id;
    }
    
    public void setId(int n)
    {
        id = n;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the moyenne
     */
    public double getMoyenne() {
        return moyenne;
    }

    /**
     * @param moyenne the moyenne to set
     */
    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }
}
