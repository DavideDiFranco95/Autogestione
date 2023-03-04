package EsercizioMarcoTutor;

import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;


public class Main {
    public static void main(String[] args) throws IOException {
        FileAndParole fileAndParole=new FileAndParole();
        //fileAndParole.stampaParole(Path.of("C:\\Users\\David\\IdeaProjects\\Autogestita\\src\\EsercizioMarcoTutor\\resources\\prova.txt"));
        //HashMap mappa = fileAndParole.occorrenzeParole(Path.of("C:\\Users\\David\\IdeaProjects\\Autogestita\\src\\EsercizioMarcoTutor\\resources\\prova.txt"));
        //System.out.println(mappa);
        //HashMap<String,Integer> secondaMappa = fileAndParole.occorrenzeParoleTesto(Path.of("C:\\Users\\David\\IdeaProjects\\Autogestita\\src\\EsercizioMarcoTutor\\resources\\AliceInWonderland.txt"));
        //System.out.println(secondaMappa);
        HashMap<String,Integer> terzaMappa = fileAndParole.paroleInRima(Path.of("src/EsercizioMarcoTutor/resources/prova.txt"));
        System.out.println(terzaMappa);
    }
}
