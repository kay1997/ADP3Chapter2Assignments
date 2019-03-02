package za.ac.cput;


import com.sun.xml.internal.ws.policy.AssertionSet;
import org.junit.Assert;
import org.junit.Test;

/*
* Kaylen Abrahams
* Student Number: 216054664
* Group: 3G
*/

public class CarTest {

    @Test
    public void speed()
    {
        Bmw bmw = new Bmw();
        int speed = bmw.accelerate(120) -  bmw.brake(60);
        Assert.assertEquals(60, speed);
    }
}
