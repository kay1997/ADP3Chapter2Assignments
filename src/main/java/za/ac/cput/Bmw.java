package za.ac.cput;


 class Bmw implements Car
 {

    int speed;

    @Override
     public int accelerate(int increase)
    {
        speed = speed + increase;

        return increase;
    }

     @Override
     public int brake(int decrease)
     {
         speed = speed - decrease;

         return decrease;
     }



    public void displaySpeed()
    {
        System.out.println(speed);

    }


}
