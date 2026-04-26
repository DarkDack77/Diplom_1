package praktikum;

import org.junit.Test;
import static org.junit.Assert.*;

public class IngredientTest {

    @Test
    public void shouldReturnCorrectType() {
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "hot sauce", 100.0f);

        assertEquals(IngredientType.SAUCE, ingredient.getType());
    }

    @Test
    public void shouldReturnCorrectName() {
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "hot sauce", 100.0f);

        assertEquals("hot sauce", ingredient.getName());
    }

    @Test
    public void shouldReturnCorrectPrice() {
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "hot sauce", 100.0f);

        assertEquals(100.0f, ingredient.getPrice(), 0.001f);
    }
}