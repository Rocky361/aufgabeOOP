package bfw.de;

public class Film {
    private String name, regisseur, erscheinungsJahr;
    private int laengeInMinuten;

    public Film(String name,String erscheinungsJahr, int laengeInMinuten, String regisseur) {
        this.name = name;
        this.regisseur = regisseur;
        this.erscheinungsJahr = erscheinungsJahr;
        this.laengeInMinuten = laengeInMinuten;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegisseur() {
        return regisseur;
    }

    public void setRegisseur(String regisseur) {
        this.regisseur = regisseur;
    }

    public String getErscheinungsJahr() {
        return erscheinungsJahr;
    }

    public void setErscheinungsJahr(String erscheinungsJahr) {
        this.erscheinungsJahr = erscheinungsJahr;
    }

    public int getLaengeInMinuten() {
        return laengeInMinuten;
    }

    public void setLaengeInMinuten(int laengeInMinuten) {
        this.laengeInMinuten = laengeInMinuten;
    }

    public Object getFilm(){
        System.out.println(getName() + " | " + getErscheinungsJahr() + " | " + getLaengeInMinuten() + " Minuten | " + getRegisseur());
        return null;
    }



}
