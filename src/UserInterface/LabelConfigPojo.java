package Userinterface;

import java.util.function.Supplier;

public class LabelConfigPojo {

    private Supplier<String> valueSupplier;
    private String title;
    private String unit;
    private int x;
    private int y;
    private Supplier<Boolean> showCondition;
    private String type;

    public LabelConfigPojo() {}

    public LabelConfigPojo(Supplier<String> valueSupplier, String title, String unit, int x, int y, String type) {
        this.valueSupplier = valueSupplier;
        this.title = title;
        this.unit = unit;
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public Supplier<String> getValueSupplier() { return valueSupplier; }
    public void setValueSupplier(Supplier<String> valueSupplier) { this.valueSupplier = valueSupplier; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getUnit() { return unit; }
    public void setUnit(String unit) { this.unit = unit; }

    public int getX() { return x; }
    public void setX(int x) { this.x = x; }

    public int getY() { return y; }
    public void setY(int y) { this.y = y; }

    public Supplier<Boolean> getShowSupplier() { return showCondition; }
    public void setShowSupplier(Supplier<Boolean> showSupplier) {
    this.showCondition = showSupplier;
}

    public String getType() { return type; }
    public void setType(String type) { this.type = type;}
}