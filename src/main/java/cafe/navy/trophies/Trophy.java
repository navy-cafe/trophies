package cafe.navy.trophies;

import cafe.navy.trophies.type.TrophyType;
import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.UUID;

public class Trophy {

    private final @NonNull UUID trophyUuid;
    private final @NonNull UUID ownerUuid;
    private final @NonNull TrophyType type;

    public Trophy(final @NonNull UUID trophyUuid,
                  final @NonNull UUID ownerUuid,
                  final @NonNull TrophyType type) {
        this.trophyUuid = trophyUuid;
        this.ownerUuid = ownerUuid;
        this.type = type;
    }

}
