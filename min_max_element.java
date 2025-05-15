import java.util.Scanner;
public class min_max_element {
    public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter size of array: ");
    int size=obj.nextInt();
    int array[]=new int[size];
    System.out.println("enter elements of Array : ");
    for(int i=0;i<size;i++)
    {
        array[i]=obj.nextInt();
    }
    int min,max;
    min=max=array[0];
    for(int i=1;i<size;i++)
    {
        if(min>array[i])
        min=array[i];
        if(max<array[i])
        max=array[i];
    }
    System.out.println("minimum element of array: "+min);
    System.out.println("maximum element of array: "+max);

    }
    
    
}
