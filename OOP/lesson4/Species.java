public enum Species {
    CAT(false, 4, true),
    DOG(false, 4, true),
    BIRD(true, 2, false),
    FISH(false, 0, false),
    SNAKE(false, 0, false);

    private final boolean canFly;
    private final int numberOfLegs;
    private final boolean hasFur;

    Species(boolean canFly, int numberOfLegs, boolean hasFur) {
        this.canFly = canFly;
        this.numberOfLegs = numberOfLegs;
        this.hasFur = hasFur;
    }

    @Override
    public String toString() {
        return String.format("Species{canFly=%b, numberOfLegs=%d, hasFur=%b}",
                canFly, numberOfLegs, hasFur);
    }
}