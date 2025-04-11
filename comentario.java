@Entity
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String texto;
    
    @ManyToOne
    @JoinColumn(name = "tarefa_id", nullable = false)
    private Tarefa tarefa;
    
    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario autor;
    
    // Getters e Setters
}
