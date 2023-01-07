public class Address
{
    private String city;
    private String country;
    private int houseNo;

    public Address(String city, String country, int houseNo)
    {
        this.city = city;
        this.country = country;
        this.houseNo = houseNo;
    }

    public String getCity(){
        return city;
    }
    public void setCity(String city)
    {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }
    public void setCountry(String country)
    {

        this.country = country;
    }

    public int getHouseNo() {
        return houseNo;
    }
    public void setHouseNo(int houseNo)
    {
        this.houseNo = houseNo;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", houseNo=" + houseNo +
                '}';
    }
}