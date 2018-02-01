package io.vertx.up.rs.announce;

import io.vertx.up.atom.Rule;
import io.vertx.up.exception.WebException;

import java.util.List;
import java.util.Map;

public interface Rigor {

    WebException verify(final Map<String, List<Rule>> rulers,
                        final Object value);

    static Rigor get(final Class<?> clazz) {
        return Pool.RIGORS.get(clazz);
    }
}
