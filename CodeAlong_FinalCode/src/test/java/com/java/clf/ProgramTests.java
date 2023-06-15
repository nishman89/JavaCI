package com.java.clf;

import com.sparta.clf.Program;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ProgramTests {
    @Test
    @DisplayName("My first test")
    public void firstTest() {
        Assertions.assertTrue(5 == 5);
    }

    @ParameterizedTest
    @ValueSource(ints = {19, 21, 24})
    @DisplayName("Given a time greater than 18, greeting returns good evening")
    public void givenATimeGreaterThan18_Greeting_ReturnsGoodEvening(int time)
    {
        // Arrange
        var expectedGreeting = "Good evening!";
        // Act
        var result = Program.greeting(time);
        // Assert
        Assertions.assertEquals(expectedGreeting, result);
 //       Assertions.assertEquals("Good evening!", Program.greeting(21));
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 8, 12})
     @DisplayName("Given a time between 5 and 12, greeting returns good morning")
    public void GivenATimeBetween5and12_Greeting_ReturnsGoodMorning(int time)
    {
        // Arrange
        var expectedGreeting = "Good morning!";
        // Act
        var result = Program.greeting(time);
        // Assert
        Assertions.assertEquals(expectedGreeting, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {13, 15, 18})
    @DisplayName("Given a time between 13 and 18, greeting returns good afternoon")
    public void GivenATimeOf15_Greeting_ReturnsGoodAfternoon(int time)
    {
        Assertions.assertEquals(Program.greeting(time), "Good afternoon!");
    }


    @ParameterizedTest
    @ValueSource(ints = {0, 2, 4})
    @DisplayName("Given a time between 0 and 4, greeting returns good evening")
    public void givenATimeBetween0and4_Greeting_ReturnsGoodEvening(int time)
    {
        Assertions.assertEquals(Program.greeting(time), "Good evening!");
    }
}
