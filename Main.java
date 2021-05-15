import java.util.*;

class Main{
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str="";
        String leftover="";
        String leftover2="";
        String str1 =sc.next();
       String str2 =sc.next();
        int count=0;
        int length=str2.length();
        
        for(int i=1;i<length;i++){
          
            
        
                   if(str1.length()>=i ){
                    str = str + str1.substring(0,i);
                    str1 = str1.substring(i);
                    
                 }
                   else{
                       leftover=str1;  
                   }
                   if(str2.length()>=i)
                  {
                     str = str + str2.substring(0,i);
                     str2 = str2.substring(i);
                     
                  }else{
                       leftover2=str2;
                   }
                  
                     
                  
            
               
   }
        
      
                 
        
             int length2=str.length();
             if(str.charAt(length2-1) == str2.charAt(str2.length()-1)){
            System.out.println(str+leftover2+leftover);
             }else{
                   System.out.println(str+leftover+leftover2);
             }
        
  
    }
}




