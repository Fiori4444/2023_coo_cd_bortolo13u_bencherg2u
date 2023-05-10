package XML;

import donnees.Magasin;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class ChargeurMagasinTest {

    @Test
    void chargerMagasin_OK() throws FileNotFoundException {
        String repertoire = "musicbrainzSimple/";
        ChargeurMagasin charge = new ChargeurMagasin(repertoire);
        Magasin resultat = charge.chargerMagasin();
        assertEquals(12,resultat.getNombreCds());
    }

    @Test
    void chargerMagasin_PAS_OK(){
        boolean exc = false;
        try{
            String repertoire = "ezfeff";
            ChargeurMagasin charge = new ChargeurMagasin(repertoire);
            Magasin resultat = charge.chargerMagasin();
        }catch (FileNotFoundException e){
            e.getMessage();
            exc = true;
        }

        assertTrue(exc);



    }

}