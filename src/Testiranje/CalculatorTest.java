package Testiranje;
import TS.Calculator;
import org.junit.*;

public class CalculatorTest {
    private static Calculator digitron = new Calculator();
    @Before
    public void brisanje() //Izvršava se pre svakog novog testa
    {
        digitron.clear();
    }
    @Test
    public void testSabiranjeCelihPozitivnih(){
        digitron.add(5);
        digitron.add(4);
        Assert.assertEquals(9,digitron.getResult());
    }
    @Test
    public void testSabiranjeNegativnihCelih(){
        digitron.add(-3);
        digitron.add(-5);
        Assert.assertEquals(-8,digitron.getResult());
        digitron.add(10);
        Assert.assertEquals(2,digitron.getResult());
    }
    @Test
    public void testOduzimanjeCelih(){
        digitron.substract(5);
        Assert.assertEquals(-5,digitron.getResult());
    }
    @Test
    public void testOduzimanjeDvaArgumenta(){
        digitron.substract2(15,10);
        Assert.assertEquals(5,digitron.getResult());
    }
    @Test
    public void testOduzimanjeDvaArgumentaNegativni(){
        digitron.substract2(-3,-5);
        Assert.assertEquals(2,digitron.getResult());
    }
    @Test
    @Ignore("Operacija nije implementiranja")
    public void testMnozenjePozitivnih(){
        digitron.add(3);
        digitron.multiply(2);
        Assert.assertEquals(6,digitron.getResult());
    }
    @Test
    @Ignore("Operacija nije implementirana")
    public void testMnozenjeNegativnih(){
        digitron.add(-3);
        digitron.multiply(-3);
        Assert.assertEquals(9,digitron.getResult());
    }
    @Test
    public void testDeljenjePozitivnih(){
        digitron.add(8);
        digitron.divide(4);
        Assert.assertEquals(2,digitron.getResult());
    }
    @Test
    public void testDeljenjeNegativnih(){
        digitron.add(-8);
        digitron.divide(-4);
        Assert.assertEquals(2,digitron.getResult());
    }
    @Test(expected = ArithmeticException.class)
    public void testDeljenjeNulom(){
        digitron.add(5);
        digitron.divide(0); //puca zbog deljenja nulom
        //Assert.assertEquals("NaN",digitron.getResult());
    }
    @Test
    public void testDeljenjeDvaNulom(){
        Assert.assertEquals("Delite sa nulom!",digitron.divide2(6,0));
    }
    @Test
    public void testDeljenjeDvaPozitivni(){
        Assert.assertEquals("2",digitron.divide2(4,2));
    }
    @Test
    public void testDeljenjeDvaNegativni(){
        Assert.assertEquals("2",digitron.divide2(-4,-2));
    }
    @Test
    public void testKvadriranjePozitivni(){
        digitron.square(5);
        Assert.assertEquals(25,digitron.getResult());
    }
    @Test
    public void testKvadriranjeNegativni(){
        digitron.square(-5);
        Assert.assertEquals(25,digitron.getResult());
    }
    @Test(timeout = 3000)
    public void testKoren(){
        digitron.add(4);
        digitron.squareRoot(2);
        Assert.assertEquals(16,digitron.getResult());
    }
    @After
    public void naKraju(){
        digitron.switchOff();
    }
}
