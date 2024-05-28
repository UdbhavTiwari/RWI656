package JavaSelf;   

    abstract class Living {
     String name;
      abstract void food_Type();
     
     
 }


 class Predators extends Living {
     
    void food_Type(){
        System.out.println("i am carnivore");

    }
            public Predators(String name){
            this.name=name;
       }
 }

public class Abstraction extends Living {        // for grass eating animal
           
                void food_Type(){
                System.out.println("i am herbivore");
                }


                  public Abstraction(String name){
                    this.name=name;
                }

   
    public static void main(String[] args) {
        
        Predators tiger = new Predators("tiger");
        Abstraction deer = new Abstraction("deer");

            System.out.println(tiger.name); 
            tiger.food_Type();
            System.out.println(deer.name);
            deer.food_Type();

    }
}
