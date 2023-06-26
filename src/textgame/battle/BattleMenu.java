package textgame.battle;

import java.util.Scanner;

import textgame.ConsoleColors;
import textgame.Monster;
import textgame.spells.Spell;

public class BattleMenu {
    Battle battleContext;
    public BattleMenu(Battle battle){
        this.battleContext = battle;

        Scanner sc = new Scanner(System.in);
        battleContext.getPlayer().status();
        battleContext.getPlayer().getJob().loadAbilities();

        System.out.print(ConsoleColors.GREEN + ">>>" + ConsoleColors.RESET);
        String inputString = sc.nextLine();
        if(inputString.equalsIgnoreCase("a")) {
            new PlayerAttack(battleContext);
        } else if (inputString.equalsIgnoreCase("i")){
                battleContext.getPlayer().printInv();
                System.out.println("Use an Item: ex. 'use <item> <player>'");
                System.out.print(ConsoleColors.GREEN + ">>>" + ConsoleColors.RESET);
                inputString = sc.nextLine();
                if(inputString.length() > 3 && inputString.substring(0,3).equals("use")){
                    battleContext.getPlayer().use(inputString, battleContext.getPlayer());
                }

        }else if(inputString.equalsIgnoreCase("m")){
             for(Spell s : battleContext.getPlayer().getJob().getSpells()){
                 System.out.println(s.getName());
             }
             inputString = sc.nextLine();
             for(Spell s : battleContext.getPlayer().getJob().getSpells()){
                 if(inputString.equalsIgnoreCase(s.getName()) || inputString.equalsIgnoreCase(s.getShortcut())){
                     s.cast(battle);
                 }
             }
        }
    }

    public BattleMenu(Monster monster, Battle battle){

        monster.attack(battle);
    }
}
