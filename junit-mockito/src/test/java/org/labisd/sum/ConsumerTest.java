package org.labisd.sum;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.*;
import static org.mockito.MockitoAnnotations.initMocks;

public class ConsumerTest {

    @Mock
    Sommatore sommatore;
    //sintassi alternativa, senza annotazione
    //Sommatore sommatore = mock(Sommatore.class);

    @Before
    public void setUp() {
        initMocks(this);
    }


    @Test
    public void testSumTwice_withoutMockito() {
        int a = 2;
        int b = 3;
        int expected = 10;

                                // dependency injection
        Consumer consumer = new Consumer(new Sommatore() { 
            @Override
            public int sum(int a, int b) {
                return 5;
            }
        });

        int res = consumer.sumTwice(a, b);

        assertThat(res).isEqualTo(expected);
    }

    @Test
    public void testSumTwice_withMockito() {
        int a = 2;
        int b = 3;
        int expected = 10;

        // given - alias sintattico
        when(sommatore.sum(a,b)).thenReturn(5);

        // when
        Consumer consumer = new Consumer(sommatore);
        int res = consumer.sumTwice(a,b);

        // then   - alias sintattico 
        verify(sommatore, times(1)).sum(a,b); // verfica che il metodo sia stato effettivamente chiamato con quei valori
        assertThat(res).isEqualTo(expected);
    }

    @Test
    public void testSumTwice_withMockitoBDD() {
        int a = 2;
        int b = 3;
        int expected = 10;

        // given
        given(sommatore.sum(a,b)).willReturn(5);

        // when
        Consumer consumer = new Consumer(sommatore);
        int res = consumer.sumTwice(a,b);

        // then
        then(sommatore).should().sum(a,b); // verfica che il metodo sia stato effettivamente chiamato con quei valori
        assertThat(res).isEqualTo(expected);
    }
}

