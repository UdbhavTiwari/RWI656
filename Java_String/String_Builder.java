package Java_String;

public class String_Builder {
    

    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("Udbhav ji");
        System.out.println(sb);

        sb.append("ko namashkar");      // add string
        System.out.println(sb);

        sb.insert(6, " bhaisaaaaaaab");   // insert in index
        System.out.println(sb);  


        sb.delete(13, 17);    // delete index
        System.out.println(sb);  


        sb.replace(6, 7, "o");
        System.out.println(sb);  

        sb.reverse();
        System.out.println(sb);  

        sb.toString();
        System.out.println(sb);  

        sb.setCharAt(0, 'T');
        System.out.println(sb);  





    }
}
