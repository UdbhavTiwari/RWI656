package JavaSelfOops;

class LivingBeings {
    String Name;

    public LivingBeings(String name) {
        this.Name = name;
    }

    String Do_Things() {
        return "I Live";
    }
}

class Terrorist extends LivingBeings {
    public Terrorist(String name) {
        super(name);
    }

    @Override
    String Do_Things() {
        return "I Kill";
    }
}

class Gods extends LivingBeings {
    public Gods(String name) {
        super(name);
    }

    @Override
    String Do_Things() {
        return "I Punish Terrorists";
    }
}

class PolymorphismHuman extends LivingBeings {
    public PolymorphismHuman(String name) {
        super(name);
    }

    @Override
    String Do_Things() {
        return "I Do nothing";
    }

    public static void main(String[] args) {
        LivingBeings turtle = new LivingBeings("Turtle");
        LivingBeings osama = new Terrorist("terrorist");
        LivingBeings ram = new Gods("Ram Ji");
        LivingBeings human = new PolymorphismHuman("Middle class ladka");

        System.out.println(turtle.Name +": "+ turtle.Do_Things());
        System.out.println( osama.Name+": " +osama.Do_Things());
        System.out.println(ram.Name+": "+ ram.Do_Things());
        System.out.println( human.Name+": "+human.Do_Things());
    }
}