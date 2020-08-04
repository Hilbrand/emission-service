/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.template.tables;


import java.util.Arrays;
import java.util.List;

import nl.overheid.aerius.emissionservice.jooq.public_.tables.Substances;
import nl.overheid.aerius.emissionservice.jooq.template.Keys;
import nl.overheid.aerius.emissionservice.jooq.template.Template;
import nl.overheid.aerius.emissionservice.jooq.template.tables.records.RoadCategoryEmissionFactorsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * De emissie factoren voor verschillende soorten verkeer bij verschillende 
 * snelheidstyperingen voor verschillende soorten stoffen.
 * De emissie factors zijn hier in g/voertuig/km.
 * 
 * LET OP: De jaren die in deze tabel voorkomen zijn niet per definitie gelijk 
 * aan de AERIUS beleidsjaren.
 * 
 * @file source/database/src/main/sql/template/02_emission_factors/02-tables/roads.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RoadCategoryEmissionFactors extends TableImpl<RoadCategoryEmissionFactorsRecord> {

    private static final long serialVersionUID = 1410781949;

    /**
     * The reference instance of <code>template.road_category_emission_factors</code>
     */
    public static final RoadCategoryEmissionFactors ROAD_CATEGORY_EMISSION_FACTORS = new RoadCategoryEmissionFactors();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RoadCategoryEmissionFactorsRecord> getRecordType() {
        return RoadCategoryEmissionFactorsRecord.class;
    }

    /**
     * The column <code>template.road_category_emission_factors.road_category_id</code>.
     */
    public final TableField<RoadCategoryEmissionFactorsRecord, Integer> ROAD_CATEGORY_ID = createField(DSL.name("road_category_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>template.road_category_emission_factors.road_speed_profile_id</code>.
     */
    public final TableField<RoadCategoryEmissionFactorsRecord, Integer> ROAD_SPEED_PROFILE_ID = createField(DSL.name("road_speed_profile_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>template.road_category_emission_factors.year</code>.
     */
    public final TableField<RoadCategoryEmissionFactorsRecord, Short> YEAR = createField(DSL.name("year"), org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>template.road_category_emission_factors.substance_id</code>.
     */
    public final TableField<RoadCategoryEmissionFactorsRecord, Short> SUBSTANCE_ID = createField(DSL.name("substance_id"), org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>template.road_category_emission_factors.emission_factor</code>.
     */
    public final TableField<RoadCategoryEmissionFactorsRecord, Double> EMISSION_FACTOR = createField(DSL.name("emission_factor"), org.jooq.impl.SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>template.road_category_emission_factors.stagnated_emission_factor</code>.
     */
    public final TableField<RoadCategoryEmissionFactorsRecord, Double> STAGNATED_EMISSION_FACTOR = createField(DSL.name("stagnated_emission_factor"), org.jooq.impl.SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * Create a <code>template.road_category_emission_factors</code> table reference
     */
    public RoadCategoryEmissionFactors() {
        this(DSL.name("road_category_emission_factors"), null);
    }

    /**
     * Create an aliased <code>template.road_category_emission_factors</code> table reference
     */
    public RoadCategoryEmissionFactors(String alias) {
        this(DSL.name(alias), ROAD_CATEGORY_EMISSION_FACTORS);
    }

    /**
     * Create an aliased <code>template.road_category_emission_factors</code> table reference
     */
    public RoadCategoryEmissionFactors(Name alias) {
        this(alias, ROAD_CATEGORY_EMISSION_FACTORS);
    }

    private RoadCategoryEmissionFactors(Name alias, Table<RoadCategoryEmissionFactorsRecord> aliased) {
        this(alias, aliased, null);
    }

    private RoadCategoryEmissionFactors(Name alias, Table<RoadCategoryEmissionFactorsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("De emissie factoren voor verschillende soorten verkeer bij verschillende snelheidstyperingen voor verschillende soorten stoffen.\r\nDe emissie factors zijn hier in g/voertuig/km.\r\n\r\nLET OP: De jaren die in deze tabel voorkomen zijn niet per definitie gelijk aan de AERIUS beleidsjaren.\r\n\r\n@file source/database/src/main/sql/template/02_emission_factors/02-tables/roads.sql"), TableOptions.table());
    }

    public <O extends Record> RoadCategoryEmissionFactors(Table<O> child, ForeignKey<O, RoadCategoryEmissionFactorsRecord> key) {
        super(child, key, ROAD_CATEGORY_EMISSION_FACTORS);
    }

    @Override
    public Schema getSchema() {
        return Template.TEMPLATE;
    }

    @Override
    public UniqueKey<RoadCategoryEmissionFactorsRecord> getPrimaryKey() {
        return Keys.ROAD_CATEGORY_EMISSION_FACTORS_PKEY;
    }

    @Override
    public List<UniqueKey<RoadCategoryEmissionFactorsRecord>> getKeys() {
        return Arrays.<UniqueKey<RoadCategoryEmissionFactorsRecord>>asList(Keys.ROAD_CATEGORY_EMISSION_FACTORS_PKEY);
    }

    @Override
    public List<ForeignKey<RoadCategoryEmissionFactorsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<RoadCategoryEmissionFactorsRecord, ?>>asList(Keys.ROAD_CATEGORY_EMISSION_FACTORS__ROAD_CATEGORY_EMISSION_FACTORS_FKEY_ROAD_CATEGORIES, Keys.ROAD_CATEGORY_EMISSION_FACTORS__ROAD_CATEGORY_EMISSION_FACTORS_FKEY_ROAD_SPEED_PROFILES, Keys.ROAD_CATEGORY_EMISSION_FACTORS__ROAD_CATEGORY_EMISSION_FACTORS_FKEY_SUBSTANCES);
    }

    public RoadCategories roadCategories() {
        return new RoadCategories(this, Keys.ROAD_CATEGORY_EMISSION_FACTORS__ROAD_CATEGORY_EMISSION_FACTORS_FKEY_ROAD_CATEGORIES);
    }

    public RoadSpeedProfiles roadSpeedProfiles() {
        return new RoadSpeedProfiles(this, Keys.ROAD_CATEGORY_EMISSION_FACTORS__ROAD_CATEGORY_EMISSION_FACTORS_FKEY_ROAD_SPEED_PROFILES);
    }

    public Substances substances() {
        return new Substances(this, Keys.ROAD_CATEGORY_EMISSION_FACTORS__ROAD_CATEGORY_EMISSION_FACTORS_FKEY_SUBSTANCES);
    }

    @Override
    public RoadCategoryEmissionFactors as(String alias) {
        return new RoadCategoryEmissionFactors(DSL.name(alias), this);
    }

    @Override
    public RoadCategoryEmissionFactors as(Name alias) {
        return new RoadCategoryEmissionFactors(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RoadCategoryEmissionFactors rename(String name) {
        return new RoadCategoryEmissionFactors(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RoadCategoryEmissionFactors rename(Name name) {
        return new RoadCategoryEmissionFactors(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, Integer, Short, Short, Double, Double> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}