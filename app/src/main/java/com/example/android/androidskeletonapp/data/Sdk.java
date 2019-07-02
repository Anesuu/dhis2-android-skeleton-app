package com.example.android.androidskeletonapp.data;

import android.content.Context;

import org.hisp.dhis.android.core.D2;
import org.hisp.dhis.android.core.arch.call.internal.D2ProgressManager;
import org.hisp.dhis.android.core.d2manager.D2Configuration;
import org.hisp.dhis.android.core.d2manager.D2Manager;

import java.util.Collections;

import io.reactivex.Single;

public class Sdk {

    public static D2Configuration getD2Configuration(Context context) {
        // TODO Add configuration
        D2Configuration configuration = D2Configuration.builder()
                .appName("Anesuu").appVersion("1.0.0")
                .context(context)
                .readTimeoutInSeconds(30)
                .connectTimeoutInSeconds(30).writeTimeoutInSeconds(30)
                .build();

    return configuration;
    }
}