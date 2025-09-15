abstract class LogisticsService {
    protected String serviceName ;

    public LogisticsService(String serviceName) {
        this.serviceName = serviceName ;
    }
    public abstract String getServiceType() ;
}