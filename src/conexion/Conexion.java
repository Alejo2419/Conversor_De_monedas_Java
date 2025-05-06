package conexion;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

public class Conexion {
    public static Map<String, Double> obtenerTasas () throws Exception {

        String direccion = "https://v6.exchangerate-api.com/v6/84385a00fec63c0f45d344db/latest/USD";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();

        Gson gson = new Gson();
        ResuestaExch respuesta = gson.fromJson(json, ResuestaExch.class);

        return respuesta.getTasa_de_conversion();
    }

}
