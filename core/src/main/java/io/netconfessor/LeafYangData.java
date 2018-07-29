package io.netconfessor;


import java.util.Objects;

public class LeafYangData<T extends YangType> extends YangData {

    private String typeDescription;
    private YangTypeFactory<T> typeFactory;

    // TODO add descriptions of restrictions of type and leaf itself


    public LeafYangData(String name,
                        String tagpath,
                        String description,
                        boolean isConfig,
                        YangDataType type,
                        String typeDescription,
                        YangTypeFactory<T> typeFactory) {
        super(name, tagpath, description, isConfig, type);
        this.typeDescription = typeDescription;
        this.typeFactory = typeFactory;
    }

    public String typeDescription() {
        return typeDescription;
    }

    public YangTypeFactory<T> typeFactory() {
        return typeFactory;
    }

    @Override
    public String toString() {
        return "LeafYangData{"
                + "typeDescription='" + typeDescription
                + '\'' + ", typeFactory=" + typeFactory + "} "
                + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LeafYangData)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        LeafYangData<?> that = (LeafYangData<?>) o;
        return Objects.equals(typeDescription, that.typeDescription) && Objects.equals(typeFactory, that.typeFactory);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), typeDescription, typeFactory);
    }
}
