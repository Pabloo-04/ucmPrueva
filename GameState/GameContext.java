package GameState;

import Entities.Player;
import SaveAndLoad.Load;
import SaveAndLoad.Save;



public class GameContext {
    private static GameContext instance;
    private GameState state;
    protected int Gamelevel;

    private int initialChoice;

    protected Player player;


    protected Save save;
    protected Load load;

    public static GameContext getInstance(){
        if (instance == null){
            instance = new GameContext();
        }
        return instance;
    }

    public GameContext() {
        this.state = new InitialMenuState();
        this.player = new Player();
        this.save = new Save();
        this.load = new Load();
    }

    public void setState(GameState state) {
        this.state = state;
        if (state != null) {
            state.handle();
        }
    }




    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getGamelevel() {
        return  Gamelevel;
    }

    public void setGamelevel(int gamelevel) {
        Gamelevel = gamelevel;
    }

   public void checkLevel(){
        if(Gamelevel< 2 ){
            if(player.getPokemons().size() != 1){
                Gamelevel = 2;
            }
        }

   }

    public int getInitialChoice() {
        return initialChoice;
    }

    public void setInitialChoice(int initialChoice) {
        this.initialChoice = initialChoice;
    }

    public void start() {
        while (state != null) {
            state.handle();
        }
    }

}


