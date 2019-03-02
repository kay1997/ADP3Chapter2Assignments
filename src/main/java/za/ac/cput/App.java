package za.ac.cput;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Bmw bmw = new Bmw();
        bmw.accelerate(120);
        bmw.brake(60);

        System.out.println("Bmw current speed: ");
        bmw.displaySpeed();

        Toyota toyota = new Toyota();
        toyota.accelerate(100);
        toyota.brake(50);

        System.out.println("Toyota current speed: ");
        toyota.displaySpeed();

    }
}
