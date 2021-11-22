import java.util.*;
class sort{

    static void Sort(Vector<Integer> ans, int num)
    {
        int pos = -1;
        for(int i = 0; i < ans.size(); i++)
        {
            if (ans.get(i) >= num)
            {
                pos = i;
                break;
            }
        }
        if (pos == -1)
            ans.add(num);
        else
            ans.add(pos, num);
    }

    
    static void sortStream(int arr[], int N)
    {
        Vector<Integer> ans = new Vector<Integer>();

        for(int i = 0; i < N; i++)
        {
            Sort(ans, arr[i]);
            for(int j = 0; j < ans.size(); j++)
            {
                System.out.print(ans.get(j) + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        int arr[] = { 4, 1, 7, 6, 2 };
        int N = arr.length;

        sortStream(arr, N);
    }
}
