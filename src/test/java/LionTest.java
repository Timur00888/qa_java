import com.example.Feline;
import com.example.Lion;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class LionTest {

    @Test
    public void testGetKittens() throws Exception {
        Feline mockFeline = mock(Feline.class);
        when(mockFeline.getKittens()).thenReturn(2);

        Lion lion = new Lion("Самец", mockFeline);

        assertEquals(2, lion.getKittens());
    }

    @Test
    public void testGetFood() throws Exception {
        Feline mockFeline = mock(Feline.class);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");

        when(mockFeline.getFood("Хищник")).thenReturn(expectedFood);

        Lion lion = new Lion("Самец", mockFeline);
        List<String> actualFood = lion.getFood();

        assertEquals(expectedFood, actualFood);
    }
}