/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cap;

/**
 *
 * @author yo
 */
public class Cap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = "€ хќчу теЅ€ спасать";
        StringBuilder sb = new StringBuilder();
        String parts[] = s.split(" ");
        
        for(int i = 0; i < parts.length; i++) {
            sb.append(parts[i]);
            if(i != parts.length - 1)
                sb.append(" ");
        }
        System.out.println("<" + sb + ">");
        
//        StringBuilder sb = new StringBuilder();
//        for(int i = 0; i < s.length(); i++) {
//            String c = s.substring(i, i+1);
//            
//            if(i == 0 || s.charAt(i-1)==' ') {
//                c = c.toUpperCase();
//            } else {
//                c = c.toLowerCase();
//                
//            }
//            
//            sb.append(c);
//        }
//        System.out.println(sb);
    }
    
}
