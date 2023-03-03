package EsercizioMarcoTutor;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;


public class FileAndParole{
    public void stampaParole(Path file) throws IOException {
        FileReader fileReader = new FileReader(file.toFile());
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        while(bufferedReader.ready()){
            String riga=bufferedReader.readLine();
            String[] parole = riga.split(" ");
            for (String parola :parole){
                System.out.println(parola);
            }
            //System.out.println(Arrays.toString(parole));
        }
    }
    public HashMap<String,Integer> occorrenzeParole(Path file)throws IOException{
        FileReader fileReader = new FileReader(file.toFile());
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        HashMap<String,Integer> result = new HashMap<>();

        while (bufferedReader.ready()){
            String riga = bufferedReader.readLine();
            String[] parole = riga.split(" ");
            for (String parola : parole) {
                //se quella parola la vedo per la prim volta, metto nella mappa
                //quella parola associandogli il numero uno.
                if (!result.containsKey(parola)) {
                    result.put(parola, 1);
                }
                else {
                    int oldValue = result.get(parola);
                    result.put(parola, ++oldValue);
                }
            }
        }
        return result;
    }

    public HashMap<String,Integer> occorrenzeParoleTesto(Path file) throws IOException{
        FileReader fileReader = new FileReader(file.toFile());
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        HashMap<String,Integer> result = new HashMap<>();

        while (bufferedReader.ready()){
            String riga = bufferedReader.readLine();
            riga = riga.toLowerCase();
            //riga.split("\\p{Punct}");
            riga = riga.replaceAll("[^a-z\\s]"," ").trim();
            String[] parole = riga.split(" ");
            for (String parola : parole) {
                //se quella parola la vedo per la prim volta, metto nella mappa
                //quella parola associandogli il numero uno.
                if (!result.containsKey(parola)) {
                    result.put(parola, 1);
                }
                else {
                    int oldValue = result.get(parola);
                    result.put(parola, ++oldValue);
                }
            }
        }
        return result;
    }
}


