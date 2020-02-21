package javaCollections.necklaceMakingApp;

import lombok.*;

@Data
@AllArgsConstructor
public class Stone {
    private String name;
    private int caratWeight;
    private int costUSA;
    private int clear;
    private int hardness;
    private String color;

    public boolean isGemstone() {
        return (this.hardness >= 8 && this.clear < 5);
    }
}
