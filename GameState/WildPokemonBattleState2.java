package GameState;

public class WildPokemonBattleState2 extends BattleState {
    @Override
    protected void initializeOpponentPokemon() {
        opponentPokemon = WildPokemonSelector.getRandomWildPokemon();
    }

    @Override
    protected void displayBattleStartMessage() {
        System.out.println("A wild " + opponentPokemon.getName() + " appeared!");
        System.out.println("HP: " + opponentPokemon.getHp() + " | LVL: " + opponentPokemon.getLevel() + " | SPEED " + opponentPokemon.getSpeed());
    }

    @Override
    protected void handleVictory() {
        System.out.println(opponentPokemon.getName() + " fainted! You win!");
        GameContext.getInstance().player.setMoney(GameContext.getInstance().player.getMoney() + 10);
        playerPokemon.gainXp(opponentPokemon.getLevel() * 2);
        playerPokemon.checkLevelUp();
        GameContext.getInstance().setState(new ExploringState());
    }

    @Override
    protected void handleDefeat() {
        System.out.println(playerPokemon.getName() + " fainted! You lose!");
        GameContext.getInstance().setState(new ExploringState());
    }

    @Override
    protected boolean canRun() {
        return true;
    }
}
