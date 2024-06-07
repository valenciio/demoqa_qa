package guru.qa;

import guru.qa.model.ModelJSON;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import java.io.InputStream;
import java.io.InputStreamReader;
import static org.assertj.core.api.Assertions.assertThat;

public class ParseJSONJackson {

    ClassLoader cl = ParseJSONJackson.class.getClassLoader();
    ObjectMapper objectMapper = new ObjectMapper();

    @Test
    void parseJsonJackson() throws Exception {

        try (
                InputStream resource = cl.getResourceAsStream("exampleJson.json");
                InputStreamReader reader = new InputStreamReader(resource);
        ) {
            ModelJSON jsonObject = objectMapper.readValue(reader, ModelJSON.class);
            assertThat(jsonObject.category).isEqualTo("Hotel");
            assertThat(jsonObject.street).isEqualTo("Nevskaya street");
            assertThat(jsonObject.house_number).isEqualTo(2);
            assertThat(jsonObject.phone).isEqualTo("77777777777");
            assertThat(jsonObject.open).isTrue();
            assertThat(jsonObject.room_number).contains("11", "22", "33");
        }
    }
}
