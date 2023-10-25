public class Animais {
    private String nome;
    private String classe;
    private String familia;
    private int idade;
    private boolean estado; // vivo = true ou morto = false
    private double peso; // (0 a 100)
    private double forca; // (0 a 100)

    // criar o Construtor para inicializar os valores.
    public Animais(String nome, String classe, String familia, int idade, boolean estado, double peso, double forca) {
        this.nome = nome;
        this.classe = classe;
        this.familia = familia;
        this.idade = idade;
        this.estado = estado;
        this.peso = peso;
        this.forca = forca;
    }

    public Animais(String nome, String classe, String familia, int idade) {
        this.nome = nome;
        this.classe = classe;
        this.familia = familia;
        this.idade = idade;
        this.estado = true;
        this.peso = 0;
        this.forca = 10;
    }

    // criar os getters para podermos acessar os atributos dos animais

    public String getNome() {
        return nome;
    }

    public String getClasse() {
        return classe;
    }

    public String getFamilia() {
        return familia;
    }

    public int getIdade() {
        return idade;
    }

    public boolean isEstado() {
        return estado;
    }

    public double getPeso() {
        return peso;
    }

    public double getForca() {
        return forca;
    }

    public String nasceu() {
        return "O animal se chama " + nome + " é da classe " + classe + " da familia " +
                familia + ". O animal possui força de " + forca + ", caloria de " + peso + " e idade de " + idade;
    }

    // vamos começar a criar nossos métodos que são pedidos no enunciado no
    // exercício: morrer, comer, correr e dormir. Também vou adicionar
    // um método chamado nasceu, para retornar uma String com os dados do
    // animalzinho que foi criado.
    public String morrer() {
        this.forca = 0;
        this.estado = false;
        return "Este animal já está morto";
    }

    public String comer() {
        this.peso += 10;
        this.forca -= 2;
        return "O animal comeu e agora sua força é de " + forca +
                " e suas calorias valem " + peso;

    }

    public String correr() {
        this.forca -= 5;
        this.peso -= 5;

        return "O animal está correndo!! Agora sua força é de " +
                forca + " e suas calorias valem " + peso;

    }

    public String dormir() {
        this.forca += 10;
        this.peso -= 2;

        return "O animal está domingo agora! Sua força aumentou para "
                + forca + " e suas calorias aumentaram para " + peso;
    }
}
