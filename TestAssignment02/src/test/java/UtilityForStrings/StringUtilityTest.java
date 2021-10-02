package UtilityForStrings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilityTest {
    private StringUtility stringUtility;

    @BeforeEach
    void SetUp() { stringUtility = new StringUtility(); }

    //region Reversing tests
    @Test
    public void Should_Reverse_A_Letter()
    {
        //Act
        String actual = stringUtility.ReverseString("b");
        String expected = "b";
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void Should_Reverse_String_iA()
    {
        //Act
        String actual = stringUtility.ReverseString("iA");
        String expected = "Ai";
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void Given_Null_For_Reversing_Should_Return_Null(){
        //Act
        String actual = stringUtility.ReverseString(null);
        String expected = null;
        //Assert
        assertEquals(expected, actual);
    }
    //endregion Reversing tests

    //region Capitalisation tests
    @Test
    public void Should_Capitalize_String_A(){
        //Act
        String actual = stringUtility.CapitalizeString("A");
        String expected = "A";
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void Should_Capitalize_String_b(){
        //Act
        String actual = stringUtility.CapitalizeString("b");
        String expected = "B";
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void Should_Capitalize_String_aBc(){
        //Act
        String actual = stringUtility.CapitalizeString("aBc");
        String expected = "ABC";
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void Given_Null_For_Capitalization_Should_Return_Null(){
        //Act
        String actual = stringUtility.CapitalizeString(null);
        String expected = null;
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void Given_Number_String_For_Capitalization_Should_Return_Same_Number_String(){
        //Act
        String actual = stringUtility.CapitalizeString("123");
        String expected = "123";
        //Assert
        assertEquals(expected, actual);
    }
    //endregion Capitalisation tests

    //region Lowercase tests
    @Test
    public void Should_Lower_String_a(){
        //Act
        String actual = stringUtility.LowerString("a");
        String expected = "a";
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void Should_Lower_String_A(){
        //Act
        String actual = stringUtility.LowerString("A");
        String expected = "a";
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void Should_Lower_String_aBc(){
        //Act
        String actual = stringUtility.LowerString("aBc");
        String expected = "abc";
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void Given_Null_For_Lowering_Should_Return_Null(){
        //Act
        String actual = stringUtility.LowerString(null);
        String expected = null;
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void Given_Number_String_For_Lowering_Should_Return_Same_Number_String(){
        //Act
        String actual = stringUtility.LowerString("123");
        String expected = "123";
        //Assert
        assertEquals(expected, actual);
    }
    //endregion Lowercase tests
}
