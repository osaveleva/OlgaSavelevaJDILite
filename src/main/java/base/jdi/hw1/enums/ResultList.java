package base.jdi.hw1.enums;

public enum ResultList {
    SUMMARY("Summary: "),
    NAME("Name: "),
    ELEMENTS("Elements: "),
    COLOR("Color: "),
    METAL("Metal: "),
    VEGETABLES("Vegetables: ");

    public String value;

    ResultList(String value) {
        this.value = value;
    }
}
