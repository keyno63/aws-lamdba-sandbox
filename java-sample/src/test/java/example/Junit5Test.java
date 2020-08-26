package example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

@RunWith(JUnitPlatform.class)
public class Junit5Test {

    Context cxt;

    LambdaLogger logger;

    @BeforeEach
    void setUp() {
        cxt = mock(Context.class);
        logger = mock(LambdaLogger.class);
        doReturn(logger).when(cxt).getLogger();
    }

    @Test
    void sampleHello() {
        Hello test = new Hello();
        String actual = test.handleRequest(1, cxt);
        Assertions.assertEquals("1", actual);
    }
}
