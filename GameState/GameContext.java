package GameState;

import Entities.Player;
import GameStateMemento.Game;
import Items.Buyable;
import PokemonFactory.Pokemon.Pokemon;

import java.util.ArrayList;

public class GameContext {
    private GameState state;
    protected Player player;
    protected Buyable buyable;


    public GameContext() {
        this.state = new InitialMenuState();
        this.player = new Player();
        this.buyable = new Buyable();
    }

    public void setState(GameState state) {
        this.state = state;
        if (state != null) {
            state.handle(this);
        }
    }

    public Buyable getBuyable() {return buyable;}

    public void setBuyable(Buyable buyable) {this.buyable = buyable;}

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
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