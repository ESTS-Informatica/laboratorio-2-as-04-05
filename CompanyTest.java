

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CompanyTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CompanyTest
{
    User user1;
    User user2;
    User seller1;
    User seller2;
    Company company;
    Property property1;
    Property property2;
        
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        user1= new User("Jose Manuel","911111111","zemanel@yahoo.com");
        user2= new User("Antonio Francisco","922222222","tochico@hotmail.com");
        seller1= new User("Fernando Fernades","966777101","fefe@remax.pt");
        seller2 = new User("Rodrigo Rodrigues","966777152","roro@remax.pt");
        company=new Company();
        company.registerClient(user1);
        company.registerClient(user2);
        company.registerSeller(seller1);        
        company.registerSeller(seller2);   
        
        property1 = new Property("casa",150000);
        property2 = new Property ("casa2",1200000.10);
        
    }

    @Test
    public void testContructor(){
        assertNotEquals(null,company.getSellers());
    }
    
    @Test
    public void testRegisterClient(){
        Company c2 = new Company();
        c2.registerClient(user1);    
        assertNotEquals(null,company.getClients());
    }
    
    @Test
    public void testRegisterClients(){
        Company c3 = new Company();
        c3.registerClient(user1);
        c3.registerClient(user2);
        assertNotEquals(null,company.getClients());
    }
    
    @Test
    public void testRegisterClientDuplicate(){
        Company c4 = new Company();
        c4.registerClient(user1);
        c4.registerClient(user1);
        assertNotEquals(2,c4.getClients().size());
    }
    
    @Test
    public void testRegisterClientNull(){
        User u = null;
        assertEquals(false,company.registerClient(u));
    }
    
    
    @Test
    public void testCreateSell(){
        assertEquals(true,company.createSell(user1,seller1, property1));
        assertEquals(true,company.createSell(user2,seller2, property2));
    }
   
    @Test
    public void testCalculateSellsOfTheYear(){
        company.createSell(user1,seller1, property1);
        assertEquals(1,company.calculateSellsOfTheYear(2024));
        assertEquals(0,company.calculateSellsOfTheYear(2022));
    }
    
    
    @Test
    public void testFindSellerOfTheYear(){
        company.createSell(user1,seller1, property1);
        assertEquals("Fernando Fernades",company.findSellerOfTheYear(2024));
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
