package donnees;

public class ComparateurAlbum implements ComparateurCd{

    public boolean etreAvant(CD cd1, CD cd2){
        return  cd1.compareCdAlbums(cd2);
    }
}
