package inspire.railtale;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class NotificationServices extends Service {
    public NotificationServices() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
