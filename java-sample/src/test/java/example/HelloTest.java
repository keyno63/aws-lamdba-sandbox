package example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)
public class HelloTest {

    @Mock
    Context cxt;

    @Mock
    LambdaLogger logger;

    @BeforeEach
    void setUp() {
        doReturn(logger).when(cxt).getLogger();
    }

    @Test
    void sample() {
        Hello test = new Hello();
        String actual = test.handleRequest(1, cxt);
        Assertions.assertEquals("1", actual);
    }
}
