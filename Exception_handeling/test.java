package Exception_handeling;

import java.io.FileInputStream;

public class test {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\rj07p\\Desktop\\JavaVirtual\\Normal.tt");          //compile time coz compiler give warning while compiling 
            System.out.println(fis);                                                                                    // although it occurs in runtime only
        } catch (Exception e) {
            System.out.println("my man the error is "+ e);
            
        }

        // try {
        //     int a = 0;                                                                              // run time because  compiler dont give warning while compiling 
        //     int b = 100 ;                                                                           // and error  occurs in run time 
        //     int c = b/a; 
    
        //     System.out.println(c);
            
        // } catch (Exception e) {
        //     System.out.println("ERROR IS : " + e);
        //     // TODO: handle exception
        // }
    }
    
}
