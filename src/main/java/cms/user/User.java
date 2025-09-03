package cms.user;

// A classe 'User' agora é abstrata.
public abstract class User {
    private final int id;
    private final String nome;
    private final String email;
    private final String password;

    // Construtor que as classes filhas chamarão.
    public User(int id, String nome, String email, String password) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.password = password;
    }

    // Métodos que todos os usuários compartilham.
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public boolean checkPassword(String p) {
        return password.equals(p);
    }

    // Método abstrato que cada tipo de usuário implementará de forma diferente.
    // Isso garante o polimorfismo.
    public abstract void doAction();
}
