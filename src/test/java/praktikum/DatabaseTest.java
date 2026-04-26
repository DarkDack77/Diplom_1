package praktikum;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

public class DatabaseTest {

    @Test
    public void availableBunsShouldReturnNotNullList() {
        Database database = new Database();

        List<Bun> buns = database.availableBuns();

        assertNotNull(buns);
    }

    @Test
    public void availableBunsShouldReturnNotEmptyList() {
        Database database = new Database();

        List<Bun> buns = database.availableBuns();

        assertFalse(buns.isEmpty());
    }

    @Test
    public void availableIngredientsShouldReturnNotNullList() {
        Database database = new Database();

        List<Ingredient> ingredients = database.availableIngredients();

        assertNotNull(ingredients);
    }

    @Test
    public void availableIngredientsShouldReturnNotEmptyList() {
        Database database = new Database();

        List<Ingredient> ingredients = database.availableIngredients();

        assertFalse(ingredients.isEmpty());
    }
}