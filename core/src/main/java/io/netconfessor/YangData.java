package io.netconfessor;


import java.util.Objects;

public class YangData {

    private String name;
    private String description;
    private boolean isConfig;
    private YangDataType type;
    private String xpath;

    public YangData(String name, String xpath, String description, boolean isConfig, YangDataType type) {
        this.name = name;
        this.description = description;
        this.isConfig = isConfig;
        this.type = type;
        this.xpath = xpath;
    }

    public String name() {
        return name;
    }

    public String description() {
        return description;
    }

    public String xpath() {
        return xpath;
    }

    public boolean isConfig() {
        return isConfig;
    }

    public YangDataType type() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof YangData)) {
            return false;
        }
        YangData yangData = (YangData) o;
        return isConfig == yangData.isConfig && Objects.equals(name, yangData.name) && Objects
                .equals(description, yangData.description) && type == yangData.type && Objects
                .equals(xpath, yangData.xpath);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, description, isConfig, type, xpath);
    }

    @Override
    public String toString() {
        return "YangData{" + "name='" + name + '\'' + ", description='" + description + '\'' + ", isConfig=" + isConfig
                + ", type=" + type + ", xpath='" + xpath + '\'' + '}';
    }
}
