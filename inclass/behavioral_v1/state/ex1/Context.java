package behavioral.state.ex1;

/**
 * Created by sasakiumi on 3/4/14.
 */
public interface Context {
    void setClock(int hour);

    void changeState(State state);

    void callSecurityCenter(String msg);

    void recordLog(String msg);
}
