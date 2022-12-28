import java.util.ArrayList;

public class EventOrganiser {
    private String CustId;
    private String CustName;

    public String getCustId() {
        return CustId;
    }

    public void setCustId(String custId) {
        CustId = custId;
    }

    public String getCustName() {
        return CustName;
    }

    public void setCustName(String custName) {
        CustName = custName;
    }

    public String getCustAddres() {
        return CustAddres;
    }

    public void setCustAddres(String custAddres) {
        CustAddres = custAddres;
    }

    public String getCustEmail() {
        return CustEmail;
    }

    public void setCustEmail(String custEmail) {
        CustEmail = custEmail;
    }

    public String getCustPhone() {
        return CustPhone;
    }

    public void setCustPhone(String custPhone) {
        CustPhone = custPhone;
    }

    private String CustAddres;
    private String CustEmail;
    private String CustPhone;

    public EventOrganiser(){

    }
    public EventOrganiser(String id, String name, String addres, String email, String phone){
        this.CustId=id;
        this.CustName=name;
        this.CustAddres=addres;
        this.CustEmail=email;
        this.CustPhone=phone;
    }
    public void PrintGuests() {
        System.out.println(this.getCustId());
        System.out.println(this.getCustName());
        System.out.println(this.getCustAddres());
        System.out.println(this.getCustEmail());
        System.out.println(this.getCustPhone());
        System.out.println();
    }
    public void PrintG(ArrayList x) {
        ArrayList<String> tamu = new ArrayList<>();
        System.out.println(tamu.add(CustId));
        System.out.println(tamu.add(CustName));
        System.out.println(tamu.add(CustAddres));
        System.out.println(tamu.add(CustEmail));
        System.out.println(tamu.add(CustPhone));
    }

}
