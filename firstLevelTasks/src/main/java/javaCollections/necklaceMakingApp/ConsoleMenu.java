package javaCollections.necklaceMakingApp;

import constants.Colors;
import constants.StonesNames;
import enums.SortOrder;
import java.util.ArrayList;

public class ConsoleMenu {
    public static void main(String[] args) {
        Necklace necklace = getNecklace();
        necklace.getCost();
        necklace.getWeight();
        necklace.printStonesOnItsValue(SortOrder.ASC);
        necklace.printStonesOnItsValue(SortOrder.DESC);
        necklace.getStonesByItsClear(5, 10);
        necklace.getPreciousStones();
    }

    private static Necklace getNecklace() {
        ArrayList<Stone> stones = new ArrayList<>();
        stones.add(new Stone(StonesNames.DIAMOND, 1, 1480, 0, 10, Colors.WHITE));
        stones.add(new Stone(StonesNames.DIAMOND, 1, 1480, 0, 10, Colors.WHITE));
        stones.add(new Stone(StonesNames.DIAMOND, 1, 1480, 0, 10, Colors.WHITE));
        stones.add(new Stone(StonesNames.EMERALD, 5, 3780, 4, 8, Colors.GREEN));
        stones.add(new Stone(StonesNames.RUBY, 1, 60, 6, 3, Colors.RED));
        stones.add(new Stone(StonesNames.RUBY, 1, 60, 6, 3, Colors.RED));
        stones.add(new Stone(StonesNames.RUBY, 1, 60, 6, 3, Colors.RED));
        stones.add(new Stone(StonesNames.RUBY, 1, 60, 6, 3, Colors.RED));
        return new Necklace("Queen", 45, "white gold", stones);
    }
}
