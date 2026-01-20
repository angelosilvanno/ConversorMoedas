package service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ServicoCambio {

    private String apiKey = "f8b9a75c5126ef6868dfc6c5";

    public double converter(String de, String para, double valor) {
        try {
            String url = "https://v6.exchangerate-api.com/v6/" + apiKey +
                    "/pair/" + de + "/" + para + "/" + valor;

            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build(); // O .GET() é o padrão, pode simplificar assim

            HttpResponse<String> response =
                    client.send(request, HttpResponse.BodyHandlers.ofString());
                    
            if (response.statusCode() != 200) {
                throw new RuntimeException("API indisponível no momento.");
            }

            return extrairResultado(response.body());

        } catch (Exception e) {
            throw new RuntimeException("Não foi possível conectar ao serviço de moedas.");
        }
    }

    private double extrairResultado(String json) {
        String chave = "\"conversion_result\":";
        int inicio = json.indexOf(chave) + chave.length();
        int fim = json.indexOf(",", inicio);

        if (fim == -1) {
            fim = json.indexOf("}", inicio);
        }

        String valorTexto = json.substring(inicio, fim).trim();
        return Double.parseDouble(valorTexto);
    }
}