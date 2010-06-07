package com.gooddata.modeling.model;

/**
 * GoodData LDM schema column
 *
 * @author zd <zd@gooddata.com>
 * @version 1.0
 */
public class SourceColumn {

    // metadata names
    public final static String LDM_TYPE_ATTRIBUTE = "ATTRIBUTE";
    public final static String LDM_TYPE_FACT = "FACT";
    public final static String LDM_TYPE_LABEL = "LABEL";
    public final static String LDM_TYPE_DATE = "DATE";
	public static final String LDM_TYPE_CONNECTION_POINT = "CONNECTION_POINT";
	public static final String LDM_TYPE_REFERENCE = "REFERENCE";

    /**
     * Column name
     */
    private String name;
    /**
     * Column title
     */
    private String title;
    /**
     * Column LDM type (ATTRIBUTE | LABEL | FACT)
     */
    private String ldmType;
    /**
     * LABEL's or REFERENCE's primary source column
     */
    private String pk;

    /**
     * REFERENCE's primary source schema
     */
    private String pkSchema;

    /**
     * Column's folder
     */
    private String folder;
    /**
     * Column's format
     */
    private String format;    


    /**
     * SourceColumn constructor
     * @param name columna name
     * @param ldmType column LDM type
     * @param title column type
     * @param folder column folder
     * @param pk LABEL's OR REFERENCE's primary source column
     * @param pkSchema LABEL's OR REFERENCE's primary source schema
     */
    public SourceColumn(String name, String ldmType, String title, String folder, String pk, String pkSchema) {
        this.name = name;
        this.title = title;
        this.folder = folder;
        this.ldmType = ldmType;
        this.pk = pk;
        this.pkSchema = pkSchema;
    }

    /**
     * SourceColumn constructor
     * @param name columna name
     * @param ldmType column LDM type
     * @param title column type
     * @param folder column folder
     * @param pk LABELs primary attribute
     */
    public SourceColumn(String name, String ldmType, String title, String folder, String pk) {
        this.name = name;
        this.title = title;
        this.folder = folder;
        this.ldmType = ldmType;
        this.pk = pk;
    }

    /**
     * Constructor
     * @param name column name
     * @param ldmType LDM type
     * @param title title
     * @param folder enclosing folder
     * @throws com.gooddata.exceptions.ModelException issue with a model consistency
     */
    public SourceColumn(String name, String ldmType, String title, String folder) {
        this(name, ldmType, title, folder, null);
    }

    /**
     * Constructor
     * @param name column name
     * @param ldmType LDM type
     * @param title title
     * @throws com.gooddata.exceptions.ModelException issue with a model consistency
     */
    public SourceColumn(String name, String ldmType, String title) {
        this(name, ldmType, title, null, null);
    }

    /**
     * Column's name getter
     * @return column name
     */
    public String getName() {
        return name;
    }

    /**
     * Column's name setter
     * @param name column's name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Column's LDM type getter
     * @return column LDM type
     */
    public String getLdmType() {
        return ldmType;
    }

    /**
     * Column's LDM type setter
     * @param ldmType column's LDM type (ATTRIBUTE | LABEL | FACT)
     */
    public void setLdmType(String ldmType) {
        this.ldmType = ldmType;
    }

    /**
     * LABEL's or REFERENCE's primary source column getter
     * @return LABEL's or REFERENCE's primary source column
     */
    public String getPk() {
        return pk;
    }

    /**
     * LABEL's or REFERENCE's primary source column setter
     * @param pk LABEL's or REFERENCE's primary source column
     */
    public void setPk(String pk) {
        this.pk = pk;
    }

    /**
     * LABEL's or REFERENCE's primary source schema getter
     * @return LABEL's or REFERENCE's primary source schema
     */
    public String getPkSchema() {
        return pkSchema;
    }

    /**
     * LABEL's or REFERENCE's primary source schema setter
     * @param pks LABEL's or REFERENCE's primary source schema
     */
    public void setPkSchema(String pks) {
        this.pkSchema = pks;
    }

    /**
     * Column's title getter
     * @return column title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Column's title setter
     * @param title column's title
     */    
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Column's folder getter
     * @return column folder
     */
    public String getFolder() {
        return folder;
    }

    /**
     * Column's folder setter
     * @param folder column's folder
     */    
    public void setFolder(String folder) {
        this.folder = folder;
    }

    /**
     * Format getter
     * @return column format
     */
    public String getFormat() {
        return format;
    }

    /**
     * Format setter
     * @param format column format
     */
    public void setFormat(String format) {
        this.format = format;
    }

}
