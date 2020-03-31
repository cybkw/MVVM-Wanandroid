package com.xiangxue.webview;

import com.bkw.webview.ICallbackFromMainToWeb;

interface IWebToMain {
      void handleWebAction(String actionName, String jsonParams, in ICallbackFromMainToWeb callback);
}
