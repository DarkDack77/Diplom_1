package praktikum;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class BurgerTest extends BaseTest {

    private static final int INVALID_INDEX = 0;
    private static final int FIRST_POSITION = 0;
    private static final int SECOND_POSITION = 1;
    private static final int EXPECTED_SIZE_AFTER_ADD = 1;
    private static final int EXPECTED_SIZE_AFTER_REMOVE = 0;

    @Test
    public void setBunsShouldSetBunCorrectly() {
        when(bunMock.getPrice()).thenReturn(100.0f);
        when(bunMock.getName()).thenReturn("test bun");

        burger.setBuns(bunMock);

        assertEquals(bunMock, burger.bun);
    }

    @Test
    public void addIngredientShouldIncreaseSize() {
        when(ingredientMock.getPrice()).thenReturn(50.0f);

        burger.addIngredient(ingredientMock);

        assertEquals(EXPECTED_SIZE_AFTER_ADD, burger.ingredients.size());
    }

    @Test
    public void addIngredientShouldContainIngredient() {
        when(ingredientMock.getPrice()).thenReturn(50.0f);

        burger.addIngredient(ingredientMock);

        assertTrue(burger.ingredients.contains(ingredientMock));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void removeIngredientWithInvalidIndexShouldThrowException() {
        burger.removeIngredient(INVALID_INDEX);
    }

    @Test
    public void removeIngredientShouldDecreaseSize() {
        when(ingredientMock.getPrice()).thenReturn(50.0f);
        burger.addIngredient(ingredientMock);

        burger.removeIngredient(FIRST_POSITION);

        assertEquals(EXPECTED_SIZE_AFTER_REMOVE, burger.ingredients.size());
    }

    @Test
    public void removeIngredientShouldRemoveCorrectIngredient() {
        when(ingredientMock.getPrice()).thenReturn(50.0f);
        burger.addIngredient(ingredientMock);

        burger.removeIngredient(FIRST_POSITION);

        assertFalse(burger.ingredients.contains(ingredientMock));
    }

    @Test
    public void moveIngredientShouldMoveIngredientToNewPosition() {
        Ingredient firstIngredient = mock(Ingredient.class);
        Ingredient secondIngredient = mock(Ingredient.class);

        burger.addIngredient(firstIngredient);
        burger.addIngredient(secondIngredient);

        burger.moveIngredient(FIRST_POSITION, SECOND_POSITION);

        assertEquals(secondIngredient, burger.ingredients.get(FIRST_POSITION));
    }

    @Test
    public void moveIngredientShouldSwapIngredientsPositions() {
        Ingredient firstIngredient = mock(Ingredient.class);
        Ingredient secondIngredient = mock(Ingredient.class);

        burger.addIngredient(firstIngredient);
        burger.addIngredient(secondIngredient);

        burger.moveIngredient(FIRST_POSITION, SECOND_POSITION);

        assertEquals(firstIngredient, burger.ingredients.get(SECOND_POSITION));
    }
}