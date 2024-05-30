package JavaSelfOops;

public class Encapsulation {

    private String emp_id ;           // data hiding

    public void set_id(String id ){
        emp_id=id;
    }

    public String get_id(){
                                   
        return emp_id;                       // wrapping data and its method in single unit is encapsulation
    } 
}


class Main {

    public static void main(String[] args) {
        
        Encapsulation employ = new Encapsulation();

        employ.set_id( "this is my password");
        String identity = employ.get_id();

        System.out.println(identity);
        System.out.println(employ.get_id());
        
    }

}