import java.io.*;
import java.util.*;

class Main {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int target = sc.nextInt();

    int[] ans = allIndex(arr,target,0,0);
    for (int i = 0; i < ans.length; i++) {
      System.out.println(ans[i]);
    }
  }

  public static int[] allIndex(int[] arr, int x,int idx, int fsf) {
    if(idx==arr.length){
      return new int[fsf];
    }
    if(arr[idx]==x){
      int[] index_arr = allIndex(arr, x, idx+1, fsf+1);
      index_arr[fsf]=idx;
      return index_arr;
    }else{
      int[] index_arr = allIndex(arr, x, idx+1, fsf);
      return index_arr;
    }

    }
}
