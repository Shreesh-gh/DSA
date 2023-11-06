```java
import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nexInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int target = sc.nextInt();

    int ans = firstIndex(arr, 0, target);
    System.out.println(ans);
  }

  public static int firstIndex(int[] arr, int idx, int x) {
    if(idx==arr.length)return -1;
    int fiisa = firstIndex(arr,idx+1,x);
    if(arr[idx]=x){
        return idx;
    }else{
        return fiisa;
    }
  }

}
```
