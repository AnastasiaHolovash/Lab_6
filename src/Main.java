public class Main {
    public static void main(String[] args) {
        Salad salad = new Salad(5);
        salad.addVegetable(25, "Сabbage ", 2, 25);
//        salad.addVegetable(15, "Lily", 3);
        salad.addCucurbitaceae(15, "Cucumber",1, "India");
//        salad.addVegetable(9, "Carnation", 6);
        salad.addCucurbitaceae(17, "Squash  ",0, "Central America");
        salad.addSolanaceae(20, "Tomato  ",4, "Central America");
        salad.addLeguminous(292, "Bean    ",30, "Ukraine");
        System.out.println(salad);
        System.out.println("============================================================================\n");
        System.out.println("Total number of calories: "+ salad.TotalNumberOfCalories() + "\n");
        System.out.println("============================================================================\n");
        int callFrom = 10;
        int callTo = 20;
        System.out.println("Vegetables with from " + callFrom + " to " + callTo + " calories:\n");
        salad.findVegetable(callFrom, callTo);
        System.out.println("\n============================================================================\n");
        System.out.println("Sorted by freshness:");
        salad.sortWithFreshness();
        System.out.println(salad);
    }
}
