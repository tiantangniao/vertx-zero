package io.vertx.zero.ke.reliable.item;

import com.vie.hoc.HJson;
import com.vie.hoc.HNull;
import com.vie.hoc.HTry;
import com.vie.hors.ZeroException;
import com.vie.util.Jackson;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.zero.hors.ensure.RequiredFieldException;

/**
 * Required validation
 */
public class RequiredInsurer extends AbstractInsurer {
    /**
     * @param data
     * @param rule {
     *             "required":["field1","field2"]
     *             }
     * @throws ZeroException
     */
    @Override
    public void flumen(final JsonObject data, final JsonObject rule) throws ZeroException {
        // 1. If rule is null, skip
        HNull.execZero(() -> {
            // 2. extract rule from rule, only required accept
            if (rule.containsKey(Rules.REQUIRED)) {
                final JsonArray fields = Jackson.toJArray(rule.getValue(Rules.REQUIRED));
                HJson.execZero(fields, String.class, (field, index) -> {
                    // 3.Check if data contains field.
                    if (!data.containsKey(field)) {
                        // Fast throw out
                        HTry.execZero(getLogger(), new RequiredFieldException(getClass(), data, field));
                    }
                });
            }
        }, rule, data);
    }
}
