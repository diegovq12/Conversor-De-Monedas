import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaDivisa {

    public float consultarDivisa(String divisaBase, String divisaObjetivo) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/7041df34b05ba4b92e29369f/pair/" + divisaBase + "/" + divisaObjetivo);

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(direccion)
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            // Parsear la respuesta JSON
            JsonObject json = JsonParser.parseString(response.body()).getAsJsonObject();

            return json.get("conversion_rate").getAsFloat();
        } catch (Exception e) {
            throw new RuntimeException("No se encontró esa divisa...", e);
        }
    }

}
