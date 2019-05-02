public class Solanaceae extends Vegetable{
//    Томатні
    private String origin;
    private int canBeStored;

    public Solanaceae(int calories, String nameOfVegetable, int daysFromHarvesting, String origin, int canBeStored){
        super(calories, nameOfVegetable,daysFromHarvesting, canBeStored);
        this.origin = origin;
        this.canBeStored = 20;

    }

    public String getOrigin() {
        return origin;
    }
    @Override
    public String toString(){
        return this.getNameOfVegetable() + "    calories: " + this.getСalories()
                + "    days from harvesting:" + getDaysFromHarvesting()+ "    brought from " + origin ;
    }
}
