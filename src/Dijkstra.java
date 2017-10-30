
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Dijkstra {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n+1][n+1];
        int[] dist = new int[n+1];        
        boolean[] visited = new boolean[n+1];
        
        Queue<Integer> q = new LinkedList();
        int paths = sc.nextInt();
        for (int i = 0; i < paths; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            matrix[a][b] = c;


        }
        
        for (int i = 1; i <= n; i++) {
            dist[i] = 9999;
        }
                
        dist[1] = 0;
        visited[1] = true;
        q.offer(1);
        int c = 0;
        while(!q.isEmpty()){
            int current = q.poll();
            for (int i = 1; i <= n; i++) {
                if(matrix[current][i] != 0 || matrix[i][current] != 0){
                    if(dist[i] >= dist[current]+matrix[current][i]){
                        if(dist[i] == dist[current]+matrix[current][i] || i == 2){
                            c++;
                        }
                        dist[i] = dist[current]+matrix[current][i];
                        
  
                    }
                    if(visited[i] == false){
                        q.offer(i);
                        visited[i] = true;
                    }
                    
                }
                
            }
            
            
        }
        System.out.println(c);
        

        
    }
    
}
