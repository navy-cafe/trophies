package cafe.navy.trophies.type;

import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.List;

public class AbstractTrophyType implements TrophyType{

    private final @NonNull String id;
    private final @NonNull String name;
    private final @NonNull List<@NonNull String> description;

    public AbstractTrophyType(final @NonNull String id,
                              final @NonNull String name,
                              final @NonNull List<@NonNull String> description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    @Override
    public @NonNull String name() {
        return this.name;
    }

    @Override
    public @NonNull String id() {
        return this.id;
    }

    @Override
    public @NonNull List<@NonNull String> description() {
        return this.description;
    }

}
