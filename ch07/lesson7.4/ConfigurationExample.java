import java.util.Map;

public class ConfigurationExample {
    // TODO: 데이터베이스 설정 레코드를 정의하세요
    // 레코드명: DatabaseConfig
    // 필드: String host, int port, String database, String username, String password, Map<String, String> options
    record DatabaseConfig(
            String host,
            int port,
            String database,
            String username,
            String password,
            Map<String, String> options
    ) {
        // TODO: 연결 URL 생성 메서드를 작성하세요
        // 메서드명: getConnectionUrl
        // "jdbc:mysql://host:port/database?option1=value1&option2=value2" 형태
        public String getConnectionUrl() {
            StringBuilder url = new StringBuilder();
            url.append("jdbc:mysql://").append(host).append(":").append(port).append("/").append(database);

            if (options != null && !options.isEmpty()) {
                url.append("?");
                boolean first = true;
                for (Map.Entry<String, String> entry : options.entrySet()) {
                    if (!first) {
                        url.append("&");
                    }
                    url.append(entry.getKey()).append("=").append(entry.getValue());
                    first = false;
                }
            }

            return url.toString();
        }
    }

    // TODO: 서버 설정 레코드를 정의하세요
    // 레코드명: ServerConfig
    // 필드: int port, String contextPath, int maxConnections, int timeout
    record ServerConfig(int port, String contextPath, int maxConnections, int timeout) {}

    // TODO: 애플리케이션 설정 레코드를 정의하세요
    // 레코드명: AppConfig
    // 필드: String appName, String version, DatabaseConfig database, ServerConfig server, boolean debugMode
    record AppConfig(String appName, String version, DatabaseConfig database, ServerConfig server, boolean debugMode) {}

    public static void main(String[] args) {
        // TODO: 설정 객체들을 생성하세요
        DatabaseConfig dbConfig = new DatabaseConfig(
                "localhost",
                3306,
                "myapp",
                "admin",
                "password",
                Map.of(
                        "useSSL", "false",
                        "serverTimezone", "UTC",
                        "characterEncoding", "UTF-8"
                )
        );

        ServerConfig serverConfig = new ServerConfig(
                8080,
                "/api",
                100,
                5000
        );

        AppConfig appConfig = new AppConfig(
                "MyApplication",
                "1.0.0",
                dbConfig,
                serverConfig,
                true
        );

        // 설정 정보 출력
        System.out.println("=== 애플리케이션 설정 ===");
        System.out.println("앱 이름: " + appConfig.appName());
        System.out.println("버전: " + appConfig.version());
        System.out.println("디버그 모드: " + appConfig.debugMode());

        System.out.println("\n=== 데이터베이스 설정 ===");
        System.out.println("호스트: " + appConfig.database().host());
        System.out.println("포트: " + appConfig.database().port());
        System.out.println("연결 URL: " + appConfig.database().getConnectionUrl());

        System.out.println("\n=== 서버 설정 ===");
        System.out.println("포트: " + appConfig.server().port());
        System.out.println("컨텍스트 경로: " + appConfig.server().contextPath());
        System.out.println("최대 연결 수: " + appConfig.server().maxConnections());
    }
}