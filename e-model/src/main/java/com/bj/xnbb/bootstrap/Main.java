package com.bj.xnbb.bootstrap;

import com.bj.xnbb.domain.Request;
import com.bj.xnbb.domain.RequestDomain;
import com.bj.xnbb.handler.Handler;

/**
 * Created by Administrator on 2017/9/22.
 */
public class Main {
    public static void main(String[] args) {
      Request request = new Request();
      Handler.handler(request);
    }
}
