package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {
    
    Sample sample = new Sample();
    
    @ParameterizedTest
    @CsvSource({
        "2, 6, 8",
        "-8, 6, -2",
        "6, 6, 12"
    })
    void addition_assertion(int a, int b, int expectedRes){
        int res = sample.op(Sample.Operation.ADD, a, b);
        
        Assertions.assertThat(res).isEqualTo(expectedRes);
    }

    @ParameterizedTest
    @CsvSource({
        "2, 6, 12",
        "-8, 6, -48",
        "6, 6, 36"
    })
    void multiplication_assertion(int a, int b, int expectedRes){
        int res = sample.op(Sample.Operation.MULT, a, b);
        
        Assertions.assertThat(res).isEqualTo(expectedRes);
    }
}
