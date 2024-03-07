import java.lang.reflect.Array;
import java.util.ArrayList;

public class UltimateTeam {
    private static ArrayList<Coach> coaches = new ArrayList<Coach>();
    private static ArrayList<UltimatePlayer> ultimatePlayers = new ArrayList<UltimatePlayer>();
    public static void main(String[] args) {



        //Create Coach Objects.
        coaches.add(new Coach("Emory","George",false));
        coaches.add(new Coach("John","Jarvis",true));

        //Print Coach List.
        for (Coach c: coaches) {
            System.out.println(coaches);
            System.out.println();
        }

        //Create Player Objects.
        ultimatePlayers.add(new UltimatePlayer("Jason","Ocampo",69,"Cutter"));
        ultimatePlayers.add(new UltimatePlayer("Nick","Beres",1,"Handler"));
        ultimatePlayers.add(new UltimatePlayer("Dylan", "Boles", 21, "Cutter"));
        ultimatePlayers.add(new UltimatePlayer("John","Pork",2,"Cutter"));

        //Print Player List.
        for (UltimatePlayer p: ultimatePlayers) {
            System.out.println(ultimatePlayers);
            System.out.println();
        }

        //Down Here Is Where Post-Creation Changes Are Made.
        System.out.println(getHandlers());
        System.out.println(getCutters());

    }

    //Accessors
    public static String getCutters () {
        String cutters = "";
        for (int i = 0;i < ultimatePlayers.size(); i++) {
            if (ultimatePlayers.get(i).getPosition().equalsIgnoreCase("Cutter")) {
                cutters += ultimatePlayers.get(i) + " ";
            }
        }
        return cutters;
    }

    public static String getHandlers () {
        String handlers = "";
        for (int i = 0; i < ultimatePlayers.size(); i++) {
            if (ultimatePlayers.get(i).getPosition().equalsIgnoreCase("Handler")) {
                handlers += ultimatePlayers.get(i) + " ";
            }
        }
        return handlers;
    }

    public String toString () {
        String output;

        return "COACHES" + "\n" + super.toString();
    }


}
