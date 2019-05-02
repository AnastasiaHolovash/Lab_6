import java.util.Arrays;

public class Salad {
    private int numOfIngredients;
    private Vegetable[] vegetables;
    private int counter = 0;

    public Salad(int numOfIngredients) {
        this.numOfIngredients = numOfIngredients;
        vegetables = new Vegetable[numOfIngredients];
    }

    public void addVegetable(int calories, String nameOfVegetable, int daysFromHarvesting) {
        if (counter < numOfIngredients) {
            vegetables[counter++] = new Vegetable(calories, nameOfVegetable, daysFromHarvesting);
        } else {
            System.out.println("The plate is full!");
        }
    }

    public void addCucurbitaceae(int calories, String nameOfVegetable, int daysFromHarvesting, String origin) {
        if (counter < numOfIngredients) {
            vegetables[counter++] = new Cucurbitaceae(calories, nameOfVegetable, daysFromHarvesting, origin);
        } else {
            System.out.println("The plate is full!");
        }
    }

    public void addSolanaceae(int calories, String nameOfVegetable, int daysFromHarvesting, String origin) {
        if (counter < numOfIngredients) {
            vegetables[counter++] = new Solanaceae(calories, nameOfVegetable, daysFromHarvesting, origin);
        } else {
            System.out.println("The plate is full!");
        }
    }

    public void addLeguminous(int calories, String nameOfVegetable, int daysFromHarvesting, String origin) {
        if (counter < numOfIngredients) {
            vegetables[counter++] = new Leguminous(calories, nameOfVegetable, daysFromHarvesting, origin);
        } else {
            System.out.println("The plate is full!");
        }
    }


    @Override
    public String toString() {
        String res = "Amount of salad ingredients: " + counter + "\n";
        for (int i = 0; i < counter; i++) {
            res += vegetables[i].toString() + '\n';
        }
        return res;
    }

    public int TotalNumberOfCalories() {
        int totalNumberOfCalories = 0;
        for (int i = 0; i < vegetables.length; i++) {
            totalNumberOfCalories += vegetables[i].getСalories();
        }
        return totalNumberOfCalories;
    }

    public void findVegetable(int from, int to) {
        for (int i = 0; i < vegetables.length; i++) {
            if (vegetables[i].getСalories() >= from && vegetables[i].getСalories() <= to) {
                System.out.println(vegetables[i]);
            }

        }
    }

    public void sortWithFreshness() {
        Arrays.sort(vegetables, new ComparatorByFreshness());
    }

}
