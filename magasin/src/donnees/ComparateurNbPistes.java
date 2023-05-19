package donnees;

public class ComparateurNbPistes implements ComparateurCd{

    @Override
    public boolean etreAvant(CD cd1, CD cd2) {
        return cd1.compareNbCds(cd2);
    }
}
