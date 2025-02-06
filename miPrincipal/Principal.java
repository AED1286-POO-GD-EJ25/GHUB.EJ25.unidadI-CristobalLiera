package miPrincipal;

public class Principal {
    public String getGreeting() {
        return "Hi, this is a salute from Codespaces!";
    }

    public static void main(String[] args) {
        Principal principal = new Principal();
        String saludo = principal.getGreeting();
        System.out.println(saludo);

    }
}