package JavaSelfOops;

class weapon {

    void purpose(){

        System.out.println("weapon is supposed to be used for good ");
    }
}

class gun extends weapon{

    void purpose(){
        System.out.println("gun is for self defence");         // previous method is being over ridden
    }
}

class bomb extends weapon{
    void purpose(){
        System.out.println("bomb destroy everything around it");         // previous method is being over ridden
    }
}

class nuclearBomb extends weapon{
    void purpose(){
        System.err.println("nuclear bomb  just Destroy everything with unimagineable power");         // previous method is being over ridden
    }
}

public class Method_overriding extends weapon {
    
    public static void main(String[] args) {
        
        gun glock = new gun();
        bomb grenade = new bomb();
        nuclearBomb fatman = new nuclearBomb();

        glock.purpose();
        grenade.purpose();
        fatman.purpose();
    }
}
