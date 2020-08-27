/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.public_.tables;


import java.util.Arrays;
import java.util.List;

import nl.overheid.aerius.emissionservice.jooq.i18n.enums.LanguageCodeType;
import nl.overheid.aerius.emissionservice.jooq.public_.Keys;
import nl.overheid.aerius.emissionservice.jooq.public_.Public;
import nl.overheid.aerius.emissionservice.jooq.public_.tables.records.I18nDatasetsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * Vertaaltabel voor de verschillende datasets die beschikbaar zijn.
 * 
 * @file source/database/src/main/sql/datasets/02-tables.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class I18nDatasets extends TableImpl<I18nDatasetsRecord> {

    private static final long serialVersionUID = 120636780;

    /**
     * The reference instance of <code>public.i18n_datasets</code>
     */
    public static final I18nDatasets I18N_DATASETS = new I18nDatasets();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<I18nDatasetsRecord> getRecordType() {
        return I18nDatasetsRecord.class;
    }

    /**
     * The column <code>public.i18n_datasets.code</code>.
     */
    public final TableField<I18nDatasetsRecord, String> CODE = createField(DSL.name("code"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.i18n_datasets.language_code</code>.
     */
    public final TableField<I18nDatasetsRecord, LanguageCodeType> LANGUAGE_CODE = createField(DSL.name("language_code"), org.jooq.impl.SQLDataType.VARCHAR.nullable(false).asEnumDataType(nl.overheid.aerius.emissionservice.jooq.i18n.enums.LanguageCodeType.class), this, "");

    /**
     * The column <code>public.i18n_datasets.name</code>.
     */
    public final TableField<I18nDatasetsRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.i18n_datasets.description</code>.
     */
    public final TableField<I18nDatasetsRecord, String> DESCRIPTION = createField(DSL.name("description"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>public.i18n_datasets</code> table reference
     */
    public I18nDatasets() {
        this(DSL.name("i18n_datasets"), null);
    }

    /**
     * Create an aliased <code>public.i18n_datasets</code> table reference
     */
    public I18nDatasets(String alias) {
        this(DSL.name(alias), I18N_DATASETS);
    }

    /**
     * Create an aliased <code>public.i18n_datasets</code> table reference
     */
    public I18nDatasets(Name alias) {
        this(alias, I18N_DATASETS);
    }

    private I18nDatasets(Name alias, Table<I18nDatasetsRecord> aliased) {
        this(alias, aliased, null);
    }

    private I18nDatasets(Name alias, Table<I18nDatasetsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Vertaaltabel voor de verschillende datasets die beschikbaar zijn.\r\n\r\n@file source/database/src/main/sql/datasets/02-tables.sql"), TableOptions.table());
    }

    public <O extends Record> I18nDatasets(Table<O> child, ForeignKey<O, I18nDatasetsRecord> key) {
        super(child, key, I18N_DATASETS);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public UniqueKey<I18nDatasetsRecord> getPrimaryKey() {
        return Keys.I18N_DATASETS_PKEY;
    }

    @Override
    public List<UniqueKey<I18nDatasetsRecord>> getKeys() {
        return Arrays.<UniqueKey<I18nDatasetsRecord>>asList(Keys.I18N_DATASETS_PKEY);
    }

    @Override
    public List<ForeignKey<I18nDatasetsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<I18nDatasetsRecord, ?>>asList(Keys.I18N_DATASETS__I18N_DATASETS);
    }

    public Datasets datasets() {
        return new Datasets(this, Keys.I18N_DATASETS__I18N_DATASETS);
    }

    @Override
    public I18nDatasets as(String alias) {
        return new I18nDatasets(DSL.name(alias), this);
    }

    @Override
    public I18nDatasets as(Name alias) {
        return new I18nDatasets(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public I18nDatasets rename(String name) {
        return new I18nDatasets(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public I18nDatasets rename(Name name) {
        return new I18nDatasets(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, LanguageCodeType, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}