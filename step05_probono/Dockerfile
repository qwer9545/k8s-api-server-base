FROM openjdk:17

LABEL authors="kangwonseo"
# 애플리케이션 코드를 컨테이너 내부에 복사할 디렉토리 설정
WORKDIR /app-spring

# 호스트 시스템에서 애플리케이션의 jar 파일을 컨테이너의 /app 디렉토리로 복사
#COPY build/libs/*.jar /app-spring/app.jar
#
#COPY init-container.sh /app-spring/init-container.sh

COPY build/libs/*.jar /app-spring/app.jar

# 3. 컨테이너 시작 시 실행할 명령어
ENTRYPOINT ["java", "-jar", "/app-spring/app.jar"]

# 노출시킬 포트 설정
EXPOSE 8999

# 스크립트 실행 허가
#RUN chmod +x /app-spring/init-container.sh

# 컨테이너 시작 시마다 스크립트가 실행하도록
#CMD ["sh", "/app-spring/init-container.sh"]

# 컨테이너 실행 시 자동으로 Spring Boot 앱 실행
# CMD ["java", "-jar", "app.jar"]
