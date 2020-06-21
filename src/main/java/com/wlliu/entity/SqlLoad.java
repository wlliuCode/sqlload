package com.wlliu.entity;

public class SqlLoad {
    private String tableName;
    private String signalFile;
    private String cmdSql;
    private String piDate;
    private String piNumber;

    public SqlLoad() {
    }

    public SqlLoad(String tableName, String signalFile, String cmdSql, String piDate, String piNumber) {
        this.tableName = tableName;
        this.signalFile = signalFile;
        this.cmdSql = cmdSql;
        this.piDate = piDate;
        this.piNumber = piNumber;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getSignalFile() {
        return signalFile;
    }

    public void setSignalFile(String signalFile) {
        this.signalFile = signalFile;
    }

    public String getCmdSql() {
        return cmdSql;
    }

    public void setCmdSql(String cmdSql) {
        this.cmdSql = cmdSql;
    }

    public String getPiDate() {
        return piDate;
    }

    public void setPiDate(String piDate) {
        this.piDate = piDate;
    }

    public String getPiNumber() {
        return piNumber;
    }

    public void setPiNumber(String piNumber) {
        this.piNumber = piNumber;
    }
}
