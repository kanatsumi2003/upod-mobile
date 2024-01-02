package kotlinx.coroutines.internal;

import a3.u1;
import java.util.List;

public interface MainDispatcherFactory {
    u1 createDispatcher(List<? extends MainDispatcherFactory> list);

    int getLoadPriority();

    String hintOnError();
}
