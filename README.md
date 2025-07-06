# 재고시스템으로 알아보는 동시성 이슈 해결방법
- syncronized, Database Lock, Redis Distributed Lock 세 가지를 이용하여 동시성 이슈 해결 방법 알아보기
<br>
<hr>
<br>

## ✔️ mysql for docker
- docker를 이용하여 mysql 사용

- 로컬에서 3306, 3307 포트를 사용중이기에 3308 -> 3306으로 맵핑
```
docker run -d -p 3308:3306 --name mysql -e MYSQL_ROOT_PASSWORD=1234 mysql

docker exec -it mysql bash

bash-5.1# mysql -u root -p
Enter password:
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 9
Server version: 9.3.0 MySQL Community Server - GPL

mysql> create database stock_example;
Query OK, 1 row affected (0.007 sec)

mysql> use stock_example
Database changed
mysql>
```
<br>
<hr>
<br>

**Reference**<br>

[최상용 : 재고시스템으로 알아보는 동시성이슈 해결방법](https://www.inflearn.com/course/%EB%8F%99%EC%8B%9C%EC%84%B1%EC%9D%B4%EC%8A%88-%EC%9E%AC%EA%B3%A0%EC%8B%9C%EC%8A%A4%ED%85%9C/dashboard)
