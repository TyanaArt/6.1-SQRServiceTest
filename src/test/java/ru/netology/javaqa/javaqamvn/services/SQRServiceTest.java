package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {

    @ParameterizedTest
//    @CsvSource({
//            "90, 100, 20000"
//    })
    @CsvFileSource(files="src/test/resources/SQR.csv")

    public void testSQRService(int expected, int minNumber, int maxNumber){
        SQRService service = new SQRService();

        //int expected = 90;
        int actual = service.numberSquare(minNumber, maxNumber);
        Assertions.assertEquals(expected, actual);
    }
}
