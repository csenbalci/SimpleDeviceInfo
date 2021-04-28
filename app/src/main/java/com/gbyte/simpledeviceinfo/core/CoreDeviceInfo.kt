package com.gbyte.simpledeviceinfo.core

import android.os.Build

class CoreDeviceInfo {
    companion object {
        fun getDevice(): String {
            return Build.DEVICE
        }

        fun getManufacturer(): String {
            return Build.MANUFACTURER
        }

        fun getModel(): String {
            return Build.MODEL
        }
    }
}