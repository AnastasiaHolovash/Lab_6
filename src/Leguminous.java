public class Leguminous extends Vegetable{
//    Зернобобові
    private String origin;
    private int canBeStored;

    public Leguminous(int calories, String nameOfVegetable, int daysFromHarvesting, String origin, int canBeStored){
        super(calories, nameOfVegetable,daysFromHarvesting, canBeStored);
        this.origin = origin;
        this.canBeStored = 55;

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
