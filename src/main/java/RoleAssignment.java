public class RoleAssignment {
    private Employee pessoa;
    private Role papel;

    public RoleAssignment(Employee pessoa, Role papel) {
        this.pessoa = pessoa;
        this.papel = papel;
    }
    public Employee getPessoa() { return pessoa; }
    public Role getPapel() { return papel; }
}
