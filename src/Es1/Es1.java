package Es1;

public class Es1 {

    public static void stringaPariDispari(String parola) {
        if (parola.length() % 2 == 0) {
            System.out.println("La stringa \"" + parola + "\" ha un numero pari di lettere.");
        } else {
            System.out.println("La stringa \"" + parola + "\" ha un numero dispari di lettere.");
        }
    }

    public static void annoBisestile(int anno) {
        if (anno % 4 == 0) {
            if (anno % 100 == 0) {
                if (anno % 400 == 0) {
                    System.out.println(anno + " è bisestile.");
                } else {
                    System.out.println(anno + " non è bisestile.");
                }
            } else {
                System.out.println(anno + " è bisestile.");
            }
        } else {
            System.out.println(anno + " non è bisestile.");
        }
    }

    public static void main(String[] args) {
        stringaPariDispari("ciaoo");
        annoBisestile(1995);
        annoBisestile(2024);
        annoBisestile(1900);
        annoBisestile(2000);
    }
}
