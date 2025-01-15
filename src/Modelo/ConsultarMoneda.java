package Modelo;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarMoneda {
    public Moneda obtenerConversion(String MonedaBase, String cambio, double valorAConvertir){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/5f4dfb7160afa622319efbbf/pair/" +
                MonedaBase + "/" + cambio + "/" + valorAConvertir);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(direccion).build();

        HttpResponse<String> response = null;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception e) {
            throw new RuntimeException("No se encontro la moneda de cambio");
        }

    }
}
