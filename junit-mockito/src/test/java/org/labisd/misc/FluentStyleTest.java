package org.labisd.misc;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class FluentStyleTest {

    final String hobbit = "Frodo";
    final int n = 10;
    @Test
    public void testHobbitHasNameFrodo() {
        assertThat(hobbit)
                .startsWith("Fro")
                .endsWith("do")
                .isEqualToIgnoringCase("frodo");
        assertThat(n).isGreaterThanOrEqualTo(0).isNotEqualTo(3).inBinary().isLessThan(5);
    }
}
