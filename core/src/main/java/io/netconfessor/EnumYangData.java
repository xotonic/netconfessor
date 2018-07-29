package io.netconfessor;

import java.util.Arrays;

public class EnumYangData<T extends YangEnumeration> extends LeafYangData<T> {

    private String[] enums;

    public EnumYangData(String name,
                        String tagpath,
                        String description,
                        boolean isConfig,
                        YangDataType type,
                        String typeDescription,
                        YangTypeFactory<T> typeFactory,
                        String[] enums) {
        super(name, tagpath, description, isConfig, type, typeDescription, typeFactory);
        this.enums = enums;
    }

    public String[] enums() {
        return enums;
    }

    @Override
    public String toString() {
        return "EnumYangData{" + "enums=" + Arrays.toString(enums) + "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EnumYangData)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        EnumYangData<?> that = (EnumYangData<?>) o;
        return Arrays.equals(enums, that.enums);
    }

    @Override
    public int hashCode() {

        int result = super.hashCode();
        result = 31 * result + Arrays.hashCode(enums);
        return result;
    }
}
