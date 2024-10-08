package eni.pizza.french.pizz.bo;

public class Utilisateur {
    private Long idUtilisateur;
    private String nom;
    private String prenom;
    private String email;
    private String password;
    private String rue;
    private String ville;
    private int codePostal;
    private Commande panier;

    public Utilisateur(Long idUtilisateur, String nom, String prenom, String email, String password, String rue, String ville, int codePostal, Commande panier) {
        this.idUtilisateur = idUtilisateur;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.password = password;
        this.rue = rue;
        this.ville = ville;
        this.codePostal = codePostal;
        this.panier = panier;
    }

    public Utilisateur() {
        super();
    }

    public Long getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(Long idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRue() {return rue;}

    public void setRue(String rue) {this.rue = rue;}

    public String getVille() {return ville;}

    public void setVille(String ville) {this.ville = ville;}

    public int getCodePostal() {return codePostal;}

    public void setCodePostal(int codePostal) {this.codePostal = codePostal;}

    public Commande getPanier() {return panier;}

    public void setPanier(Commande panier) {this.panier = panier;}
}
