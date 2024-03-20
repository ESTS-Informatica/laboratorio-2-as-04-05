

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class PropertyTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PropertyTest
{
    Property property1;
    Property property2;
    Property property3;
    Sell sell1;
    Sell sell2;
    User user1;
    User user2;
    User seller1;
    User seller2;
    Company company;
    /**
     * Default constructor for test class PropertyTest
     */
    public PropertyTest()
    {
        property1= new Property("T3 Monte Belo",150000.0);
        
    }

    @Test
    public void testConstructor(){
        assertEquals("T3 Monte Belo",property1.getDescription());
    }
    
    @Test
    public void testToString(){
        assertEquals("Descricao : "+ "T3 Monte Belo" +"Preco : "+ 150000.0 + "Euros",property1.toString());
    
    }
    
    

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
