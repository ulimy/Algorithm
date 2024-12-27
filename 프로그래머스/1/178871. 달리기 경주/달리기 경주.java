import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> race = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            race.put(players[i], i);
        }

        for (String player : callings) {
            var playerAt = race.get(player);

            if (playerAt == 0) {
                continue;
            }

            var beforePlayer = players[playerAt - 1];

            players[playerAt - 1] = player;
            players[playerAt] = beforePlayer;

            race.put(player, playerAt - 1);
            race.put(beforePlayer, playerAt);
        }

        return players;
    }

}