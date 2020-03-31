// ICallbackFromMainToWeb.aidl
package com.bkw.webview;

// Declare any non-default types here with import statements

interface ICallbackFromMainToWeb {
  void onResult(int responseCode, String actionName, String response);
}
