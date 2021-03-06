public class Solanaceae extends Vegetable {
    //    Томатні
    private String origin;

    public Solanaceae(int calories, String nameOfVegetable, int daysFromHarvesting, String origin) {
        super(calories, nameOfVegetable, daysFromHarvesting);
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }

    @Override
    public String toString() {
        return this.getNameOfVegetable() + "    calories: " + this.getСalories()
                + "    days from harvesting:" + getDaysFromHarvesting() + "    brought from " + origin;
    }
}
