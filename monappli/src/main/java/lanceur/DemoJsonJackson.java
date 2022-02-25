package lanceur;

import com.objis.demojson.domaine.Employe;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.File;

public class DemoJsonJackson {
    public static void main (String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Employe employe1 = new Employe("BA", "Amadou");

        File resultFile = new File ("employe.json");
        mapper.writeValue(resultFile, employe1);
    }
}