/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.template.tables;


import java.util.Arrays;
import java.util.List;

import nl.overheid.aerius.emissionservice.jooq.i18n.enums.LanguageCodeType;
import nl.overheid.aerius.emissionservice.jooq.template.Keys;
import nl.overheid.aerius.emissionservice.jooq.template.Template;
import nl.overheid.aerius.emissionservice.jooq.template.tables.records.I18nFarmLodgingTypesRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * Vertaaltabel voor stalsystemen.
 * 
 * @file source/database/src/main/sql/template/02_emission_factors/i18n/farms.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class I18nFarmLodgingTypes extends TableImpl<I18nFarmLodgingTypesRecord> {

    private static final long serialVersionUID = 1285247836;

    /**
     * The reference instance of <code>template.i18n_farm_lodging_types</code>
     */
    public static final I18nFarmLodgingTypes I18N_FARM_LODGING_TYPES = new I18nFarmLodgingTypes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<I18nFarmLodgingTypesRecord> getRecordType() {
        return I18nFarmLodgingTypesRecord.class;
    }

    /**
     * The column <code>template.i18n_farm_lodging_types.farm_lodging_type_id</code>.
     */
    public final TableField<I18nFarmLodgingTypesRecord, Integer> FARM_LODGING_TYPE_ID = createField(DSL.name("farm_lodging_type_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>template.i18n_farm_lodging_types.language_code</code>.
     */
    public final TableField<I18nFarmLodgingTypesRecord, LanguageCodeType> LANGUAGE_CODE = createField(DSL.name("language_code"), org.jooq.impl.SQLDataType.VARCHAR.nullable(false).asEnumDataType(nl.overheid.aerius.emissionservice.jooq.i18n.enums.LanguageCodeType.class), this, "");

    /**
     * The column <code>template.i18n_farm_lodging_types.description</code>.
     */
    public final TableField<I18nFarmLodgingTypesRecord, String> DESCRIPTION = createField(DSL.name("description"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>template.i18n_farm_lodging_types</code> table reference
     */
    public I18nFarmLodgingTypes() {
        this(DSL.name("i18n_farm_lodging_types"), null);
    }

    /**
     * Create an aliased <code>template.i18n_farm_lodging_types</code> table reference
     */
    public I18nFarmLodgingTypes(String alias) {
        this(DSL.name(alias), I18N_FARM_LODGING_TYPES);
    }

    /**
     * Create an aliased <code>template.i18n_farm_lodging_types</code> table reference
     */
    public I18nFarmLodgingTypes(Name alias) {
        this(alias, I18N_FARM_LODGING_TYPES);
    }

    private I18nFarmLodgingTypes(Name alias, Table<I18nFarmLodgingTypesRecord> aliased) {
        this(alias, aliased, null);
    }

    private I18nFarmLodgingTypes(Name alias, Table<I18nFarmLodgingTypesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Vertaaltabel voor stalsystemen.\r\n\r\n@file source/database/src/main/sql/template/02_emission_factors/i18n/farms.sql"), TableOptions.table());
    }

    public <O extends Record> I18nFarmLodgingTypes(Table<O> child, ForeignKey<O, I18nFarmLodgingTypesRecord> key) {
        super(child, key, I18N_FARM_LODGING_TYPES);
    }

    @Override
    public Schema getSchema() {
        return Template.TEMPLATE;
    }

    @Override
    public UniqueKey<I18nFarmLodgingTypesRecord> getPrimaryKey() {
        return Keys.I18N_FARM_LODGING_TYPES_PKEY;
    }

    @Override
    public List<UniqueKey<I18nFarmLodgingTypesRecord>> getKeys() {
        return Arrays.<UniqueKey<I18nFarmLodgingTypesRecord>>asList(Keys.I18N_FARM_LODGING_TYPES_PKEY);
    }

    @Override
    public List<ForeignKey<I18nFarmLodgingTypesRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<I18nFarmLodgingTypesRecord, ?>>asList(Keys.I18N_FARM_LODGING_TYPES__I18N_FARM_LODGING_TYPES_FKEY);
    }

    public FarmLodgingTypes farmLodgingTypes() {
        return new FarmLodgingTypes(this, Keys.I18N_FARM_LODGING_TYPES__I18N_FARM_LODGING_TYPES_FKEY);
    }

    @Override
    public I18nFarmLodgingTypes as(String alias) {
        return new I18nFarmLodgingTypes(DSL.name(alias), this);
    }

    @Override
    public I18nFarmLodgingTypes as(Name alias) {
        return new I18nFarmLodgingTypes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public I18nFarmLodgingTypes rename(String name) {
        return new I18nFarmLodgingTypes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public I18nFarmLodgingTypes rename(Name name) {
        return new I18nFarmLodgingTypes(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, LanguageCodeType, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}