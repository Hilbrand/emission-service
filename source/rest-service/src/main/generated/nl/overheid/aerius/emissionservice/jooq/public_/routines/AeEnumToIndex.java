/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.public_.routines;


import nl.overheid.aerius.emissionservice.jooq.public_.Public;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AeEnumToIndex extends AbstractRoutine<Integer> {

    private static final long serialVersionUID = -2023736011;

    /**
     * The parameter <code>public.ae_enum_to_index.RETURN_VALUE</code>.
     */
    public static final Parameter<Integer> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> ANYENUM = Internal.createParameter("anyenum", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"anyenum\""), false, false);

    /**
     * Create a new routine call instance
     */
    public AeEnumToIndex() {
        super("ae_enum_to_index", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER);

        setReturnParameter(RETURN_VALUE);
        addInParameter(ANYENUM);
    }

    /**
     * Set the <code>anyenum</code> parameter IN value to the routine
     */
    public void setAnyenum(Object value) {
        setValue(ANYENUM, value);
    }

    /**
     * Set the <code>anyenum</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setAnyenum(Field<Object> field) {
        setField(ANYENUM, field);
    }
}