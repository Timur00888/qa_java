import com.example.Cat;
import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class CatTest {

    @Test
    public void testGetSound() {
        Feline mockFeline = mock(Feline.class);
        Cat cat = new Cat(mockFeline);

        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void testGetFood() throws Exception {
        Feline mockFeline = mock(Feline.class);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");

        when(mockFeline.eatMeat()).thenReturn(expectedFood);

        Cat cat = new Cat(mockFeline);
        List<String> actualFood = cat.getFood();

        assertEquals(expectedFood, actualFood);
    }
}