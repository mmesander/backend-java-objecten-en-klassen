import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Zo werkt het ook maar niet schaalbaar:
        ApplePieRecipe applePieRecipe = new ApplePieRecipe();
        applePieRecipe.init();
        applePieRecipe.printIngredients();
        applePieRecipe.recipeSteps();

        // Zo werkt het, schaalbaar:
        ArrayList<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(new Ingredient("375", "gram", "bloem"));
        ingredients.add(new Ingredient("340", "gram", "roomboter, op kamertemperatuur"));
        ingredients.add(new Ingredient("270", "gram", "witte basterdsuiker"));
        ingredients.add(new Ingredient("1/4", "theelepel", "zout"));
        ingredients.add(new Ingredient("1/2", "stuk(s)", "vanillestokje"));
        ingredients.add(new Ingredient("1", "stuks(s)", "ei, losgeklopt"));
        ingredients.add(new Ingredient("1", "stuk(s)", "boter, om in te vetten"));


        String[] steps = {
               "Verwarm de oven voor op 170 °C. Vet een vierkante vorm van 20 bij 20 centimeter in met boter en bekleed de bodem en twee zijkanten met bakpapier. Je kunt ook een ronde (boterkoek)vorm gebruiken met een doorsnede van 22 centimeter. Neem liever geen springvorm omdat je dan kans hebt dat de boter gaat lekken tijdens het bakken.",
               "Doe alle ingrediënten voor het deeg in een kom en meng deze tot een samenhangend deeg. Doe het deeg in de vorm en druk dit plat, dat gaat het best met natte handen of de bolle kant van een natte lepel. Probeer de bovenkant goed glad te krijgen. Bestrijk het deeg met losgeklopt ei en kerf er met een vork een ruitjesmotief in.",
               "Bak de boterkoek 30-40 minuten tot de bovenkant mooi bruin is. De boterkoek zal nog erg wiebelig zijn en niet gaar lijken, maar dit komt allemaal goed tijdens het afkoelen.",
               "Druk nadat de vorm 10 minuten uit de oven is de zijkanten van de koek voorzichtig naar beneden met de bolle kant van een lepel, zodat de bovenkant van de koek overal even hoog is. Laat de boterkoek minimaal 6 uur afkoelen in de vorm en haal hem er dan met behulp van het bakpapier uit. Snijd de koek in stukjes."
        };

        Recipe butterCake = new Recipe(ingredients, steps, "Boterkoek");

        butterCake.printRecipe();


    }
}