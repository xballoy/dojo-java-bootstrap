package com.xballoy.kata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {

    @Test
    void shouldAddInteger() {
        // Arrange
        final int x = Integer.MAX_VALUE;
        final int y = Integer.MAX_VALUE;

        // Act
        final int result = Calculator.sum(x, y);

        // Assert
        assertThat(result).isEqualTo(10);
    }
}
