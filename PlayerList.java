import java.util.ArrayList;
import java.util.Scanner;

public class PlayerList extends ArrayList<Player> {
    private ArrayList<Player> playerList;
    private static Scanner input = new Scanner(System.in);

   /* public PlayerList(ArrayList<Player> playerList) {
        this.playerList = playerList;
    }

    public ArrayList<Player> addPlayer(Player player) {
        playerList.add(player);

        return playerList;
    } */

    public void setPlayerList(PlayerList playerList) {
        this.playerList = playerList;
    }

    public void tilføjSpillerManuelt(Player ManuelSpiller)
   {
       this.playerList.add(ManuelSpiller);
   }

    public void opretSpiller()
    {
        Player player = new Player
                (
                    indtastPosition(),
                    indtastNavn(),
                    indtastAlder(),
                    indtastSkillLevel(),
                    indtastVærdi()

                );
        this.playerList.add(player);
    }

    public Player findSpiller(){
        System.out.println("Indtast navn");
        String choice = input.nextLine();
        for(Player find : playerList)
        {
            if(choice.equalsIgnoreCase(find.getName()))
             return find;
        }
        return null;
    }

    public Player findMålmænd(){
        Position Choice = Position.GOALKEEPER;

        for(Player find : playerList)
        {
            if(find.getPosition() == Position.GOALKEEPER){
                System.out.println(find);
            }

        }
        return null;
    }
    public Player findForsvar(){
        Position Choice = Position.DEFENDER;

        for(Player find : playerList)
        {
            if(find.getPosition() == Position.DEFENDER){
                System.out.println(find);
            }

        }
        return null;
    }

    public Player findMidtbane(){
        Position Choice = Position.MIDFIELDER;

        for(Player find : playerList)
        {
            if(find.getPosition() == Position.MIDFIELDER){
                System.out.println(find);
            }

        }
        return null;
    }

    public Player findAngriber(){
        Position Choice = Position.ATTACKER;

        for(Player find : playerList)
        {
            if(find.getPosition() == Position.ATTACKER){
                System.out.println(find);
            }

        }
        return null;
    }


    private String indtastVærdi() {
        System.out.println("Indtast spillerens værdi");
        return input.nextLine();
    }

    private String indtastSkillLevel() {
        System.out.println("Indtast spillerens SkillLevel: ");

        return input.nextLine();
    }

    private String indtastAlder() {
        System.out.println("Indtast spillerens alder: ");

        return input.nextLine();
    }

    private String indtastNavn() {
        System.out.println("Indtast spillerens navn: ");

        return input.nextLine();
    }

    private Position indtastPosition() {
        System.out.println("Indtast spiller position: ");

        return Position.valueOf(input.nextLine().toUpperCase());
    }


    public PlayerList(){this.playerList = new ArrayList<>();}

    public ArrayList<Player> removePlayer(Player player) {
        playerList.remove(player);

        return playerList;
    }

    public ArrayList<Player> getPlayerList() {
        return playerList;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < this.playerList.size(); i++){
            result += this.playerList.get(i);
    }


        return result;
    }

    public void visMålmænd() {

        for (Player find : playerList)
        {

            System.out.println(find.toString());

        }
    }


    public void redigerSpiller() {
        Player player = findSpiller();
        System.out.println("\nHvad skal ændres?\n" +
                            "1. Spiller position\n" +
                            "2. Spiller navn\n" +
                            "3. Spiller alder\n" +
                            "4. Spiller SkillLevel\n" +
                            "5. Spiller Værdi\n" +
                            "6. tilbage");
        String choice = input.nextLine();

        switch (choice)
        {
            case "1":
                System.out.println("Indtast ny position: ");
                player.setPosition(Position.valueOf(input.nextLine().toUpperCase()));
                break;
            case "2":
                System.out.println("Indtast nyt navn: ");
                player.setName(input.nextLine());
                break;
            case "3":
                System.out.println("Indtast ny alder: ");
                player.setAge(input.nextLine());
                break;
            case "4":
                System.out.println("Indtast SkillLevel: ");
                player.setSkillLevel(input.nextLine());
            case "5":
                System.out.println("Indtast ny spiller værdi: ");
                player.setValue(input.nextLine());
                break;
            default:
                break;
        }
    }

    /*
     * The idea is to have a class controlling the player list
     */

    // 3a. Create an empty constructor and inside initiate the playerList as a new arraylist

    // 3b. Create two methods
    //      addPlayer
    //          - This method should add a Player to the playerList
    //      removePlayer
    //          - This method should remove a Player from the playerList
    //      getPlayerList
    //          - This method should return playerList

    // 3c. Create a toString method returning a String of all players in the playerList
}
