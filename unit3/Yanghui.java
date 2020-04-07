class Yanghui{
    public static void main(String[] args)
    {
        int i,j;
        int yh[][] = {{1},{1,1},{1,2,1},{1,3,3,1},{1,4,6,4,1}};
        for(int[] e:yh){
           for(int s:e)
           System.out.print(s+" ");
           System.out.println();
        }
    }
}