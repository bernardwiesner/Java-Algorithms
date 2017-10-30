import java.util.ArrayList;
import java.util.Scanner;

public class BinarySearch{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);   
        int num = sc.nextInt();
        ArrayList al = new ArrayList();
        al.add(0); al.add(1000000);
        for (int i = 0; i < num; i++) {
            
            int A = sc.nextInt();
            
            int low = 0;
            int high = al.size()-1;
            int middle = 0;
            boolean same = false;
            while(low <= high){
                middle = (low+high)/2;
                
                if(A > (int)al.get(middle)){
                    low = middle+1;
                }else if(A < (int)al.get(middle)){
                    high = middle-1;
                }else if(A == (int)al.get(middle)){
                    same = true;
                    break;
                }
                
            }
            if((int)al.get(middle) < A){
                middle++;
            }
            if(same == true){
                System.out.println(A + " " + A);
                continue;
            }
            al.add(middle, A);
            System.out.println(al.get(middle-1) + " " + al.get(middle+1));
        }
        
        
    }    
    
}
