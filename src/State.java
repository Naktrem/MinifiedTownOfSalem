public interface State {
    boolean canHeal();
    boolean canKill();
    boolean canMurder();
    boolean canInvestigate();
    boolean canProtect();
    boolean canExecute();
    void dayEnd();
    void dayBegin();
}
