package donnees;

public class ComparateurArtiste implements ComparateurCd{

    @Override
    public boolean etreAvant(CD cd1, CD cd2) {
        return cd1.compareCdArtiste(cd2);
    }
}
