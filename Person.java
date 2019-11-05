
public class Person {

    private String cpf;
    private String name;
    private String email;
    private String adress;
    private String mobilePhone;

    public Person (String cpf, String name, 
                    String email, String adress, 
                    String mPhone) {
        this.cpf = cpf;
        this.name = name;
        this.email = email;
        this.adress = adress;
        this.mobilePhone = mPhone;
    }

    public String getName() { return this.name; }
    public void handleName(String name) { this.name = name; }



}


/**
3895

674.3
727.8
950
 
 */