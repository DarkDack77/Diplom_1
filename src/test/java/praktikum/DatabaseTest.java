package praktikum;

import org.junit.Test;
import java.util.List;

import static org.junit.Assert.*;

public class DatabaseTest {

    @Test
    public void shouldReturnNonEmptyBunsList() {
        Database database = new Database();

        List<Bun> buns = database.availableBuns();

        assertNotNull(buns);
        assertFalse(buns.isEmpty());
    }

    @Test
    public void shouldReturnNonEmptyIngredientsList() {
        Database database = new Database();

        List<Ingredient> ingredients = database.availableIngredients();

        assertNotNull(ingredients);
        assertFalse(ingredients.isEmpty());
    }
}