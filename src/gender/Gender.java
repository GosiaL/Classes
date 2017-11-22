package gender;

public enum Gender {
    MEN(false, false, true), WOMEN(true, true, false);

    private boolean hasLongHair;
    private boolean hasMakeup;
    private boolean hasMustage;

    Gender(boolean hasLongHair, boolean hasMakeup, boolean hasMustage) {
        this.hasLongHair = hasLongHair;
        this.hasMakeup = hasMakeup;
        this.hasMustage = hasMustage;
    }

    public boolean isHasLongHair() {
        return hasLongHair;
    }

    public void setHasLongHair(boolean hasLongHair) {
        this.hasLongHair = hasLongHair;
    }

    public boolean isHasMakeup() {
        return hasMakeup;
    }

    public void setHasMakeup(boolean hasMakeup) {
        this.hasMakeup = hasMakeup;
    }

    public boolean isHasMustage() {
        return hasMustage;
    }

    public void setHasMustage(boolean hasMustage) {
        this.hasMustage = hasMustage;
    }
}
