package com.example.myapplication;

import android.app.Application;
import android.content.Context;
import android.view.View;
import android.widget.EditText;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest extends Application {
    Context context;
    EditText username ,password;
    @Test
    public void useAppContext() {
        // Context of the app under test.
         context = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.example.myapplication", context.getPackageName());
    }

    public void loginName(View view) {
        username=view.findViewById(R.id.name);
        assertNotNull(username);
    }
    public void loginPassword(View view) {
        password=view.findViewById(R.id.password);
        assertNotNull(password);
    }

}