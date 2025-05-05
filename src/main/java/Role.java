public enum Role{
    Director("Diretor"),
    Actor("Ator"),
    CameraOperator("Operador de Câmera"),
    Cinematographer("Cinegrafista"),
    Screenwriter("Roteirista");


    private final String nome;

    Role(String nome){
        this.nome= nome;
    }

    public String getNome() {
        return nome;
    }

}