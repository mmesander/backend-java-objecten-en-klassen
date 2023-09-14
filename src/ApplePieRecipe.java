import java.util.ArrayList;

public class ApplePieRecipe {

    ArrayList<Ingredient> ingredients = new ArrayList<>();

    public void init() {
        ingredients.add(new Ingredient("200", "gram", "ongezouten roomboter"));
        ingredients.add(new Ingredient("200", "gram", "witte bastard suiker"));
        ingredients.add(new Ingredient("400", "gram", "zelfrijzend bakmeel"));
        ingredients.add(new Ingredient("1", "stuk(s)", "ei"));
        ingredients.add(new Ingredient("8", "gram", "vanillesuiker"));
        ingredients.add(new Ingredient("1", "snuf", "zout"));
        ingredients.add(new Ingredient("1.5", "kilo", "zoetzure appels"));
        ingredients.add(new Ingredient("75", "gram", "kristal suiker"));
        ingredients.add(new Ingredient("3", "theelepels", "kaneel"));
        ingredients.add(new Ingredient("15 ", "gram", "paneermeel"));

        // Kan ook zo opgeschreven worden:
//        Ingredient ingredient1 = new Ingredient("200", "gram", "ongezouten roomboter");
//        Ingredient ingredient2 = new Ingredient("200", "gram", "witte bastard suiker");
//        Ingredient ingredient3 = new Ingredient("400", "gram", "zelfrijzend bakmeel");
//        Ingredient ingredient4 = new Ingredient("1", "stuk(s)", "ei");
//        Ingredient ingredient5 = new Ingredient("8", "gram", "vanillesuiker");
//        Ingredient ingredient6 = new Ingredient("1", "snuf", "zout");
//        Ingredient ingredient7 = new Ingredient("1.5", "kilo", "zoetzure appels");
//        Ingredient ingredient8 = new Ingredient("75", "gram", "kristal suiker");
//        Ingredient ingredient9 = new Ingredient("3", "theelepels", "kaneel");
//        Ingredient ingredient10 = new Ingredient("15 ", "gram", "paneermeel");
//
//        ingredients.add(ingredient1);
//        ingredients.add(ingredient2);
//        ingredients.add(ingredient3);
//        ingredients.add(ingredient4);
//        ingredients.add(ingredient5);
//        ingredients.add(ingredient6);
//        ingredients.add(ingredient7);
//        ingredients.add(ingredient8);
//        ingredients.add(ingredient9);
//        ingredients.add(ingredient10);
    }

    public void recipeSteps() {
        String[] steps = {
                "Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)",
                "Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.",
                "Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.",
                "Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.",
                "Vet de springvorm in en bestrooi deze met bloem",
                "Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.",
                "Doe de heft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.",
                "Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.",
                "Leg de stroken kuislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken",
                "Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin."
        };

        System.out.println(" ");
        for (int i = 0; i < steps.length; i++) {
            System.out.println((i + 1) + ". " + steps[i]);
        }
        System.out.println("---------------------");
    }

    public void printIngredients() {
        System.out.println("---------------------");
        System.out.println("Recept voor Appeltaart");
        System.out.println(" ");
        System.out.println("Ingredienten: ");
        System.out.println(" ");
        for (Ingredient ingredient : ingredients) {
            System.out.println("- " + ingredient.getAmount() + " " + ingredient.getUnit() + " " + ingredient.getName());
        }
    }
}
