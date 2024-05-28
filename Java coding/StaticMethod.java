public class StaticMethod {
    
    static{
        System.out.println("hi from static");  // static was executed first
        
    }

    public static void main(String[] args) {
        System.out.println("Hi form main");  // main was executed after static block 
    }
}
