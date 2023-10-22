package Modelo;

public class Login {
    
    
    //Ver si no influye el hecho de que sea private o public 
    private String user;
    private String password;

    public Login() {
        this.user = "";
        this.password = "";
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
