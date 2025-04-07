import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Player> footballTeam = new ArrayList<>();
        Player player1 = new Player(59, "John", 20);
        Player player2 = new Player(67, "Roger", 22);
        Player player3 = new Player(45, "Steven", 24);
        footballTeam.add(player1);
        footballTeam.add(player2);
        footballTeam.add(player3);

        // natural ordering from player comparable interface
        System.out.println("Before Sorting : " + footballTeam);
        Collections.sort(footballTeam);
        System.out.println("After Sorting : " + footballTeam);

        // ordinamento con comparatore di età
        PlayerAgeComparator playerComparator = new PlayerAgeComparator();
        Collections.sort(footballTeam, playerComparator);
        System.out.println("After Sorting : " + footballTeam);

        // ordinamento con comparatore di ranking
        PlayerRankingComparator playerComparator2 = new PlayerRankingComparator();
        Collections.sort(footballTeam, playerComparator2);
        System.out.println("After Sorting : " + footballTeam);

        // ordinamento con comparatore espresso come funzione lambda
        Comparator<Player> byAge = (Player pl1, Player pl2) -> Integer.compare(pl1.getAge(), pl2.getAge());
        Collections.sort(footballTeam, byAge);
        System.out.println("After Sorting : " + footballTeam);

        // funzione lambda come comparatore direttamente nel sort -- notare l'inversione
        // dell'ordinamento
        Collections.sort(footballTeam, (Player pl1, Player pl2) -> Integer.compare(pl2.getAge(), pl1.getAge()));
        System.out.println("After Sorting : " + footballTeam);

        // comparatore sul natural ordering di una chiave indicata via COMPARING()
        Comparator<Player> byRanking = Comparator.comparing(Player::getRanking);
        Collections.sort(footballTeam, byRanking);
        System.out.println("After Sorting : " + footballTeam);

    }

}
