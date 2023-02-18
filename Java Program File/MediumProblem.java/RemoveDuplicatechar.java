public class RemoveDuplicatechar {
    public static void main(String[] args) {
        
    
    String a ="Deepakk";
    String p = new String();
    for(int i=0;i<a.length();i++){
        char c = a.charAt(i);
        if(p.indexOf(c)<0){
            p+=c;
        }
    }
    System.out.println(p);

}}
