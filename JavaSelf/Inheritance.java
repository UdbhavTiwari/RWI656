package JavaSelf;

class Parent{                         // INHERITANCE

    String Origin;

    public String strenght(){
        return "i am strong";
    }
   
}


public class Inheritance extends Parent {

    String Lastname;

    public Inheritance(String Origin,String Lastname){    // Child class

        this.Origin= Origin;
        this.Lastname= Lastname;
    }

    public String brains(){
        System.out.println("I am also smart");
        return "100 IQ";
    }

        public void display(){
            System.out.println("Oringin:" + Origin +",Lastname : " + Lastname);
        }


    public static void main(String[] args) {
        Inheritance son = new Inheritance( "Jaat", "Don");

          System.out.println("This trait is of my Parent " + son.strenght()); // came from parent class
          System.out.println(son.brains());
          son.display();
    }
}
