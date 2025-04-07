package org.labisd;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.labisd.calculator.CalculatorTest;
import org.labisd.sum.SommatoreTest;

@RunWith(Suite.class) // Runner: questa è una test suite
@Suite.SuiteClasses({CalculatorTest.class, SommatoreTest.class}) // indico le classi di test della suite
public class TestSuiteB { }

