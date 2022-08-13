package cafe.navy.trophies.type.mob;

import cafe.navy.trophies.type.AbstractTrophyType;
import cafe.navy.trophies.type.TrophyType;
import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.List;

public class SkeletonTrophyType extends AbstractTrophyType {

    public SkeletonTrophyType() {
        super("skeleton", "Skeleton Trophy", List.of());
    }
}
