public class Admin extends Person
{
    private int AdminId;

    public Admin(int adminId , String name, int age, Address add, String gender)
    {
        super(name, age, add, gender);
        AdminId = adminId;
    }
    public int getAdminId()
    {
        return AdminId;
    }
    public void setAdminId(int adminId)
    {
        AdminId = adminId;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "AdminId=" + AdminId +
                '}';
    }
}