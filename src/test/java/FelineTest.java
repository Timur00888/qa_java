import com.example.Feline;
import com.example.Predator;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class FelineTest {

    @Test
    public void testEatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");

        List<String> actualFood = feline.eatMeat();

        assertEquals(expectedFood, actualFood);
    }

    @Test
    public void testGetFamily() {
        Feline feline = new Feline();

        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void testGetKittensWithDefaultValue() {
        Feline feline = new Feline();

        assertEquals(1, feline.getKittens());
    }

    @Test
    public void testGetKittensWithCount() {
        Feline feline = new Feline();
        int kittensCount = 3;

        assertEquals(kittensCount, feline.getKittens(kittensCount));
    }

    @Test
    public void testEatMeatMocked() throws Exception {
        Predator mockPredator = mock(Feline.class);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");

        when(mockPredator.eatMeat()).thenReturn(expectedFood);

        List<String> actualFood = mockPredator.eatMeat();

        assertEquals(expectedFood, actualFood);
    }
}