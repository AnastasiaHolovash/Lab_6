public class Vegetable {

    private int calories;
    private String nameOfVegetable;
    private int daysFromHarvesting;
    public int canBeStored;
    public Vegetable(int calories, String nameOfVegetable, int daysFromHarvesting, int canBeStored){
        this.calories = calories;
        this.nameOfVegetable = nameOfVegetable;
        this.daysFromHarvesting = daysFromHarvesting;
        this.canBeStored = canBeStored;
    }

    public int getСalories() {
        return calories;
    }

    public String getNameOfVegetable() {
        return nameOfVegetable;
    }

    public int getDaysFromHarvesting() {
        return daysFromHarvesting;
    }


    @Override
    public String toString(){
        return nameOfVegetable + "    calories: " + calories  + "    days from harvesting:"
                + getDaysFromHarvesting();
    }

    public int compareTo(int x, int y){
        return Integer.compare(x, y);
    }

}
