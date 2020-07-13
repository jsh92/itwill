--sys나 system 계정으로 로그인해서 사용자 생성, 테이블스페이스 생성하기
--sqlplus / as sysdba  ==>시스템dba접속

--테이블 스페이스 생성
create tablespace javatest
datafile 'C:\oraclexe\mydata\javatest.dbf' size 48m
autoextend on next 10m;

/*
--테이블 스페이스 삭제
drop tablespace javatest including contents and datafiles;
*/

--사용자 계정 생성
create user javauser
identified by javauser123
default tablespace javatest;

--사용자 권한부여
grant connect,resource to javauser;

--뷰 생성 권한 부여하기
grant create view to javauser;