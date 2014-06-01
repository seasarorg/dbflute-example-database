%~d0
cd %~p0

start /b cmd /c .\mysql\bin\mysqld --defaults-file=.\my.cnf -nt
