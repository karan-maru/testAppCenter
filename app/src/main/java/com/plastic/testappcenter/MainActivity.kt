package com.plastic.testappcenter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AppCenter.start(
            application, "47b43a63-ef4b-421b-a5fc-d6a83233d0cd",
            Analytics::class.java, Crashes::class.java
        )
    }
}
