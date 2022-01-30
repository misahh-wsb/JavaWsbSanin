public class Animal {
    final String species = "";
    private Double weight;
    private boolean life;

    public Animal(){
        weight=5.0;
        life=true;
    }
    void feed()
    {
        if(!life){
        System.out.println("Zwierze nie żyje");
        return;
    }
        weight+=0.5;
    }
    void takeForAWalk()
    {
        if(!life){
            System.out.println("Zwierze nie żyje");
            return;
        }

        weight-=0.5;

        if(weight<=0)
        {
            System.out.println("Zwierzę zmarło");
            life=false;
        }
    }
}
