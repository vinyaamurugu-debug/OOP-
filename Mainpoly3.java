class Notifier {

  
    public void send(String msg) {
        System.out.println("General Notification: " + msg);
    }

    
    protected void send(String msg, String email) {
        System.out.println("Email to " + email + ": " + msg);
    }

   
    void send(String msg, int phone) {
        System.out.println("SMS to " + phone + ": " + msg);
    }

    
    private void send(double code) {
        System.out.println("Internal Code: " + code);
    }

    
    public void accessPrivate() {
        send(101.5);
    }
}

class AppNotifier extends Notifier {

    public void testMethods() {
        send("Hello User");
        send("Hello Email", "user@mail.com"); 
        send("Hello SMS", 987654321); // default

        
        accessPrivate(); 
    }
}

public class Mainpoly3{
    public static void main(String[] args) {

        AppNotifier app = new AppNotifier();
        app.testMethods();
    }
}