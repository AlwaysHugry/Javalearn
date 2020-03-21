class Address{
    String country;
    String province;
    String city;
    String street;
    String doorpalte;
    String unit;
    String postnumber;
    public Address(String a,String b,String c,String d,String e,String f,String h)
    {
        country=a;
        province=b;
        city=c;
        street=d;
        doorpalte=e;
        unit=f;
        postnumber=h;
    }
    public String toString()
    {
        return postnumber+'\n'+country+province+city+street+doorpalte+unit+'\n';
    }
}