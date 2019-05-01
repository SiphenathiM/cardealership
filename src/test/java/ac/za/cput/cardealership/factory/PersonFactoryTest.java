package ac.za.cput.cardealership.factory;

import ac.za.cput.cardealership.domain.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class PersonFactoryTest {

    Map<String,String> values;



    @Before
    public void setUp() throws Exception {
        values = new HashMap<String, String>();
        values.put("id","1");
        values.put("firstname","Siphe");
        values.put("lastname","Mpetsheni");
    }

    @Test
    public void getPerson()throws Exception {


        Person c =PersonFactory.getPerson(values,"0847204852");
        Assert.assertEquals("0847204852",c.getPhoneNumber());
    }
}


