package ru.job4j.array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class JavaNameValidatorTest {

    @Test
    void whenEmptyNameInvalid() {
        Assertions.assertThat(JavaNameValidator.isNameValid("")).isFalse();
    }

    @Test
    void whenFullLatValid() {
        Assertions.assertThat(JavaNameValidator.isNameValid("first")).isTrue();
    }

    @Test
    void whenFullLatAndSomeUpperCaseLettersValid() {
        Assertions.assertThat(JavaNameValidator.isNameValid("fIRST")).isTrue();
    }

    @Test
    void whenLatNumberValid() {
        Assertions.assertThat(JavaNameValidator.isNameValid("first1")).isTrue();
    }

    @Test
    void whenLatWithSpecialSymbolUnderValid() {
        Assertions.assertThat(JavaNameValidator.isNameValid("first_user")).isTrue();
    }

    @Test
    void whenNumberInValid() {
        Assertions.assertThat(JavaNameValidator.isNameValid("123")).isFalse();
    }

    @Test
    void whenFirstLatinUpperCaseIsInvalid() {
        Assertions.assertThat(JavaNameValidator.isNameValid("First")).isFalse();
    }

    @Test
    void whenLatNumberAndTwoSpecialSymbolsUnderValid() {
        Assertions.assertThat(JavaNameValidator.isNameValid("fir$t_u$er_1")).isTrue();
    }
}
