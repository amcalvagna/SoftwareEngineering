package org.labisd;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.labisd.sum.ConsumerTest;
import org.labisd.sum.SommatoreTest;

@RunWith(Suite.class) // Runner: questa è una test suite
@Suite.SuiteClasses({ConsumerTest.class, SommatoreTest.class}) // indico le classi di test della suite
public class TestSuiteA { }

