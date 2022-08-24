import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class testClass {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }
    @Test
    public void greetTest(){
        System.out.println("name greeting");
        String actual = new greetclass().greetmethod("bob");
        String expected = "greetings, bob";
        assertEquals(expected,actual);
    }
    @Test
    public void standingreet(){
        System.out.println("stand in");
        String actual = greetclass.greetmethod(null);
        String expected = "Hey my friend";
        assertEquals(expected,actual);
    }
    @Test
    public void uppergreet(){
        System.out.println("uppercase");
        String actual = greetclass.greetmethod("CARL");
        String expected = "HELLO" + "CARL";
        assertEquals(expected,actual);
    }
    @Test
    void arraytest(){
        System.out.println("Arraytest");
        String actual = greetclass.greetmethod("");
        String expected = "HELLO" + "CARL";
        assertEquals(expected,actual);
    }
}
