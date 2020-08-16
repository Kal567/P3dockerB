package pucmm.springboot;


import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hibernate.validator.internal.util.Contracts.assertTrue;

@SpringBootTest
public class SpringBootApplicationTest {
    @Test
    public void testSampleTest() {
        assertTrue(true, "Should be true");
    }
}
