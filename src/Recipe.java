import java.util.ArrayList;

public class Recipe {
    private ArrayList<Ingredient> ingredients = new ArrayList<>();
    private String[] steps;
    private String name;

    public Recipe(ArrayList<Ingredient> ingredients, String[] steps, String name) {
        this.ingredients = ingredients;
        this.steps = steps;
        this.name = name;
    }

    public void printRecipe() {
        // Titel uitprinten
        System.out.println("---------------------");
        System.out.println("Recept voor " + name);
        System.out.println(" ");

        // Ingredienten uitprinten
        System.out.println("Ingredienten: ");
        System.out.println(" ");
        for (Ingredient ingredient : ingredients) {
            System.out.println("- " + ingredient.getAmount() + " " + ingredient.getUnit() + " " + ingredient.getName());
        }

        // Stappen uitprinten
        System.out.println(" ");
        for (int i = 0; i < steps.length; i++) {
            System.out.println((i + 1) + ". " + getSteps()[i]);
        }
        System.out.println("---------------------");
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public String[] getSteps() {
        return steps;
    }

    public void setSteps(String[] steps) {
        this.steps = steps;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
