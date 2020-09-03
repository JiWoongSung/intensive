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

5. Gateway

6. Deploy (O)

7. Circuit Breaker 


8. Autoscale(HPA)


9. readiness probe(zero downtime deployment) 
```
HTTP/1.1 500     0.35 secs:     194 bytes ==> POST http://aca85c435d1a94d479d2c5ce91995bea-693040336.ap-northeast-2.elb.amazonaws.com:8080/orders
HTTP/1.1 500     0.13 secs:     194 bytes ==> POST http://aca85c435d1a94d479d2c5ce91995bea-693040336.ap-northeast-2.elb.amazonaws.com:8080/orders
HTTP/1.1 500     0.45 secs:     194 bytes ==> POST http://aca85c435d1a94d479d2c5ce91995bea-693040336.ap-northeast-2.elb.amazonaws.com:8080/orders
^C
Lifting the server siege...
Transactions:		       13398 hits
Availability:		      100.00 %
Elapsed time:		       63.15 secs
Data transferred:	        2.91 MB
Response time:		        0.05 secs
Transaction rate:	      212.16 trans/sec
Throughput:		        0.05 MB/sec
Concurrency:		        9.90
Successful transactions:       13398
Failed transactions:	           0
Longest transaction:	        1.37
Shortest transaction:	        0.00
```



readiness 제외 하고 
```sh
HTTP/1.1 500     0.35 secs:     194 bytes ==> POST http://aca85c435d1a94d479d2c5ce91995bea-693040336.ap-northeast-2.elb.amazonaws.com:8080/orders
HTTP/1.1 500     1.13 secs:     194 bytes ==> POST http://aca85c435d1a94d479d2c5ce91995bea-693040336.ap-northeast-2.elb.amazonaws.com:8080/orders
HTTP/1.1 500     1.11 secs:     194 bytes ==> POST http://aca85c435d1a94d479d2c5ce91995bea-693040336.ap-northeast-2.elb.amazonaws.com:8080/orders
siege aborted due to excessive socket failure; you
can change the failure threshold in $HOME/.siegerc

Transactions:		        1011 hits
Availability:		       49.46 %
Elapsed time:		       22.66 secs
Data transferred:	        0.41 MB
Response time:		        0.22 secs
Transaction rate:	       44.62 trans/sec
Throughput:		        0.02 MB/sec
Concurrency:		        9.78
Successful transactions:        1011
Failed transactions:	        1033
Longest transaction:	        1.97
Shortest transaction:	        0.00
10. ConfigMap/Persistence


```

11. Polyglot


  



