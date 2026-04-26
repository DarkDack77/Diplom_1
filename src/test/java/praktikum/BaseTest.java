package praktikum;

import org.junit.Before;

import static org.mockito.Mockito.mock;

public abstract class BaseTest {

    protected Burger burger;
    protected Bun bunMock;
    protected Ingredient ingredientMock;

    @Before
    public void setUp() {
        burger = new Burger();
        bunMock = mock(Bun.class);
        ingredientMock = mock(Ingredient.class);

        burger.setBuns(bunMock);
    }
}