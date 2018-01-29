import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise4 {
    static Scanner input = new Scanner(System.in);
    static PlayerList Team = new PlayerList();
    /*
     * Exercise4 is about inheritance and abstract class.
     *
     * Create a Library of Soccer Players
     * They should be grouped into Goal Keeper, Defender, Midfielder, Attacker.
     * A player should have an birthdate, name, value, skill level, position.
     *
     * The idea with the library is to have a place to search for players.
     * And use this in Level5 Exercise where you are going to use this Level4 package
     *
     *
     */

    // 1. Go to the Player Class

    // 2. Before we go on
    //      a. you are going to create a few players
    //          inside public static void main(String[] args)
    //              Two GoalKeepers
    //              Four Defenders
    //              Four Midfielders
    //              Two Attacers
    //      b. Print out the Players

    // 3. Go to the PlayerList Class

    // 4. Here you want to add the players to the playerList
    //      Do it in the public static void main(...)

    // 5. Go to the Library Class

    // 6. Try out all of the newly created methods in the pvsm(..)

    // 7. Create a menu method in this class
    //      Use the scanner to create a running menu, as i have show you
    //      input should be nextLine() and the switch statement should take a String as choice
    //  The menu choices should be called
    //      - seePlayers
    //      - seeGoalKeepers
    //      - seeDefenders
    //      - seeMidfielders
    //      - seeAttackers

    // 8. Go to Level5 FileHandler to start next level
    public static void main(String[] args) {

    /*    Player player = new Player(Position.ATTACKER,"Andreas","22","100","5500000");
        Player player1 = new Player(Position.GOALKEEPER,"Markus","25","90","550000");
        Player player2 = new Player(Position.GOALKEEPER,"Jesper","27","87","55000");
        Player player3 = new Player(Position.DEFENDER,"Albert","26","76","45000");
        Player player4 = new Player(Position.DEFENDER,"Jens","22","85","54000");
        Player player5 = new Player(Position.MIDFIELDER,"Lars","22","91","550000");
        Player player6 = new Player(Position.ATTACKER,"Karsten","22","99","550000");
        Player player7 = new Player(Position.DEFENDER,"Danny","22","2","550000");
        Player player8 = new Player(Position.MIDFIELDER,"Anders","22","60","550000");
        Player player9 = new Player(Position.DEFENDER,"Kasper","22","1","550000");
        Player player10 = new Player(Position.MIDFIELDER,"Casper","22","50","550000");
        Player player11 = new Player(Position.GOALKEEPER,"Hans","22","34","6000");
        Player player12 = new Player(Position.DEFENDER,"Martin","22","78","55000");
        Player player13 = new Player(Position.MIDFIELDER,"Peter","22","65","55000");
        Player player14 = new Player(Position.ATTACKER,"Troels","22","32","55000");
        Player player15 = new Player(Position.DEFENDER,"Jannik","22","67","55000");
        Player player16 = new Player(Position.MIDFIELDER,"Anton","22","76","55000");
        Player player17 = new Player(Position.GOALKEEPER,"Henrik","22","85","55000");
        Player player18 = new Player(Position.DEFENDER,"Ole","22","64","55000");
        Player player19 = new Player(Position.MIDFIELDER,"Jørgen","22","43","55000");
        Player player20 = new Player(Position.MIDFIELDER,"Kristian","22","92","55000");
        Player player21 = new Player(Position.DEFENDER,"Stephan","22","23","55000");
        Player player22 = new Player(Position.MIDFIELDER,"Mathias","22","95","55000");
        Player player23 = new Player(Position.ATTACKER,"Malte","22","20","55000");
        Player player24 = new Player(Position.ATTACKER,"Lukas","22","90","55000");
        Player player25 = new Player(Position.ATTACKER,"Aske","22","90","55000");



        Team.tilføjSpillerManuelt(player);
        Team.tilføjSpillerManuelt(player1);
        Team.tilføjSpillerManuelt(player2);
        Team.tilføjSpillerManuelt(player3);
        Team.tilføjSpillerManuelt(player4);
        Team.tilføjSpillerManuelt(player5);
        Team.tilføjSpillerManuelt(player6);
        Team.tilføjSpillerManuelt(player7);
        Team.tilføjSpillerManuelt(player8);
        Team.tilføjSpillerManuelt(player9);
        Team.tilføjSpillerManuelt(player10);
        Team.tilføjSpillerManuelt(player11);
        Team.tilføjSpillerManuelt(player12);
        Team.tilføjSpillerManuelt(player13);
        Team.tilføjSpillerManuelt(player14);
        Team.tilføjSpillerManuelt(player15);
        Team.tilføjSpillerManuelt(player16);
        Team.tilføjSpillerManuelt(player17);
        Team.tilføjSpillerManuelt(player18);
        Team.tilføjSpillerManuelt(player19);
        Team.tilføjSpillerManuelt(player20);
        Team.tilføjSpillerManuelt(player21);
        Team.tilføjSpillerManuelt(player22);
        Team.tilføjSpillerManuelt(player23);
        Team.tilføjSpillerManuelt(player24);
        Team.tilføjSpillerManuelt(player25);
*/


        menu();



    }


    private static void menu() {
        Team.setPlayerList(læsPlayerList());
        Team = læsPlayerList();
        while (true) {
            System.out.println("\nMenu:\n" +
                    "1. Opret Spiller\n" +
                    "2. Slet spiller\n" +
                    "3. Rediger spiller\n" +
                    "4. Vis spillere\n" +
                    "5. Vis Goalkeepers\n" +
                    "6. Vis Defenders\n" +
                    "7. vis Midfielders\n" +
                    "8. Vis Attackers\n" +
                    "9. Luk og gem");

            String choice = input.next();

            switch (choice) {

                case "1":
                    Team.opretSpiller();
                    break;
                case "2":
                    Team.removePlayer(Team.findSpiller());
                    break;
                case "3":
                    Team.redigerSpiller();
                    break;
                case "4":
                    System.out.println(Team);
                    break;
                case "5":
                    Team.findMålmænd();
                    break;
                case "6":
                    Team.findForsvar();
                    break;
                case "7":
                    Team.findMidtbane();
                    break;
                case "8":
                    Team.findAngriber();
                    break;
                    default:
                        lavStreamPlayerList(Team);
                        System.out.println("Systemets data er gemt");
                        System.exit(0);
                        break;
            }
        }
    }
private static void lavStreamPlayerList(PlayerList players)
{
    try
    {
        File file = new File("Hold2.txt");

        FileOutputStream fos = new FileOutputStream(file);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        oos.writeObject(players);

        oos.close();
    }
    catch (FileNotFoundException eFNFE)
    {
        System.out.println("Error eFNFE");
    }
    catch (IOException eIOE)
    {
        System.out.println("Error eIOE");
        eIOE.printStackTrace();
    }
}

private static PlayerList læsPlayerList()
{
    PlayerList playerList = new PlayerList();
    try {

        File file = new File("Hold2.txt");

        FileInputStream fis = new FileInputStream(file);
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);

        playerList = (PlayerList) ois.readObject();

        ois.close();
    }
    catch (Exception e)
    {

    }
    return playerList;
}


}
