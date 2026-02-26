package Solves;

public class USER {
    String name;
    String password;
    String email;

    public  USER(String name, String password, String email) {
       this.name = name;
       this.password = password;
       this.email = email;
    }


    public String printUser(String password, String email) {
        return  password + email;
    }

    public String printUser( String email) {
        return email;
    }

    public String printUser(String password, String email, String name) {
        return  password + email + name;
    }

    public void sayHi(String name){
        String welcomeText = "Добро пожаловать на курс,";
        System.out.println(welcomeText + name + "!");
    }


}
