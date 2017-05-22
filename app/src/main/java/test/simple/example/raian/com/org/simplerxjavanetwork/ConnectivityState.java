package test.simple.example.raian.com.org.simplerxjavanetwork;

/**
 * Created by raian on 5/21/17.
 */

public class ConnectivityState {
    public enum State {
        CONNECTED,
        CONNECTING,
        DISCONNECTED,
        DISCONNECTING,
        SUSPENDED,
        UNKNOWN;

        private State() {
        }
    }
}
