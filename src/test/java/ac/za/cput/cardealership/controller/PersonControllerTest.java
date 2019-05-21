package ac.za.cput.cardealership.controller;

import ac.za.cput.cardealership.domain.people.Mechanic;
import ac.za.cput.cardealership.domain.people.Person;
import ac.za.cput.cardealership.factory.people.MechanicFactory;
import ac.za.cput.cardealership.factory.people.PersonFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class PersonControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/Mechanic";

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void create() {

        Person admin = PersonFactory.getPerson("siphe","mpe","09877666");

        ResponseEntity<Person> posResponse = restTemplate.postForEntity(baseURL + "/create",admin,Person.class);
        assertNotNull(posResponse);
        assertNotNull(posResponse.getBody());
    }
}