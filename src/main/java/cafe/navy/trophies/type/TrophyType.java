package cafe.navy.trophies.type;

import cafe.navy.trophies.Trophy;
import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.List;
import java.util.UUID;

public interface TrophyType {

    @NonNull String name();

    @NonNull String id();

    @NonNull List<String> description();

}
