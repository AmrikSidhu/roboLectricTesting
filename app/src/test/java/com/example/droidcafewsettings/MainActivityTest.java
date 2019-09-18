package com.example.droidcafewsettings;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import static org.junit.Assert.assertEquals;
@RunWith(RobolectricTestRunner.class)

public class MainActivityTest {

    private MainActivity activity;

    @Before
    public void setUp() throws Exception {
        activity = Robolectric.buildActivity(MainActivity.class)
                .create()
                .resume()
                .get();
    }

    //    @Test
//    public void activityIsNotNull() throws Exception {
//        assertNotNull(activity);
//    }
    @Test
    public void toastMessage() throws Exception {
        String toast = this.activity.getString(R.string.froyo_order_message);
        assertEquals("You ordered a FroYo.",toast);
    }

}

