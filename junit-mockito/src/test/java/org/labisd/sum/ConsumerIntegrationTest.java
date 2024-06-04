package org.labisd.sum;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ConsumerIntegrationTest {

    Sommatore sommatore;

    @Before
    public void setUp() {
        sommatore = new Sommatore();
    }

    @Test
    public void testSumTwice() {
        int a = 2;
        int b = 3;
        int expected = 10;

        // when
        Consumer consumer = new Consumer(sommatore);
        int res = consumer.sumTwice(a,b);

        // then
        assertThat(res).isEqualTo(expected);
    }

}
