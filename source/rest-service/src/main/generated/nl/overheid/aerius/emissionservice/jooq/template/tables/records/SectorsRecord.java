/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.template.tables.records;


import nl.overheid.aerius.emissionservice.jooq.template.tables.Sectors;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Sectorindeling van AERIUS
 * 
 * @file source/database/src/main/sql/template/01_sectors/02-tables/01-sectors.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SectorsRecord extends UpdatableRecordImpl<SectorsRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = 238213137;

    /**
     * Setter for <code>template.sectors.sector_id</code>.
     */
    public void setSectorId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>template.sectors.sector_id</code>.
     */
    public Integer getSectorId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>template.sectors.description</code>.
     */
    public void setDescription(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>template.sectors.description</code>.
     */
    public String getDescription() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Sectors.SECTORS.SECTOR_ID;
    }

    @Override
    public Field<String> field2() {
        return Sectors.SECTORS.DESCRIPTION;
    }

    @Override
    public Integer component1() {
        return getSectorId();
    }

    @Override
    public String component2() {
        return getDescription();
    }

    @Override
    public Integer value1() {
        return getSectorId();
    }

    @Override
    public String value2() {
        return getDescription();
    }

    @Override
    public SectorsRecord value1(Integer value) {
        setSectorId(value);
        return this;
    }

    @Override
    public SectorsRecord value2(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public SectorsRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SectorsRecord
     */
    public SectorsRecord() {
        super(Sectors.SECTORS);
    }

    /**
     * Create a detached, initialised SectorsRecord
     */
    public SectorsRecord(Integer sectorId, String description) {
        super(Sectors.SECTORS);

        set(0, sectorId);
        set(1, description);
    }
}