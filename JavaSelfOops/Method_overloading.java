package JavaSelfOops;

class fireArms {

    void fire ( int a , String b){

        System.out.println("glock is 9mm");

    }

    void fire ( String a , int b){                          // method overloaded  with same method name but with different type 
        System.out.println("I just go boom ");            // of parameters(different set)
    }
}

 class Method_overloading  {                               //  DOUBT : IF I EXTEND TO FIREARMS THEN IT GIVE ERROR 
            
    public static void main(String[] args) {    

        fireArms gun_powder = new fireArms();

        gun_powder.fire( 9,"glock");
        gun_powder.fire("bomb", 10);
    }

}
