package com.mdsreactnative;


import androidx.annotation.NonNull;

public interface BleScanListener {

    void onDeviceFound(@NonNull String name, @NonNull String address);
}
