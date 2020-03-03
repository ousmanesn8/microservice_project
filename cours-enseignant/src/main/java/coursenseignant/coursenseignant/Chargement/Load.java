package coursenseignant.coursenseignant.Chargement;

import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import net.minidev.json.parser.JSONParser;
import net.minidev.json.parser.ParseException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.io.BufferedInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Component
public class Load {

    public List<String> loadCours() throws IOException, ParseException {
        URL url = new URL("http://courscontainer:9090/cours");
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        conn.setRequestMethod("GET");
        conn.connect();
        int responsecode = conn.getResponseCode();
        if(responsecode != 200) throw new RuntimeException("HttpResponseCode: " +responsecode);
        else {

            Scanner sc = new Scanner(url.openStream());
            String inline = "";

            while(sc.hasNext())

            {

                inline+=sc.nextLine();

            }

            System.out.println("\nJSON data in string format");

            System.out.println(inline);

            sc.close();

            JSONParser parse = new JSONParser();
            JSONArray jsonArray = (JSONArray) parse.parse(inline);
            List<String> idscours = new ArrayList<>();
            for(int i=0; i<jsonArray.size(); i++) {
                JSONObject jsonObject = (JSONObject) parse.parse(jsonArray.get(i).toString());
                idscours.add((String) jsonObject.get("idcours"));
            }
            return idscours;

        }

    }

    public List<String> loadEnseignant() throws IOException, ParseException {
        URL url = new URL("http://enseignantcontainer:9091/enseignants");
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        conn.setRequestMethod("GET");
        conn.connect();
        int responsecode = conn.getResponseCode();
        if(responsecode != 200) throw new RuntimeException("HttpResponseCode: " +responsecode);
        else {

            Scanner sc = new Scanner(url.openStream());
            String inline = "";

            while(sc.hasNext())

            {

                inline+=sc.nextLine();

            }

            System.out.println("\nJSON data in string format");

            System.out.println(inline);

            sc.close();

            JSONParser parse = new JSONParser();
            JSONArray jsonArray = (JSONArray) parse.parse(inline);
            List<String> idsenseignants = new ArrayList<>();
            for(int i=0; i<jsonArray.size(); i++) {
                JSONObject jsonObject = (JSONObject) parse.parse(jsonArray.get(i).toString());
                idsenseignants.add((String) jsonObject.get("idEnseignant"));
            }
            return idsenseignants;
        }
    }
    }
