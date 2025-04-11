@Entity
public class Perfil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String foto;
    
    @Enumerated(EnumType.STRING)
    private Idioma idioma;
    
    @Enumerated(EnumType.STRING)
    private Tema tema;
    
    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
    
    public enum Idioma {
        PORTUGUES, INGLES, ESPANHOL
    }
    
    public enum Tema {
        AUTOMATICO, CLARO, ESCURO
    }
    
    // Getters e Setters
}
