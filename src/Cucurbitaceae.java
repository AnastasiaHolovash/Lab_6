public class Cucurbitaceae extends Vegetable{
//    Гарбузові :)

    private String origin;
    public Cucurbitaceae(int calories, String nameOfVegetable, int daysFromHarvesting, String origin){
        super(calories, nameOfVegetable,daysFromHarvesting, canBeStored);
        this.origin = origin;
        this.canBeStored = 31;
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
