public class BubbleSort{
    public static void main(String[] args)
    {
        int array[]={12,6,4,-8,10,11,89,68,45,37};
        System.out.println("排序前:");
        for(int i=0;i<array.length;i++)
        System.out.print(array[i]+" ");
        System.out.println();
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array.length-i-1;j++)
            {
                if(array[j]>array[j+1])//Java支持按值传递,引用传递,不支持按地址传递
                {
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        System.out.println("排序后:");
        for(int i:array)//强化版for循环
        System.out.print(i+" ");
    }
}