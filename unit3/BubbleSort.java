public class BubbleSort{
    public static void main(String[] args)
    {
        int array[]={12,6,4,-8,10,11,89,68,45,37};
        System.out.println("����ǰ:");
        for(int i=0;i<array.length;i++)
        System.out.print(array[i]+" ");
        System.out.println();
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array.length-i-1;j++)
            {
                if(array[j]>array[j+1])//Java֧�ְ�ֵ����,���ô���,��֧�ְ���ַ����
                {
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        System.out.println("�����:");
        for(int i:array)//ǿ����forѭ��
        System.out.print(i+" ");
    }
}