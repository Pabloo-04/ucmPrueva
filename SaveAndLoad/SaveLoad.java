package SaveAndLoad;

import GameState.GameContext;

import java.io.*;

public class SaveLoad {

    public SaveLoad() {
    }

    public void save(){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("savefile.txt"));
            bw.write(""+GameContext.getInstance().getPlayer().getMoney());
            bw.newLine();
            bw.write(""+GameContext.getInstance().getPlayer().getItems());
            bw.close();
            bw.newLine();
            System.out.println("You´ve saved the game");
        }catch (Exception e){
            System.out.println("Couldn't save game");
        }

    }

    public void load(){
        try {
            BufferedReader br = new BufferedReader(new FileReader("savefile.txt"));
            int money = Integer.parseInt(br.readLine());
            GameContext.getInstance().getPlayer().setMoney(money);

            br.close();
            System.out.println("Loading game...");
        }catch (Exception e){
            System.out.println("Couldn't load game");
        }
    }

}

