/*
 * This file is generated by jOOQ.
 */
package nl.overheid.aerius.emissionservice.jooq.template.tables.records;


import nl.overheid.aerius.emissionservice.jooq.i18n.enums.LanguageCodeType;
import nl.overheid.aerius.emissionservice.jooq.template.tables.I18nFarmAnimalCategories;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Vertaaltabel voor diercategorieën.
 * 
 * @file source/database/src/main/sql/template/02_emission_factors/i18n/farms.sql
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class I18nFarmAnimalCategoriesRecord extends UpdatableRecordImpl<I18nFarmAnimalCategoriesRecord> implements Record3<Integer, LanguageCodeType, String> {

    private static final long serialVersionUID = 1089937392;

    /**
     * Setter for <code>template.i18n_farm_animal_categories.farm_animal_category_id</code>.
     */
    public void setFarmAnimalCategoryId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>template.i18n_farm_animal_categories.farm_animal_category_id</code>.
     */
    public Integer getFarmAnimalCategoryId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>template.i18n_farm_animal_categories.language_code</code>.
     */
    public void setLanguageCode(LanguageCodeType value) {
        set(1, value);
    }

    /**
     * Getter for <code>template.i18n_farm_animal_categories.language_code</code>.
     */
    public LanguageCodeType getLanguageCode() {
        return (LanguageCodeType) get(1);
    }

    /**
     * Setter for <code>template.i18n_farm_animal_categories.description</code>.
     */
    public void setDescription(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>template.i18n_farm_animal_categories.description</code>.
     */
    public String getDescription() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<Integer, LanguageCodeType> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, LanguageCodeType, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, LanguageCodeType, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return I18nFarmAnimalCategories.I18N_FARM_ANIMAL_CATEGORIES.FARM_ANIMAL_CATEGORY_ID;
    }

    @Override
    public Field<LanguageCodeType> field2() {
        return I18nFarmAnimalCategories.I18N_FARM_ANIMAL_CATEGORIES.LANGUAGE_CODE;
    }

    @Override
    public Field<String> field3() {
        return I18nFarmAnimalCategories.I18N_FARM_ANIMAL_CATEGORIES.DESCRIPTION;
    }

    @Override
    public Integer component1() {
        return getFarmAnimalCategoryId();
    }

    @Override
    public LanguageCodeType component2() {
        return getLanguageCode();
    }

    @Override
    public String component3() {
        return getDescription();
    }

    @Override
    public Integer value1() {
        return getFarmAnimalCategoryId();
    }

    @Override
    public LanguageCodeType value2() {
        return getLanguageCode();
    }

    @Override
    public String value3() {
        return getDescription();
    }

    @Override
    public I18nFarmAnimalCategoriesRecord value1(Integer value) {
        setFarmAnimalCategoryId(value);
        return this;
    }

    @Override
    public I18nFarmAnimalCategoriesRecord value2(LanguageCodeType value) {
        setLanguageCode(value);
        return this;
    }

    @Override
    public I18nFarmAnimalCategoriesRecord value3(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public I18nFarmAnimalCategoriesRecord values(Integer value1, LanguageCodeType value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached I18nFarmAnimalCategoriesRecord
     */
    public I18nFarmAnimalCategoriesRecord() {
        super(I18nFarmAnimalCategories.I18N_FARM_ANIMAL_CATEGORIES);
    }

    /**
     * Create a detached, initialised I18nFarmAnimalCategoriesRecord
     */
    public I18nFarmAnimalCategoriesRecord(Integer farmAnimalCategoryId, LanguageCodeType languageCode, String description) {
        super(I18nFarmAnimalCategories.I18N_FARM_ANIMAL_CATEGORIES);

        set(0, farmAnimalCategoryId);
        set(1, languageCode);
        set(2, description);
    }
}