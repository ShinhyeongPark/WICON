/*
현재 연결 가능한 WiFi List를 추출하는 Function
*/

package com.chalkag.WICON;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

class WifiReceiver extends BroadcastReceiver {
    WifiManager wifiManager;
    StringBuilder sb;
    ListView wifiDeviceList;
    List<ScanResult> wifiList;
    public WifiReceiver(WifiManager wifiManager, ListView wifiDeviceList) {
        this.wifiManager = wifiManager;
        this.wifiDeviceList = wifiDeviceList;
    }
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (WifiManager.SCAN_RESULTS_AVAILABLE_ACTION.equals(action)) {
            sb = new StringBuilder();
            wifiList = wifiManager.getScanResults();
            ArrayList<String> deviceList = new ArrayList<>();
            System.out.print("WIFI LIST:");
            System.out.println(wifiList);
        }
    }
}
