public class RoleAssignment {
    private Person pessoa;
    private Role papel;

    public RoleAssignment(Person pessoa, Role papel) {
        this.pessoa = pessoa;
        this.papel = papel;
    }
    public Person getPessoa() { return pessoa; }
    public Role getPapel() { return papel; }
}
