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
//            System.out.print("DEVICE LIST:");
//            System.out.println(deviceList);
//            for (ScanResult scanResult : wifiList) {
//                sb.append("\n").append(scanResult.SSID).append(" - ").append(scanResult.capabilities);
//                deviceList.add(scanResult.SSID + " - " + scanResult.capabilities);
//            }
//            Toast.makeText(context, sb, Toast.LENGTH_SHORT).show();
//            ArrayAdapter arrayAdapter = new ArrayAdapter(context, android.R.layout.simple_list_item_1, deviceList.toArray());
//            wifiDeviceList.setAdapter(arrayAdapter);
        }
    }
}
