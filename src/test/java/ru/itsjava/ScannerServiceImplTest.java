package ru.itsjava;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import ru.itsjava.service.ScannerServiceImpl;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

@SpringBootTest
public class ScannerServiceImplTest {

    @Test
    public void priceReaderTest() {
        ScannerServiceImpl scannerService=new ScannerServiceImpl();
        String price="60";
        InputStream in=new ByteArrayInputStream(price.getBytes());
        System.setIn(in);
        Assertions.assertEquals(60,scannerService.readPrice());
    }
}
