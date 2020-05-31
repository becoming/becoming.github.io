import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Base64;

public class StringToMp3 {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        String key = args[0];
        String message = args[1];
        String mp3FilePath = "/tmp/synth.mp3";

        HttpRequest request = HttpRequest
                .newBuilder()
                .uri(new URI("https://texttospeech.googleapis.com/v1/text:synthesize?alt=json&key=" + key))
                .POST(HttpRequest.BodyPublishers.ofString("{\n" +
                        "  \"input\": {\n" +
                        "    \"text\": \"" + message + "\"\n" +
                        "  },\n" +
                        "  \"voice\": {\n" +
                        "    \"name\": \"\",\n" +
                        "    \"languageCode\": \"en-US\"\n" +
                        "  },\n" +
                        "  \"audioConfig\": {\n" +
                        "    \"audioEncoding\": \"MP3\",\n" +
                        "    \"pitch\": 0\n" +
                        "  }\n" +
                        "}"))
                .build();

        final HttpClient client = HttpClient.newBuilder().build();
        final HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        String mp3Base64 = response
                .body()
                .replace("{\n  \"audioContent\": \"", "")
                .replace("\"\n}", "");

        byte[] mp3Content = Base64.getDecoder().decode(mp3Base64.trim());
        Files.write(Path.of(mp3FilePath), mp3Content);

        System.out.println(mp3FilePath);
    }
}