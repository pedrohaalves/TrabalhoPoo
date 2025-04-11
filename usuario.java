@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false, unique = true, length = 50)
    @Pattern(regexp = "^[a-z]{4,}$", message = "Username deve conter apenas letras minúsculas e ter no mínimo 4 caracteres")
    private String username;
    
    @Column(nullable = false)
    @Pattern(regexp = "^[a-zA-Z0-9]{8,}$", message = "Senha deve conter apenas letras e números, com no mínimo 8 caracteres")
    private String senha;
    
    @Column(nullable = false, unique = true)
    @Email
    private String email;
    
    @Column(nullable = false)
    private String nomeCompleto;
    
    @OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL)
    private Perfil perfil;
    
    @OneToMany(mappedBy = "usuario")
    private List<Lista> listas = new ArrayList<>();
    
    // Getters e Setters
