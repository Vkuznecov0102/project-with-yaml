package ru.itsjava;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import ru.itsjava.domain.Coffee;
import ru.itsjava.service.CoffeeServiceImpl;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SpringBootTest
public class CoffeeServiceImplTest {

    private final CoffeeServiceImpl mockedCSI = mock(CoffeeServiceImpl.class);

    @Test
    public void getCoffeeByPriceTest() {
        when(mockedCSI.getCoffee()).thenReturn(new Coffee("Латте"));
        when(mockedCSI.getCoffee()).thenReturn(new Coffee("Американо"));
        when(mockedCSI.getCoffee()).thenReturn(new Coffee("Капучино"));
        when(mockedCSI.getCoffee()).thenReturn(new Coffee("Эспрессо"));

        Assertions.assertEquals(mockedCSI.getCoffee(), new Coffee("Эспрессо"));
        Assertions.assertNotNull(mockedCSI.getCoffee(), String.valueOf(new Coffee("Латте")));
    }
}
