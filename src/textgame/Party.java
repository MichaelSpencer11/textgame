package textgame;

import java.util.ArrayList;

public class Party {
    protected Character leader;
    protected String partyName;
    protected ArrayList<Character> partyList = new ArrayList<Character>();

    public Party(String name, Character player){
        this.partyName = name;
        partyList.add(player);
        this.leader = player;
        player.currentParty = this;
    }

    public static void createParty(String name, Character player){
        Party party = new Party(name, player);
        World.getGlobalPartyList().add(party);
        System.out.println("Party " + party.partyName + " was created.");
        
    }

    public void addMember(String name){
        for(Character c : World.getGlobalCharacterList()){
            if(name.equals(c.name)){
                partyList.add(c);
                System.out.println("Character " + c.name + " was added to the party.");
            }
        }
    }

    public void listMembers(){
        System.out.println("List of party members:");
        for (Character c : partyList){
            System.out.println(c.name + " : " + c.job + " : " + c.job.level);
        }
    }

}
