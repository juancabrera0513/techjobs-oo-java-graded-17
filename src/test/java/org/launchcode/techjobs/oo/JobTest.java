package org.launchcode.techjobs.oo;

import org.junit.Test;

import javax.naming.Name;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId(){
        Job jobTest1 = new Job();
        Job jobTest2 = new Job();

        assertNotEquals(jobTest1.getId(),jobTest2.getId());

    }
    public void testJobConstructorSetsAllFields(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("Product tester", job.getName());
        assertEquals("ACME", job.getEmployer());
        assertEquals("Desert", job.getLocation());
        assertEquals("Quality control", job.getPositionType());
        assertEquals("Persistence", job.getCoreCompetency());

        assertTrue(job instanceof Job);

    }

    public void testJobsForEquality(){
        Job jobTest1 = new Job();
        Job jobTest2 = new Job();

        assertFalse(jobTest1.equals(jobTest2));


    }

}
