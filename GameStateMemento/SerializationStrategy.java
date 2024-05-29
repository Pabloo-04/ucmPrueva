package GameStateMemento;
import java.io.IOException;
public interface SerializationStrategy {
    void serialize(GameStateMemento memento, String filename) throws IOException;
    GameStateMemento deserialize(String filename) throws IOException, ClassNotFoundException;
}
