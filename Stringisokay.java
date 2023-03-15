//checking if the String is palindrome
public class Main{
  String str="knock";
    
    void plaindrome(){
       int size=str.length();
      if(size==0||size==1){ 
        System.out.println("Hence it is palindrome");
      }
    else{ 
        char c1=str.charAt(size-size);
        char c2=str.charAt(size-1);
        str=str.substring(size-size,size-1);
        boolean c4=c1==c2;
        if(c4==true){   
          plaindrome();
        }  
       else{
          System.out.println(false);
       }
    }
          }     
  public static void main(String args[]){
   Main obj=new Main();
     obj.plaindrome();
    
  }
}
