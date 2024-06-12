package Exception_handeling;

public class follow {
    
    public static void main(String[] args) {
        
        int a = 0;
        int b[]=new int [1];
        
        try {
            b[0]=1;
            //int c=1/a;
            b[1]=a;
            
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("the error is give below : \n");
            e.printStackTrace();;

        }
         catch (Exception e) {
            System.out.println("The error is show bleow :  \n ");
            e.printStackTrace();
            // TODO: handle exception
        }
        finally{

            System.out.println("exception or not i will surely RUN from Finally block");

        }
    }
}
