package GameState;

import Items.Buyable;

import java.util.ArrayList;

public class GameContext {
    private GameState state;
    private String playerName;
    private ArrayList<Buyable> items;

    public GameContext() {
        this.state = new InitialMenuState();
        this.items = new ArrayList<>();

    }

public void addItem(Buyable item) {
    this.items.add(item);
}

public void setState(GameState state) {
    this.state = state;
    if (state != null) {
        state.handle(this);
    }
}

public ArrayList<Buyable> getItems() {
    return items;
}

public void setItems(ArrayList<Buyable> items) {
    this.items = items;
}

public void setPlayerName(String playerName) {
    this.playerName = playerName;
}

public String getPlayerName() {
    return playerName;
}

public void start() {
    while (state != null) {
        state.handle(this);
    }
}

public void request() {
    this.state.handle(this);
}
}