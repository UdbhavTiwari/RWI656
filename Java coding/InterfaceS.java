interface InterfaceSublic  {

    void pub();
    void priv();
    void working();
    
}


class answer implements InterfaceSublic {


    @Override
   public void pub(){
        System.out.println("Public crowd is Avg");
    }

    @Override
   public void priv(){
        System.out.println("Private crowd is higher than avg");
    }

    @Override
    public void working(){
        System.out.println("System is working on 70 %");
    }

}

class InterfacesS  {

    public static void main(String[] args) {
        
        answer solution = new answer();
        solution.pub();
        solution.priv();
        solution.working();
    }
}