package donnees;

public class SelecteurArtiste implements Selecteur{

    String nomArtiste;

    public SelecteurArtiste(String nom){
        this.nomArtiste=nom;
    }
    @Override
    public boolean garderCd(CD cd) {
        return cd.equalsArtiste(this.nomArtiste);
    }
}
