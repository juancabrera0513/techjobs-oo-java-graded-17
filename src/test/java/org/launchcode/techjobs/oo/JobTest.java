package org.launchcode.techjobs.oo;

import org.junit.Before;
import org.junit.Test;

import javax.naming.Name;

import static org.junit.Assert.*;


public class JobTest {

    private Job job;

    @Before
    public void jobSetUp() {
        job = new Job(
                "Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence")
        );
    }

    //TODO: Create your unit tests here



    @Test
    public void testSettingJobId(){
        Job jobTest1 = new Job();
        Job jobTest2 = new Job();

        assertNotEquals(jobTest1.getId(),jobTest2.getId());

    }
    @Test
    public void testJobConstructorSetsAllFields(){
        assertEquals("Product tester", job.getName().toString());
        assertEquals("ACME", job.getEmployer().toString());
        assertEquals("Desert", job.getLocation().toString());
        assertEquals("Quality control", job.getPositionType().toString());
        assertEquals("Persistence", job.getCoreCompetency().toString());

        assertTrue(job instanceof Job);

    }

    @Test
    public void testJobsForEquality(){
        Job jobTest1 = new Job();
        Job jobTest2 = new Job();

        assertFalse(jobTest1.equals(jobTest2));


    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        String expected = System.lineSeparator() +
                "ID: " + job.getId() + System.lineSeparator() +
                "Name: Product tester" + System.lineSeparator() +
                "Employer: ACME" + System.lineSeparator() +
                "Location: Desert" + System.lineSeparator() +
                "Position Type: Quality control" + System.lineSeparator() +
                "Core Competency: Persistence" + System.lineSeparator();
        assertEquals(expected, job.toString());
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData (){
        String expected = System.lineSeparator() +
                "ID: " + job.getId() + System.lineSeparator() +
                "Name: Product tester" + System.lineSeparator() +
                "Employer: ACME" + System.lineSeparator() +
                "Location: Desert" + System.lineSeparator() +
                "Position Type: Quality control" + System.lineSeparator() +
                "Core Competency: Persistence" + System.lineSeparator();
        assertEquals(expected, job.toString());
    }

    @Test
    public void testToStringHandlesEmptyField(){
        Job job = new Job("Product Tester", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
                String expected = System.lineSeparator() +
                "ID: " + job.getId() + System.lineSeparator() +
                "Name: " + job.getName() + System.lineSeparator() +
                "Employer: " + "Data not available"+  System.lineSeparator() +
                "Location: "+ "Data not available" + System.lineSeparator() +
                "Position Type: "+ "Data not available" + System.lineSeparator() +
                "Core Competency: " + "Data not available" + System.lineSeparator();
        assertEquals(expected, job.toString());


    }
}


