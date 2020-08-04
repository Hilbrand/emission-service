/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.template.tables;


import nl.overheid.aerius.emissionservice.jooq.template.Template;
import nl.overheid.aerius.emissionservice.jooq.template.tables.records.MachineryFuelTypesViewRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * Geeft de brandstoffen terug voor de sectoren waar werktuigen voor beschikbaar 
 * zijn.
 * Hiermee kan werktuigtype "Anders" gegeneerd worden in de UI.
 * 
 * @file source/database/src/main/sql/template/02_emission_factors/04-views/machinery_types.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MachineryFuelTypesView extends TableImpl<MachineryFuelTypesViewRecord> {

    private static final long serialVersionUID = 1597349778;

    /**
     * The reference instance of <code>template.machinery_fuel_types_view</code>
     */
    public static final MachineryFuelTypesView MACHINERY_FUEL_TYPES_VIEW = new MachineryFuelTypesView();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MachineryFuelTypesViewRecord> getRecordType() {
        return MachineryFuelTypesViewRecord.class;
    }

    /**
     * The column <code>template.machinery_fuel_types_view.sector_id</code>.
     */
    public final TableField<MachineryFuelTypesViewRecord, Integer> SECTOR_ID = createField(DSL.name("sector_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>template.machinery_fuel_types_view.machinery_fuel_type_id</code>.
     */
    public final TableField<MachineryFuelTypesViewRecord, Integer> MACHINERY_FUEL_TYPE_ID = createField(DSL.name("machinery_fuel_type_id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>template.machinery_fuel_types_view.fuel_code</code>.
     */
    public final TableField<MachineryFuelTypesViewRecord, String> FUEL_CODE = createField(DSL.name("fuel_code"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>template.machinery_fuel_types_view.fuel_name</code>.
     */
    public final TableField<MachineryFuelTypesViewRecord, String> FUEL_NAME = createField(DSL.name("fuel_name"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>template.machinery_fuel_types_view.fuel_density</code>.
     */
    public final TableField<MachineryFuelTypesViewRecord, Float> FUEL_DENSITY = createField(DSL.name("fuel_density"), org.jooq.impl.SQLDataType.REAL, this, "");

    /**
     * Create a <code>template.machinery_fuel_types_view</code> table reference
     */
    public MachineryFuelTypesView() {
        this(DSL.name("machinery_fuel_types_view"), null);
    }

    /**
     * Create an aliased <code>template.machinery_fuel_types_view</code> table reference
     */
    public MachineryFuelTypesView(String alias) {
        this(DSL.name(alias), MACHINERY_FUEL_TYPES_VIEW);
    }

    /**
     * Create an aliased <code>template.machinery_fuel_types_view</code> table reference
     */
    public MachineryFuelTypesView(Name alias) {
        this(alias, MACHINERY_FUEL_TYPES_VIEW);
    }

    private MachineryFuelTypesView(Name alias, Table<MachineryFuelTypesViewRecord> aliased) {
        this(alias, aliased, null);
    }

    private MachineryFuelTypesView(Name alias, Table<MachineryFuelTypesViewRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Geeft de brandstoffen terug voor de sectoren waar werktuigen voor beschikbaar zijn.\r\nHiermee kan werktuigtype \"Anders\" gegeneerd worden in de UI.\r\n\r\n@file source/database/src/main/sql/template/02_emission_factors/04-views/machinery_types.sql"), TableOptions.view("create view \"machinery_fuel_types_view\" as  SELECT machinery_fuel_types_to_sectors.sector_id,\n    machinery_fuel_types.machinery_fuel_type_id,\n    machinery_fuel_types.code AS fuel_code,\n    machinery_fuel_types.name AS fuel_name,\n    machinery_fuel_types.density AS fuel_density\n   FROM (template.machinery_fuel_types\n     JOIN template.machinery_fuel_types_to_sectors USING (machinery_fuel_type_id));"));
    }

    public <O extends Record> MachineryFuelTypesView(Table<O> child, ForeignKey<O, MachineryFuelTypesViewRecord> key) {
        super(child, key, MACHINERY_FUEL_TYPES_VIEW);
    }

    @Override
    public Schema getSchema() {
        return Template.TEMPLATE;
    }

    @Override
    public MachineryFuelTypesView as(String alias) {
        return new MachineryFuelTypesView(DSL.name(alias), this);
    }

    @Override
    public MachineryFuelTypesView as(Name alias) {
        return new MachineryFuelTypesView(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MachineryFuelTypesView rename(String name) {
        return new MachineryFuelTypesView(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MachineryFuelTypesView rename(Name name) {
        return new MachineryFuelTypesView(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, Integer, String, String, Float> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}