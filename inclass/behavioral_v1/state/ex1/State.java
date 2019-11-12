package behavioral.state.ex1;

/**
 * Created by sasakiumi on 3/4/14.
 */
public interface State {
    void doClock(Context context, int hour);

    void doUse(Context context);

    void doAlarm(Context context);

    void doPhone(Context context);
}
