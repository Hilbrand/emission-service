/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.template.tables.records;


import nl.overheid.aerius.emissionservice.jooq.public_.enums.ShippingInlandShipDirectionType;
import nl.overheid.aerius.emissionservice.jooq.template.tables.ShippingInlandWaterwayCategoriesView;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;


/**
 * View retourneert de waterweg categorieen.
 * 
 * @file source/database/src/main/sql/template/02_emission_factors/04-views/shipping_inland.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ShippingInlandWaterwayCategoriesViewRecord extends TableRecordImpl<ShippingInlandWaterwayCategoriesViewRecord> implements Record4<Integer, String, String, ShippingInlandShipDirectionType> {

    private static final long serialVersionUID = -121667508;

    /**
     * Setter for <code>template.shipping_inland_waterway_categories_view.shipping_inland_waterway_category_id</code>.
     */
    public void setShippingInlandWaterwayCategoryId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>template.shipping_inland_waterway_categories_view.shipping_inland_waterway_category_id</code>.
     */
    public Integer getShippingInlandWaterwayCategoryId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>template.shipping_inland_waterway_categories_view.code</code>.
     */
    public void setCode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>template.shipping_inland_waterway_categories_view.code</code>.
     */
    public String getCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>template.shipping_inland_waterway_categories_view.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>template.shipping_inland_waterway_categories_view.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>template.shipping_inland_waterway_categories_view.ship_direction</code>.
     */
    public void setShipDirection(ShippingInlandShipDirectionType value) {
        set(3, value);
    }

    /**
     * Getter for <code>template.shipping_inland_waterway_categories_view.ship_direction</code>.
     */
    public ShippingInlandShipDirectionType getShipDirection() {
        return (ShippingInlandShipDirectionType) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, String, String, ShippingInlandShipDirectionType> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Integer, String, String, ShippingInlandShipDirectionType> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return ShippingInlandWaterwayCategoriesView.SHIPPING_INLAND_WATERWAY_CATEGORIES_VIEW.SHIPPING_INLAND_WATERWAY_CATEGORY_ID;
    }

    @Override
    public Field<String> field2() {
        return ShippingInlandWaterwayCategoriesView.SHIPPING_INLAND_WATERWAY_CATEGORIES_VIEW.CODE;
    }

    @Override
    public Field<String> field3() {
        return ShippingInlandWaterwayCategoriesView.SHIPPING_INLAND_WATERWAY_CATEGORIES_VIEW.NAME;
    }

    @Override
    public Field<ShippingInlandShipDirectionType> field4() {
        return ShippingInlandWaterwayCategoriesView.SHIPPING_INLAND_WATERWAY_CATEGORIES_VIEW.SHIP_DIRECTION;
    }

    @Override
    public Integer component1() {
        return getShippingInlandWaterwayCategoryId();
    }

    @Override
    public String component2() {
        return getCode();
    }

    @Override
    public String component3() {
        return getName();
    }

    @Override
    public ShippingInlandShipDirectionType component4() {
        return getShipDirection();
    }

    @Override
    public Integer value1() {
        return getShippingInlandWaterwayCategoryId();
    }

    @Override
    public String value2() {
        return getCode();
    }

    @Override
    public String value3() {
        return getName();
    }

    @Override
    public ShippingInlandShipDirectionType value4() {
        return getShipDirection();
    }

    @Override
    public ShippingInlandWaterwayCategoriesViewRecord value1(Integer value) {
        setShippingInlandWaterwayCategoryId(value);
        return this;
    }

    @Override
    public ShippingInlandWaterwayCategoriesViewRecord value2(String value) {
        setCode(value);
        return this;
    }

    @Override
    public ShippingInlandWaterwayCategoriesViewRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public ShippingInlandWaterwayCategoriesViewRecord value4(ShippingInlandShipDirectionType value) {
        setShipDirection(value);
        return this;
    }

    @Override
    public ShippingInlandWaterwayCategoriesViewRecord values(Integer value1, String value2, String value3, ShippingInlandShipDirectionType value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ShippingInlandWaterwayCategoriesViewRecord
     */
    public ShippingInlandWaterwayCategoriesViewRecord() {
        super(ShippingInlandWaterwayCategoriesView.SHIPPING_INLAND_WATERWAY_CATEGORIES_VIEW);
    }

    /**
     * Create a detached, initialised ShippingInlandWaterwayCategoriesViewRecord
     */
    public ShippingInlandWaterwayCategoriesViewRecord(Integer shippingInlandWaterwayCategoryId, String code, String name, ShippingInlandShipDirectionType shipDirection) {
        super(ShippingInlandWaterwayCategoriesView.SHIPPING_INLAND_WATERWAY_CATEGORIES_VIEW);

        set(0, shippingInlandWaterwayCategoryId);
        set(1, code);
        set(2, name);
        set(3, shipDirection);
    }
}