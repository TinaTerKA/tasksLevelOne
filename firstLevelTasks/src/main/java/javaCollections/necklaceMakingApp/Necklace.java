package javaCollections.necklaceMakingApp;

import enums.SortOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.ArrayList;
import java.util.Comparator;

@Data
@AllArgsConstructor
public class Necklace {
    private String name;
    private int size;
    private String metal;
    private ArrayList<Stone> stones;

    public void printStonesOnItsValue(SortOrder order) {
        switch (order){
            case ASC:
                stones.stream().sorted(Comparator.comparing(Stone::getCostUSA)).forEach(System.out::println);
                break;
            case DESC:
                stones.stream().sorted(Comparator.comparing(Stone::getCostUSA).reversed()).forEach(System.out::println);
                break;
        }
    }

    public int getWeight(){
       return stones.stream().mapToInt(Stone::getCaratWeight).sum();
       }

    public int getCost(){
        return stones.stream().mapToInt(Stone::getCostUSA).sum();
    }

    public ArrayList getStonesByItsClear(int lowerClear, int HigherClear){
        ArrayList<Stone> stonesByItsClear = new ArrayList<>();
        for (Stone a: stones) {
            if(a.getClear() < lowerClear && a.getClear() < HigherClear){
                stonesByItsClear.add(a);
            }
        }
        return stones;
    }

    public ArrayList getPreciousStones(){
        ArrayList<Stone> preciousStones = new ArrayList<>();
        for (Stone a: stones) {
            if(a.isGemstone()){
                preciousStones.add(a);
            }
        }
        return preciousStones;
    }
}
