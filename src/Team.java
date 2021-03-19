import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team {

    public List<Player> getAllPlayers() {
        List<Player> list = new ArrayList<>();
        list.add(new Player(1, "Marc-André ter Stegen", Position.GK));
        list.add(new Player(2, "Sergiño Dest", Position.MF));
        list.add(new Player(3, "Gerard Piqué", Position.FW));
        list.add(new Player(4, "Ronald Araújo", Position.FW));
        list.add(new Player(5, "Sergio Busquets", Position.FW));
        list.add(new Player(6, "Antoine Griezmann", Position.DF));
        list.add(new Player(7, "Martin Braithwaite", Position.DF));
        list.add(new Player(8, "Lionel Messi", Position.DF));
        list.add(new Player(9, "Ousmane Dembélé", Position.DF));
        list.add(new Player(11, "Neto", Position.DF));
        list.add(new Player(12, "Neto", Position.GK));
        list.add(new Player(13, "Clément Lenglet", Position.DF));
        list.add(new Player(14, "Pedri", Position.MF));
        list.add(new Player(15, "Francisco Trincão", Position.FW));
        list.add(new Player(16, "Jordi Alba", Position.DF));
        list.add(new Player(17, "Matheus Fernandes", Position.MF));
        list.add(new Player(18, "Sergi Roberto", Position.DF));
        list.add(new Player(19, "Frenkie de Jong", Position.MF));
        list.add(new Player(20, "Ansu Fati", Position.FW));
        list.add(new Player(21, "Samuel Umtiti", Position.DF));
        list.add(new Player(22, "Junior Firpo", Position.DF));

        return list;
    }

    // random

    public List<Player> ArrayRandomizer() {

        List<Player> listAll = getAllPlayers();
        List<Player> listSelected = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 11; i++) {
            int a = random.nextInt(16);
            Player player = listAll.get(a);
            listSelected.add(player);
        }

        return listSelected;
    }

    // random with conditons

    public List<Player> selectPlayer() {
        List<Player> listAll = getAllPlayers();
        List<Player> listSelected = new ArrayList<>();
        int numberGK = 0;
        int numberDF = 0;
        int numberMF = 0;
        int numberFW = 0;
        Random random = new Random();
        while (numberGK < 1) {
            int playerGK = random.nextInt(21);
            if (listAll.get(playerGK).getPosition().equals(Position.GK)) {
                listSelected.add(listAll.get(playerGK));
                numberGK++;
            }

        }
        while (numberDF < 4) {
            int playerDF = random.nextInt(21);
            if (listAll.get(playerDF).getPosition().equals(Position.DF)
                    && !listSelected.contains(listAll.get(playerDF))) {
                listSelected.add(listAll.get(playerDF));
                numberDF++;
            }

        }
        while (numberMF < 4) {
            int playerMF = random.nextInt(21);
            if (listAll.get(playerMF).getPosition().equals(Position.MF)
                    && !listSelected.contains(listAll.get(playerMF))) {
                listSelected.add(listAll.get(playerMF));
                numberMF++;
            }

        }

        while (numberFW < 2) {
            int playerFW = random.nextInt(21);
            if (listAll.get(playerFW).getPosition().equals(Position.FW)
                    && !listSelected.contains(listAll.get(playerFW))) {
                listSelected.add(listAll.get(playerFW));
                numberFW++;
            }
        }

        return listSelected;
    }

    public List<Player> buildTeam(int defender, int midfielder, int forwarder) {
        List<Player> listAll = getAllPlayers();
        List<Player> listSelected = new ArrayList<>();
        int numberGK = 0;
        int numberDF = 0;
        int numberMF = 0;
        int numberFW = 0;
        Random random = new Random();
        while (numberGK < 1) {
            int playerGK = random.nextInt(21);
            if (listAll.get(playerGK).getPosition().equals(Position.GK)) {
                listSelected.add(listAll.get(playerGK));
                numberGK++;
            }

        }
        while (numberDF < defender) {
            int playerDF = random.nextInt(21);
            if (listAll.get(playerDF).getPosition().equals(Position.DF)
                    && !listSelected.contains(listAll.get(playerDF))) {
                listSelected.add(listAll.get(playerDF));
                numberDF++;
            }

        }
        while (numberMF < midfielder) {
            int playerMF = random.nextInt(21);
            if (listAll.get(playerMF).getPosition().equals(Position.MF)
                    && !listSelected.contains(listAll.get(playerMF))) {
                listSelected.add(listAll.get(playerMF));
                numberMF++;
            }

        }

        while (numberFW < forwarder) {
            int playerFW = random.nextInt(21);
            if (listAll.get(playerFW).getPosition().equals(Position.FW)
                    && !listSelected.contains(listAll.get(playerFW))) {
                listSelected.add(listAll.get(playerFW));
                numberFW++;
            }
        }
        return listSelected;
    }
}
