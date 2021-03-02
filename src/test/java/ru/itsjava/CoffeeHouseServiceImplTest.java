package ru.itsjava;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import ru.itsjava.domain.Coffee;
import ru.itsjava.service.CoffeeHouseServiceImpl;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SpringBootTest
public class CoffeeHouseServiceImplTest {
    private final CoffeeHouseServiceImpl mockedCSI = mock(CoffeeHouseServiceImpl.class);

    @Test
    public void getCoffeeByPriceTest() {
        when(mockedCSI.getCoffee()).thenReturn(new Coffee("Мокка"));
        when(mockedCSI.getCoffee()).thenReturn(new Coffee("Холодный кофе"));
        when(mockedCSI.getCoffee()).thenReturn(new Coffee("Горячий шоколад"));
        when(mockedCSI.getCoffee()).thenReturn(new Coffee("Какао"));

        Assertions.assertEquals(mockedCSI.getCoffee(), new Coffee("Какао"));
        Assertions.assertNotNull(mockedCSI.getCoffee(), String.valueOf(new Coffee("Латте")));
    }
}
