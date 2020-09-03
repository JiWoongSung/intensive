# 주제 - 영화관 매점 주문


# 서비스 시나리오

서비스 시나리오 
- 고객이 간식을 선택하여 SnackBar에 주문한다.
- 주문요청이 성공적으로 들어오면 SnackBar에 고객정보와 함께 알람이 간다. (비동기, 알람서비스)
- snackBar직원은 주문요청 목록을 orderView에서 확인 할수있다. (CQRS)
- 고객은 본인의 주문을 취소할 수 있다.
- 고객이 주문을 취소하면 주문요청이 취소되고 주문요청 목록에서 사라진다. (동기, 주문요청 취소



1. SAGA (X)


2. CQRS (O)

3. Correlation (O)

4. REQ/RES (O)

5. Gateway (O)

6. Deploy (O)

7. Circuit Breaker (X)


8. Autoscale(HPA) (X)


9. readiness probe(zero downtime deployment(X)

#
  readinessProbe:
            httpGet:
              path: '/actuator/health'
              port: 8080
            initialDelaySeconds: 10
            timeoutSeconds: 2
            periodSeconds: 5
            failureThreshold: 10
          livenessProbe:
            httpGet:
              path: '/actuator/health'
              port: 8080
            initialDelaySeconds: 120
            timeoutSeconds: 2
            periodSeconds: 5
            failureThreshold: 5

11. Polyglot (x)


  



