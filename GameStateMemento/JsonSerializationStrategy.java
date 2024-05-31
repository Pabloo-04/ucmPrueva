package GameStateMemento;

/*import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class JsonSerializationStrategy implements SerializationStrategy {
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void serialize(GameStateMemento memento, String filename) throws IOException {
        objectMapper.writeValue(new File(filename), memento);
    }

    @Override
    public GameStateMemento deserialize(String filename) throws IOException, ClassNotFoundException {
        return objectMapper.readValue(new File(filename), GameStateMemento.class);
    }
}
*/


