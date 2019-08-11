package mindtrack.muslimorganizer.service;

import android.content.Context;
import android.content.Intent;
import androidx.legacy.content.WakefulBroadcastReceiver;

/**
 * Class to set prayers alarms
 */
public class PrayingDayCalculateAlarm extends WakefulBroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        startWakefulService(context, new Intent(context, PrayingDayCalculateHandler.class));
    }


}
