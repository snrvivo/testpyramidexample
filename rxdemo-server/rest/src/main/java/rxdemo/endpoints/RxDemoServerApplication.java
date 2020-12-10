package rxdemo.endpoints;

import spark.servlet.SparkApplication;
//test build 2
public class RxDemoServerApplication implements SparkApplication {
    @Override
    public void init() {
        RxEndpoints.initalizeEndpoints();
    }
}
