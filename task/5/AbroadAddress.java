class AbroadAddress extends Address{
    public AbroadAddress(String a,String b,String c,String d,String e,String f,String h)
    {
        super(a,b,c,d,e,f,h);
    }
    public String toString()
    {
        return super.country+'\n'+super.province+'\n'+super.city+'\n'+super.street+'\n'+super.doorpalte+'\n'+super.unit+'\n'+super.postnumber;
    }
}