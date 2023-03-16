import com.example.demo.MonObjetATester;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MonTestUnitaire {

        @Test
        public void testMethode() {
            // Créer un objet ou obtenir une référence à l'objet à tester
            MonObjetATester objet = new MonObjetATester();

            // Appeler la méthode à tester et stocker le résultat
            int resultat = objet.methodeATester(2, 3);

            // Vérifier que le résultat est celui attendu
            assertEquals(5, resultat);
        }
    }

